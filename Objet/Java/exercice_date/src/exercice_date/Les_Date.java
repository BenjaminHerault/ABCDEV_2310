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
	public boolean bissextile() {
		boolean estBissextile ;
		
		if ((annee %4) == 0 && (annee %100) != 0 || (annee %400) == 0) {
			estBissextile = true ;
		}
		else {
			estBissextile = false ;
		}
		return estBissextile;
	}
	public boolean lesMois () {
		switch(mois) {
		case "
		}
	}
	

}
