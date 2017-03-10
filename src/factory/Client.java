package factory;
/**   
* @Title: Client.java
* @Package factory
* @Description: TODO
* @author zhuy  
* @date 2017年3月10日 下午3:10:01
* @version V1.0   
*/
public class Client {

	 public static void main(String[] args) {
		
		 Factory factory=new Factory();
		 //Product pro= factory.createProduct(ProductA.class);
		 Product pro= factory.createProduct("ProductA");
		 pro.getName();
		 pro.getPrice();
		// pro= factory.createProduct(ProductB.class);
		 pro= factory.createProduct("ProductB");
		 pro.getName();
		 pro.getPrice();
	}
}
