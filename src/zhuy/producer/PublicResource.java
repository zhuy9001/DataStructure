package zhuy.producer;

import java.util.LinkedList;

public class PublicResource {

	private int MAX_SIZE = 100;
	private LinkedList<Object> list = new LinkedList<Object>();
	
	

	public LinkedList<Object> getList() {
		return list;
	}

	public void setList(LinkedList<Object> list) {
		this.list = list;
	}

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}

	public void increace(int num) {
		synchronized (list) {
			while (list.size() + num > MAX_SIZE) {
				System.out.println("��Ҫ�����Ĳ�Ʒ������:" + num + "/t���������:" + list.size() + "/t��ʱ����ִ����������!");
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int i=0;i<num;i++){
				list.add(new Object());
			}
			System.out.println("���Ѿ�������Ʒ����:" + num + "/t���ֲִ���Ϊ��:" + list.size());
			list.notifyAll();
		}

	}
	
	public void decreace(int num) {
		synchronized (list) {
			while (list.size()<num ) {
				System.out.println("��Ҫ���ѵĲ�Ʒ������:" + num + "/t���������:" + list.size() + "/t��ʱ����ִ����������!");
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int i=0;i<num;i++){
				list.remove();
			}
			System.out.println("���Ѿ����Ѳ�Ʒ����:" + num + "/t���ֲִ���Ϊ��:" + list.size());
			list.notifyAll();
		}

	}

}
