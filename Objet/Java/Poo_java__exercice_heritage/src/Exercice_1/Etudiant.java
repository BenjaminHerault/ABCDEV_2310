package Exercice_1;

public class Etudiant extends Personne {

	private String section ;
	
	public Etudiant () {
		super();
		section = " inconnus";
	}
	public Etudiant (String _nom, String _prenom, int _anneNaissance, String _section ) {
		super (_nom , _prenom , _anneNaissance);
		this.section = _section;
	}
	public String GoToClasses() {
		return this.disBonjour() +"\n"+ "Je m'apelle : " + this.getNom() +" " + this.getPrenom()
								  +"\n"+ this.afficheAge() +" ans"
								  +"\n" + "Je suis en "+ this.section + "Je vais en cours";
	}
	public String afficheAge() {
		return "J'ai " + this.calculAge(anneNaissance) ;
	}
}
