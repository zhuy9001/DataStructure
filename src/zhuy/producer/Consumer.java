package zhuy.producer;

public class Consumer implements Runnable {

	
	private int num;
	
	private PublicResource resource;
	
	public Consumer(PublicResource resource) {
		this.resource=resource;
	}
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public PublicResource getResource() {
		return resource;
	}


	public void setResource(PublicResource resource) {
		this.resource = resource;
	}


	@Override
	public void run() {
		resource.decreace(num);
	}

}
