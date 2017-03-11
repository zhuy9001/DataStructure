package adapter;

public class testAdapter {

	public static void main(String[] args) {
		Turkey turkey=new WildTurkey();  
		
		Duck  duck=new TurkeyAdapter(turkey);
		duck.fly();
		duck.quack();

	}

}
