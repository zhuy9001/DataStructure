package factory;
/**   
* @Title: Factory.java
* @Package factory
* @Description: TODO
* @author zhuy  
* @date 2017年3月10日 下午3:07:46
* @version V1.0   
*/
public class Factory extends abstractFactory {

	@Override
	public Product createProduct(String str) {
		Product pro=null;
		if(str==null||str.length()==0){
			return pro;
		}
		
		if(str.equals("ProductA")){
			pro=new ProductA();
		}else if(str.equals("ProductB")){
			pro=new ProductB();
		}
		
		
		return pro;
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public <T extends Product> T createProduct(Class<T> c) {
//		T pro=null;
//		try {
//			pro=(T) Class.forName(c.getName()).newInstance();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return pro;
//	}

}
