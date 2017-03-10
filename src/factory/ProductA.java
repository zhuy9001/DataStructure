package factory;
/**   
* @Title: ProductA.java
* @Package factory
* @Description: TODO
* @author zhuy  
* @date 2017年3月10日 下午3:03:00
* @version V1.0   
*/
public class ProductA implements Product {

	@Override
	public void getPrice() {
		System.out.println("ProductA getPrice ");

	}

	@Override
	public void getName() {
		System.out.println("ProductA getName ");

	}

}
