package exercice_1_compte;

public class Compte {
	
	// declaraction des attributs
	private double solde;

	
	public Compte (double _solde) {
		System.out.println("votre compte est ouvert");
		this.solde = _solde ;
	}
	public void deposer(double sommeAjouter) {
		this.solde =this.solde + sommeAjouter  ;
	}
	public void retirer (double sommeRetirer) {
		if(this.solde >= sommeRetirer) {
			this.solde = this.solde-sommeRetirer;
		}
		else {
			System.out.println("Valeur invalite vous avez pas asser de solde");
		}
	}
	public void afficher () {
		this.solde = Math.round(this.solde*100.0)/100.0;
		System.out.println ("le solde est : " +this.solde + "€");
	}
	
}
