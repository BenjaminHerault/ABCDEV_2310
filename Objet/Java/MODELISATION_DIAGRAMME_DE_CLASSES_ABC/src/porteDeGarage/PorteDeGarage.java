package porteDeGarage;

public class PorteDeGarage {

	// declration des attributs
	
	private boolean estFermer ;
	private boolean estVerrouiller ;
	private double estEnPourcent ; 
	private final double min ;
	private final double max ;

	public PorteDeGarage () {
		
		estFermer = false ;
		estVerrouiller = false ;
		estEnPourcent = 0 ;
		min = 0;
		max = 100;
	}
	public PorteDeGarage( boolean _estFermer , boolean _estVerrouiller, 
						  double _estEnPourcent ,double _min , double _max) {
		
		this.estFermer = _estFermer ;
		this.estVerrouiller = _estVerrouiller ;
		this.estEnPourcent = _estEnPourcent;
		this.min = _min;
		this.max = _max ;
	}
	public boolean ouvrir() {
		if(estFermer & !estVerrouiller) {
			this.estFermer = false ;
			this.estEnPourcent = max ;
			return true ;
		}
		else {
			return false ;
		}
	}
	public boolean fermer () {
		if (!estFermer & !estVerrouiller ) {
			this.estFermer = true ;
			this.estEnPourcent = min ;
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

		if(!estVerrouiller && estEnPourcent < degreOuverture) {
			estEnPourcent = degreOuverture ;
			if (degreOuverture > min ) {
				this.estFermer = false ;
			}
			return true ;
		}
		else {
			return false ;
		}

	}
	public boolean fermerPartiellement( double degreDeFermer) {
		if(!estVerrouiller && estEnPourcent > degreDeFermer) {
			estEnPourcent = degreDeFermer ;
			if (degreDeFermer > min ) {
				this.estFermer = false ;
			}
			return true ;
		}
		else {
			return false ;
		}
}
		
}

