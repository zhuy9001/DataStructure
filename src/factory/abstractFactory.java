package factory;
/**   
* @Title: abstractFactory.java
* @Package factory
* @Description: TODO
* @author zhuy  
* @date 2017年3月10日 下午2:58:21
* @version V1.0   
*/
public abstract class abstractFactory {

	//public abstract <T extends Product> T createProduct(Class<T> c);
	
	public abstract Product createProduct(String str);
}
