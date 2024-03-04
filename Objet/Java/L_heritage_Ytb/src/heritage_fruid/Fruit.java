package heritage_fruid;

public abstract class Fruit {
	
	private String name;
	
	public Fruit(String _name) {
		this.name = _name;
	}

	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
		
	public void miam() {
		System.out.println("Miam Manger 5 fruits et legumes par jour / Nom de fruit : " + getName());
	}
	
	public String getName() {
		return name;
	}
	
}
