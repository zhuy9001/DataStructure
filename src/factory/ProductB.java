package factory;
/**   
* @Title: ProductB.java
* @Package factory
* @Description: TODO
* @author zhuy  
* @date 2017年3月10日 下午3:06:25
* @version V1.0   
*/
public class ProductB implements Product {

	@Override
	public void getPrice() {
		System.out.println("ProductB getPrice ");

	}

	@Override
	public void getName() {
		System.out.println("ProductB getName ");

	}

}
