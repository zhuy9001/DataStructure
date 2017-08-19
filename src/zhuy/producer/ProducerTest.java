package zhuy.producer;

public class ProducerTest {
	public static void main(String[] args) {

		PublicResource resource=new PublicResource();
		Producer p1=new Producer(resource);
		Consumer c1=new Consumer(resource);
		p1.setNum(20);
		c1.setNum(20);
	     while(true){
	    	 new Thread(p1).start();
	    	 new Thread(c1).start();
	     }
	
		
		
	}

}
