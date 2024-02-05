package Robot;

public class Coordonnees {
	private double abscisseX ;
	private double ordonneeY ;
	
	public Coordonnees (double _abscisseX , double _ordonneeY) {
		this.abscisseX = _abscisseX ;
		this.ordonneeY = _ordonneeY;
	}
	public double getAbscisseX() {
		return abscisseX ;
	}
	public void setAbscisseX(double pAbscisseX) {
		abscisseX = pAbscisseX;
	}
	public double getOrdonneeY () {
		return ordonneeY ;
	}
	public void setOrdonneeY(double pOrdonneeY) {
		ordonneeY = pOrdonneeY ;
	}
	
}


