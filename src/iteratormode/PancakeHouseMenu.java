package iteratormode;

import java.util.ArrayList;
/**
 * @Title: PancakeHouseMenu.java
 * @Package iteratormode
 * @Description: TODO
 * @author zhuy
 * @date 2017Äê2ÔÂ22ÈÕ ÏÂÎç2:45:09
 * @version V1.0
 */
public class PancakeHouseMenu implements Menu {

	ArrayList<MenuItem> itemMenu;

	public PancakeHouseMenu() {
		itemMenu=new ArrayList<MenuItem>();
		addMenu("ºìÊí¼å±ı", "ºìÊí×öµÃ¼å±ı£¬Î¶µÀºÃ", true, 2.88);
		addMenu("¼¦µ°¼å±ı", "¼¦µ°×öµÃ¼å±ı£¬Î¶µÀºÃ", true, 3.88);
		addMenu("Ñ¼Ë¿¼¦µ°¼å±ı", "Ñ¼ÈâË¿¼å±ı£¬Î¶µÀºÃ", true, 5.88);
		addMenu("ÍÁ¶¹Ë¿¼å±ı", "ÍÁ¶¹×öµÃ¼å±ı£¬Î¶µÀºÃ", true, 2.88);
	}

	public void addMenu(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		itemMenu.add(item);
	}

	@Override
	public  java.util.Iterator createIterator() {
		// TODO Auto-generated method stub
		return itemMenu.iterator();
	}


	

}
