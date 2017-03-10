package iteratormode;
/**   
* @Title: DinnerMenu.java
* @Package iteratormode
* @Description: TODO
* @author zhuy  
* @date 2017��2��22�� ����3:22:47
* @version V1.0   
*/
public class DinnerMenu implements Menu {
	static final int MAX_ITEM=10;
	int numberOfItems=0;
	MenuItem[] menuItems;
	public DinnerMenu() {
		menuItems=new MenuItem[MAX_ITEM];
		addItem("��������","��ˮ��",false,12.88);
		addItem("�ཷ����","�óԵ�����",false,12.88);
		addItem("С�������","�óԵ����",true,13.88);
		addItem("�ɹ���","����ļ�",false,11.88);
		addItem("С������","��������",true,12.88);
	}
	public  void addItem(String name, String description, boolean vegetarian, double price) {
		 if(numberOfItems>=MAX_ITEM){
			 System.err.println("�Ѿ������˵��������");
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
