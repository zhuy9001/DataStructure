package iteratormode;

import java.util.ArrayList;
/**
 * @Title: PancakeHouseMenu.java
 * @Package iteratormode
 * @Description: TODO
 * @author zhuy
 * @date 2017��2��22�� ����2:45:09
 * @version V1.0
 */
public class PancakeHouseMenu implements Menu {

	ArrayList<MenuItem> itemMenu;

	public PancakeHouseMenu() {
		itemMenu=new ArrayList<MenuItem>();
		addMenu("������", "�������ü����ζ����", true, 2.88);
		addMenu("�������", "�������ü����ζ����", true, 3.88);
		addMenu("Ѽ˿�������", "Ѽ��˿�����ζ����", true, 5.88);
		addMenu("����˿���", "�������ü����ζ����", true, 2.88);
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
