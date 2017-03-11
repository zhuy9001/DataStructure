package adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("WildTurkey a gobble");

	}

	@Override
	public void fly() {
		System.out.println("WildTurkey a fly");

	}

}
