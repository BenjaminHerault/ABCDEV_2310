package Exercice_1;

import java.util.Calendar;

public class Personne {

	protected String nom ;
	protected String prenom ;
	protected int anneNaissance;
	
	public Personne() {
		nom = "Inconnus";
		prenom = "Inconnus ";
		anneNaissance = 0 ;
	}
	public Personne (String _nom, String _prenom, int _anneNaissance) {
		this.nom = _nom;
		this.prenom = _prenom;
		this.anneNaissance = _anneNaissance;
	}
	
	// ********** Getters***********
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public int getAnneNaissance() {
		return this.anneNaissance;
	}
	
	// ********** Setters **********
	public void setNom(String _nom) {
		this.nom = _nom;
	}
	public void setPrenom(String _prenom) {
		this.prenom = _prenom ;
	}
	public void setAnneNaissance (int _anneNaissance) {
		this.anneNaissance = _anneNaissance ;
	}
	
	public String disBonjour() {
		return "Bonjour ! ! !" ;
	}
	public int calculAge(int anneeCourante) {
		Calendar cal = Calendar.getInstance();
		anneeCourante = cal.get(Calendar.YEAR);
		return anneeCourante - this.anneNaissance;
	}
}
