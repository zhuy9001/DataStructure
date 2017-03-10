package iteratormode;
/**   
* @Title: MenuItem.java
* @Package iteratormode
* @Description: TODO
* @author zhuy  
* @date 2017年2月22日 下午2:34:47
* @version V1.0   
*/
public class MenuItem {

	String name;//名称
	String description;//描述
	boolean vegetarian;//是否为素食
	double price;
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public double getPrice() {
		return price;
	}
	
	
	
	
}
