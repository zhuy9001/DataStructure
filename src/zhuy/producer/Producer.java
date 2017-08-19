package zhuy.producer;

public class Producer implements Runnable {
	
	private int num;
	
	private PublicResource resource;
	
	public Producer(PublicResource resource) {
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
		resource.increace(num);
	}

}
