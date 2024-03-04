package heritage_fruid;

public class Kiwi extends Fruit implements PeelFruit {

	public Kiwi(String _name) {
		super("Kiwi");
	}

	@Override
	public void taste() {
		System.out.println("Le gout est plutot sucré miam miam");
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		return true;
	}

	@Override
	public String getSkinType() {
		return "doux";
	}

}
