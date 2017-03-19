package zhuy.util.thread;

import java.util.LinkedList;
import java.util.List;
/** 
  * �̳߳��࣬�̹߳������������̣߳�ִ�����������̣߳���ȡ�̻߳�����Ϣ 
  */  
public final class ThreadPool {

	//�̳߳�Ĭ�ϴ�С
	private static int worker_num = 5;

	//�����߳�����
	private WorkThread[] workThread;

	//δ���������
	private static volatile int finised_task = 0;

	//������У���Ϊһ�����壬list�̲߳���ȫ
	private List<Runnable> taskQueue = new LinkedList<Runnable>();

	
	private static ThreadPool threadPool;

	//��������Ĭ���̸߳������̳߳�
	private ThreadPool() {
		this(5);
	}

	//�����̣߳�worker_numΪ�̳߳��еĹ����̸߳���
	private ThreadPool(int worker_num) {

		ThreadPool.worker_num = worker_num;
		workThread = new WorkThread[worker_num];
		for (int i = 0; i < worker_num; i++) {
			workThread[i] = new WorkThread();
			workThread[i].start();//�����̳߳��е��߳�
		}

	}

	//����ģʽ�£����һ��ָ���̸߳������̳߳أ�worker_numΪ�̳߳��еĹ����̸߳���
	public static ThreadPool getThreadPool(int worker_num1) {
		if (worker_num1 <= 0) {
			worker_num1 = ThreadPool.worker_num;
		}
		if (threadPool == null) {
			threadPool = new ThreadPool(worker_num1);
		}
		return threadPool;
	}

	public static ThreadPool getThreadPool() {

		return getThreadPool(ThreadPool.worker_num);
	}

	//ִ�����񣬽��������������У�ʲôʱ��ִ�����̳߳ؾ���
	public void execute(Runnable task) {
			synchronized (taskQueue) {
				taskQueue.add(task);
				taskQueue.notify();
			}
		}
	
	
	
	
	//����ִ�����񣬽��������������У�ʲôʱ��ִ�����̳߳ؾ���
	public void execute(Runnable[] task) {
		synchronized (taskQueue) {
			for (Runnable t : task) {
				taskQueue.add(t);
			}
			taskQueue.notify();
		}
	}
	//����ִ�����񣬽��������������У�ʲôʱ��ִ�����̳߳ؾ���
	public void execute(List<Runnable> task) {
		synchronized (taskQueue) {
			for (Runnable t : task) {
				taskQueue.add(t);
			}
			taskQueue.notify();
		}
	}
	// �����̳߳�,�÷�����֤������������ɵ�����²����������̣߳�����ȴ�������ɲ�����
	public void destroy() {
		while (!taskQueue.isEmpty()) {// �����������ûִ����ɣ�����˯���
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// �����߳�ֹͣ����������Ϊnull 
		for (int i = 0; i < worker_num; i++) {
			workThread[i].stopWorker();
			workThread[i] = null;
		}
		threadPool = null;
		taskQueue.clear();// ���������� 
	}

	
	public int getWorkThreadNumber() {
		return worker_num;
	}

	// �������������ĸ���,������������ֻ����������е�������������ܸ�����û��ʵ��ִ�����  
	public int getFinishedTasknumber() {
		return finised_task;
	}
	// ����������еĳ��ȣ�����û������������
	public int getWaitTasknumber() {
		return taskQueue.size();
	}
//����toString�����������̳߳���Ϣ�������̸߳�����������������  
	@Override
	public String toString() {
		  return "WorkThread number:" + worker_num + "  finished task number:" +finised_task+ "  wait task number:" + getWaitTasknumber();
	}
	
	/**
	 * �ڲ��࣬�����߳� 
	 * @author Administrator
	 *
	 */
	private class WorkThread extends Thread {
		// �ù����߳��Ƿ���Ч�����ڽ����ù����߳�  
		private boolean isRunning = true;

		/**
		 * �ؼ����ڰ������������в��գ���ȡ������ִ�У���������пգ���ȴ� 
		 */
		@Override
		public void run() {
			Runnable r = null;
			while (isRunning) {// ע�⣬���߳���Ч����Ȼ����run���������߳̾�û���� 
				synchronized (taskQueue) {
					while (isRunning && taskQueue.isEmpty()) {// ����Ϊ��  
						try {
							taskQueue.wait(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
					if (!taskQueue.isEmpty())
						r = taskQueue.remove(0);// ȡ������ 
				}
				if (r != null) {
					r.run();// ִ������  
				}
				finised_task++;
				r = null;
			}

		}
		// ֹͣ�������ø��߳���Ȼִ����run��������Ȼ����  
		public void stopWorker() {
			isRunning = false;
		}

	}

}
