package Aquarium;

enum Sexe {
	MALE , FEMELLE , HERMAPHODITEAGE, HERMAPHODITEOPPORTUNISTE ;
}
public class Poisson {
	private String nom ;
	private Sexe sexe;
	
	public Poisson() {
		this.nom = "Bob";
		this.sexe = Sexe.FEMELLE ;
	}
	public Poisson(String _nom, Sexe _sexe) {
		this.nom = _nom ;
		this.sexe = _sexe ;
	}
	// ********** Getters***********
	public String getNom() {
		return this.nom;
	}
	public Sexe getSexe() {
		return this.sexe;
	}
	// ********** Setters **********
	public void setNom(String _nom) {
		this.nom = _nom;
	}
	public void setSexe(Sexe _sexe) {
		this.sexe = _sexe;
	}
	
	public String donneNom() {
		return this.nom;
	}
	public Sexe donnerSexe() {
		return this.sexe;
	}
}
