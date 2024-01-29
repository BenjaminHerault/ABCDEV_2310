package exercice_3_rectangle;

public class Rectangle {
	
	private double longueur ;
	private double largeur ;

	
	public Rectangle (double _longueur , double _largeur) {
		this.longueur = _longueur ;
		this.largeur = _largeur ;
	}

	public double surface () {
		double surface = this.largeur*this.longueur;
		return surface ;
	}
	public double perimetre () {
		double perimetre = (this.largeur+this.longueur)*2;
		return perimetre ;
	}
	public void afficher (String leResulta) {
		System.out.println("La surface du rectangle et :  "+this.surface() + 
							". Le perimetre du rectangle et : "
							+this.perimetre()+ "." );
	}
	
}
