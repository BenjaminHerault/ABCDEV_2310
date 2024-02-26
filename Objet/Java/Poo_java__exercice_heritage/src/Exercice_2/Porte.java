package Exercice_2;

public class Porte {

	private String couleur;
	
	public Porte (String _couleur) {
		couleur = _couleur;
	}
	@Override
	public String toString() {
		return "Sa porte est de couleur " + this.couleur;
	}
	// ********** Getters***********+
	public String getCouleur() {
		return couleur;
	}
	// ********** Setters **********
	public void setCouleur(String _couleur) {
		this.couleur = _couleur;
	}
}