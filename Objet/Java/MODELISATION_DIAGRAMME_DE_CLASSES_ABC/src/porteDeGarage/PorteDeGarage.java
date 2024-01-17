package porteDeGarage;

public class PorteDeGarage {

	// declration des attributs
	
	private boolean estFermer ;
	private boolean estVerrouiller ;
	private boolean estPartiellementOuverte ;
	private double estEnDegre ; 
	
		
	public PorteDeGarage () {
		
		estFermer = false ;
		estVerrouiller = false ;
		estPartiellementOuverte = false ;
		estEnDegre = 0 ;
	}
	public PorteDeGarage( boolean _estFermer , boolean _estVerrouiller, 
						  boolean _estPartiellementOuverte , double _estEnDegre ) {
		
		this.estFermer = _estFermer ;
		this.estVerrouiller = _estVerrouiller ;
		this.estPartiellementOuverte = _estPartiellementOuverte ;
	}
	public boolean ouvrir() {
		if(estFermer & !estVerrouiller) {
			this.estFermer = false ;
			this.estEnDegre = 90 ;
			return true ;
		}
		else {
			return false ;
		}
	}
	public boolean fermer () {
		if (!estFermer & !estVerrouiller ) {
			this.estFermer = true ;
			this.estEnDegre = 0 ;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean deverrouiller() {
		if(estVerrouiller & estFermer) {
			this.estVerrouiller = false ;
			return true ;
		}
		else {
			return false ;
		}
	}
	public boolean verrouiller() {
		if(!estVerrouiller & estFermer ) {
			this.estVerrouiller = true ;
			return false;
		}
		else {
			return true;
		}	
	}
	public boolean ouvrirPartiellement( double degreOuverture) {
		
		double degre = degreOuverture;
		boolean VeriferOuvrir = false;
		double min = 0 ;
		double max = 90;
		
			if (!estFermer & !estVerrouiller ){
				if(degre >= min || degre <= max) {
					this.estPartiellementOuverte = true;
					this.estEnDegre = degreOuverture;
					VeriferOuvrir = true ;
				}
				else if  ( degre == min || degre == max) {
					this.estPartiellementOuverte = false ;
					}
				else {
					VeriferOuvrir = false;
				}
			}
			return VeriferOuvrir; 
	}
	
}
