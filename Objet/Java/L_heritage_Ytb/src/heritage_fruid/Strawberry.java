package heritage_fruid;

public class Strawberry extends Fruit {

	public Strawberry(String _name) {
		super("fraise");
	}

	@Override
	public void taste() {
		System.out.println("Le gout est plutot sucré");
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

}
