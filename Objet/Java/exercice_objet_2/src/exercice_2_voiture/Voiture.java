package exercice_2_voiture;

public class Voiture {
	
	private String marque ;
	private double prix ;
	
	public Voiture () {
		this.marque = "inconnus";
		this.prix = 0;
	}
	public Voiture (String _marque , double _prix) {
		this.marque = _marque ;
		this.prix = _prix;
	}
	
	//*****************ACCESSEURS****************\\
	public String getMarque() {
		return this.marque;
	}
	public double getPrix() {
		return this.prix ;
	}
	//*****************Mutateurs*****************\\
	public void setMarque (String pMarque) {
		this.marque= pMarque;
	}
	public void setPrix (double pPrix) {
		this.prix = pPrix; 
	}
	
	
	public void afficher() {
		System.out.println("La marque de votre voiture et : "
							+ this.marque+ " elle coute " + prix + "€");
	}
	
}
