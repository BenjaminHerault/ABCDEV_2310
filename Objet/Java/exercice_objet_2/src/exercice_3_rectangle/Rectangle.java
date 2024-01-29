package exercice_3_rectangle;

public class Rectangle {
	
	private double longueur ;
	private double largeur ;
	private double laSurface ;
	private double lePerimetre ;
	
	public Rectangle (double _longueur , double _largeur) {
		this.longueur = _longueur ;
		this.largeur = _largeur ;
	}
	public void surface () {
		laSurface = this.largeur*this.longueur;
	}
	public void perimetre () {
		lePerimetre = (this.largeur+this.longueur)*2;
	}
	public void afficher (String leResulta) {
		System.out.println("La surface du rectangle et :  "
							+this.laSurface + 
							". Le perimetre du rectangle et : "
							+this.lePerimetre+ "." );
	}
	
}
