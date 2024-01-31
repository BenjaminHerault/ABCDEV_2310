package Geometry_exercice_4;

public class Cercle {
	private Point centre ;
	private double rayon ;
	
	public Cercle ( Point _centre , double _rayon) {
		centre = _centre;
		rayon = _rayon ;
	}
	public double perimetre () {
		double perimetre = 2 *Math.PI* this.rayon ;
		perimetre = Math.round(perimetre*1000.0)/1000.0;
		return perimetre ;
	}
	public double surface () {
		double surface = (this.rayon*this.rayon)*Math.PI ;
		surface = Math.round(surface*1000.0)/1000.0;
		return surface;
	}
	public void testAppartenance(Point _point) {
		double distance = Math.sqrt(Math.pow((_point.getAbscisse()
						 -this.centre.getAbscisse()),2) + 
						  Math.pow((_point.getOrdonnee()
						 -this.centre.getOrdonnee()),2));
		if (distance == this.rayon) {
			System.out.println("Le point A appartien au cercle !");
		}
		else {
			System.out.println("Le point A n'appartien pas au cercle ! ! !");
		}
	}
	public void afficher() {
		System.out.println("Le perimetre du cercle est : " 
							+ this.perimetre()+"." + 
							"La surface du cercle est : "  
							+this.surface()+".");
	}
}
