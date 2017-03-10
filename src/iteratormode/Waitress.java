package iteratormode;

import java.util.Iterator;

/**
 * @Title: Waitress.java
 * @Package iteratormode
 * @Description: TODO
 * @author zhuy
 * @date 2017年2月23日 上午9:30:12
 * @version V1.0
 */
public class Waitress {
	Menu dinnerMenu;
	Menu pancakeHouseMenu;

	public Waitress(Menu dinnerMenu, Menu pancakeHouseMenu) {
		super();
		this.dinnerMenu = dinnerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}

	public void printMenu() {
		Iterator dinnerMenuIterator =  dinnerMenu.createIterator();
		Iterator pancakeHouseIterator =pancakeHouseMenu.createIterator();
		printMenu(dinnerMenuIterator);
		printMenu(pancakeHouseIterator);
	}

	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println("菜单名称:" + item.getName() + "  价格:" + item.getPrice() + "  描述:" + item.getDescription());
		}
	}

	 public static void main(String[] args) {
		 Menu menu= new DinnerMenu();
		 Menu menu2= new PancakeHouseMenu();
		new Waitress(menu, menu2).printMenu();;
	}
}
