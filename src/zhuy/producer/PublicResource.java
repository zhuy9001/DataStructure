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
				System.out.println("【要生产的产品数量】:" + num + "/t【库存量】:" + list.size() + "/t暂时不能执行生产任务!");
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
			System.out.println("【已经生产产品数】:" + num + "/t【现仓储量为】:" + list.size());
			list.notifyAll();
		}

	}
	
	public void decreace(int num) {
		synchronized (list) {
			while (list.size()<num ) {
				System.out.println("【要消费的产品数量】:" + num + "/t【库存量】:" + list.size() + "/t暂时不能执行消费任务!");
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
			System.out.println("【已经消费产品数】:" + num + "/t【现仓储量为】:" + list.size());
			list.notifyAll();
		}

	}

}
