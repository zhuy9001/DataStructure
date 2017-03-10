package iteratormode;
/**   
* @Title: MenuItem.java
* @Package iteratormode
* @Description: TODO
* @author zhuy  
* @date 2017��2��22�� ����2:34:47
* @version V1.0   
*/
public class MenuItem {

	String name;//����
	String description;//����
	boolean vegetarian;//�Ƿ�Ϊ��ʳ
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
