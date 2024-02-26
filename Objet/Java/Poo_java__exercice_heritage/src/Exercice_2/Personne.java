package Exercice_2;

public class Personne {

	private String nom;
	private Maison uneMaison;
	
	public Personne (String _nom, Maison _uneMaison) {
		this.nom = _nom ;
		this.uneMaison = _uneMaison;
	}
	
	@Override
	public String toString() {
		return "Je m'appelle " + this.nom + "\n"
				+ this.uneMaison.toString()
				+"\n"+ this.uneMaison.unePorte.toString();
	}
	
	
	
}