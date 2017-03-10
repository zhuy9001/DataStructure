package iteratormode;
/**   
* @Title: DinnerMenu.java
* @Package iteratormode
* @Description: TODO
* @author zhuy  
* @date 2017年2月22日 下午3:22:47
* @version V1.0   
*/
public class DinnerMenu implements Menu {
	static final int MAX_ITEM=10;
	int numberOfItems=0;
	MenuItem[] menuItems;
	public DinnerMenu() {
		menuItems=new MenuItem[MAX_ITEM];
		addItem("红烧鲫鱼","淡水鱼",false,12.88);
		addItem("青椒炒肉","好吃的辣椒",false,12.88);
		addItem("小炒油麦菜","好吃的青菜",true,13.88);
		addItem("干锅鸡","不错的鸡",false,11.88);
		addItem("小炒菜心","不错的青菜",true,12.88);
	}
	public  void addItem(String name, String description, boolean vegetarian, double price) {
		 if(numberOfItems>=MAX_ITEM){
			 System.err.println("已经超出菜单最大数！");
		 }else{
			 MenuItem item=new MenuItem(name, description, vegetarian, price); 
			 menuItems[numberOfItems]=item;
			 numberOfItems++;
		 }
	}
	
	public java.util.Iterator createIterator(){
		return new DinnerMenuIterator(menuItems);
	}
	
	
	

}
