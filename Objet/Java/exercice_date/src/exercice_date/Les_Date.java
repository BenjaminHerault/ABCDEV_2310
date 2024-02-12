package exercice_date;

public class Les_Date {
	
	private int jour, mois, annee;
	private boolean estValide;
	private static String[]  mois1 = {"Janvier","Février","Mars","Avril",
										"Mai","Juin","Juillet","Aout",
										"Septembre","Octobre","Novembre","Décembre"};
	private static String moisEnCours;
	
	public Les_Date(int _jour, int _mois, int _annee) {
		this.jour = _jour;
		this.mois = _mois;
		this.annee = _annee;
		this.estValide = NbJours();
	}
	public int getJour() {
		return this.jour;
	}
	public void setJour(int pJour) {
		this.jour = pJour;
	}
	public int getMois() {
		return this.mois;
	}
	public void setMois(int pMois) {
		this.mois = pMois;
	}
	public int getAnnee() {
		return this.annee;
	}
	public void setAnnee(int pAnnee) {
		this.annee = pAnnee;
	}
	//transformer les nummero du mois en lettre 
	public boolean transformerNbLettre () {
		if(this.mois <= 12) {
			moisEnCours = mois1[this.mois-1];
			return true ;
		}
		else {
			this.estValide = false;
			return false;
		}
	}
	//verifier que le mois a 31 ou 30 jours et 29 si annee bissextille
	public boolean NbJours() {
		boolean mois31 , mois30, estBissextille , mois29, mois28;
		
		estBissextille=(this.annee %4) == 0 && (this.annee %100) != 0 || (this.annee %400) == 0;
		
		mois31 = (this.mois == 1 || this.mois == 3 || this.mois == 5 || this.mois == 8 || 
				  this.mois == 10 || this.mois == 12) && (this.jour >= 1 && this.jour <= 31);
		
		mois30 = (this.mois == 4 || this.mois == 6 || this.mois == 9 || 
				  this.mois == 11) && (this.jour >= 1 && this.jour <= 30);
		
		mois29 = this.mois == 2 && estBissextille && jour >=1 && jour <=29;
		
		mois28 = this.mois == 2 && this.jour >= 1 && this.jour <= 28;

		if(mois31 || mois30 || mois29 || mois28 ) {
			estValide = true ;
		}
		else {
			estValide = false;
		}
		return estValide;
	}
	public static String afficher(Les_Date _date) {
		String date = "";
		if(_date.NbJours() && _date.transformerNbLettre()) {
			date = Integer.toString(_date.jour)+" " + moisEnCours+" " + Integer.toString(_date.annee);
			return date;
		}
		else {
			date = Integer.toString(_date.jour)+" " + moisEnCours+" " + Integer.toString(_date.annee)+" n'est pas une date valide";
			return date ;
		}
	}
	public boolean comparer(Les_Date _date) {
		if (this.estValide && _date.estValide) {
			if (this.jour <= _date.jour && this.mois <= _date.mois && this.annee <= _date.annee ) {
				return true; 
			}
			else {
				return false;
			}
		}
		else {
			return false ;
		}
	}
}
