package exercice_date;

public class Les_Date {
	
	private int jour, mois, annee;
	private boolean estValide;
	private static String[]  mois1 = {"Janvier","Février","Mars","Avril",
										"Mai","Juin","Juillet","Aout",
										"Septembre","Octobre","Novembre","Décembre"};
	
	public Les_Date() {
		this.jour = 1;
		this.mois = 1;
		this.annee = 1;
		this.estValide = true;
	}
	public Les_Date(int _jour, int _mois, int _annee, boolean _estValide) {
		this.jour = _jour;
		this.mois = _mois;
		this.annee = _annee;
		this.estValide = _estValide;
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
	
	public void lesMois () {
		if(this.mois <= 12) {
			String moisEnCours = mois1[this.mois-1];
			System.out.println(this.mois +" = " + moisEnCours);
		}
		else {
			this.estValide = false;
		}
	}
	
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
	

}
