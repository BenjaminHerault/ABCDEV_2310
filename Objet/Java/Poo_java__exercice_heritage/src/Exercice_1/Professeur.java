package Exercice_1;

public class Professeur extends Personne {

	private String sujet ;
	
	public Professeur () {
		super();
		sujet = "inconnus";
	}
	public Professeur (String _nom, String _prenom, int _anneNaissance , String _sujet) {
		super (_nom , _prenom , _anneNaissance);
		this.sujet = _sujet;
	}
	public String cours () {
			return "\n"+ super.disBonjour() +"\n"+ "Je m'apelle : " + super.getNom() +" " + super.getPrenom()
									  +"\n"+"j'ai "+ super.calculAge(anneNaissance) +" ans"
									  +"\n"+ "Je suis professeur de "+ this.sujet 
									  + "\n" + "Le cours va commencer";
	}
}
