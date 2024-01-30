package Geometry_exercice_4;

public class Point {
	private double abscisse ;
	private double ordonnee ;
	
	public Point (double _abscisse , double _ordonnee) {
		this.abscisse = _abscisse ;
		this.ordonnee = _ordonnee;
	}
	public double getAbscisse() {
		return abscisse ;
	}
	public void setAbscisse(double pAbscisse) {
		abscisse = pAbscisse;
	}
	public double getOrdonnee () {
		return ordonnee ;
	}
	public void setOrdonnee(double pOrdonnee) {
		ordonnee = pOrdonnee ;
	}
	
}
