package Geometry_exercice_4;

public class Cercle {
	private Point centre ;
	private double rayon ;
	
	public Cercle ( Point _centre , double _rayon) {
		centre = _centre;
		rayon = _rayon ;
	}
	public double perimetre () {
		double perimetre = 2 *Math.PI* rayon ;
		perimetre = Math.round(perimetre*1000.0)/1000.0;
		return perimetre ;
	}
	public double surface () {
		double surface = (rayon*rayon)*Math.PI ;
		surface = Math.round(surface*1000.0)/1000.0;
		return surface;
	}
	
	public void testAppartenance(double distance) {
		distance = Math.sqrt(ordonne - )
	}
	
	public void afficher() {
		System.out.println("Le perimetre du cercle est : " 
							+ this.perimetre()+"." + 
							"La surface du cercle est : " + 
							this.surface()+".");
	}
}
