package etats_dune_bouteille;

public class une_bouteille {
	
	private String nom ;
	private final double capaciteEnL ;
	private double liquide ;
	Boolean estOuverte ; 
	
	public boolean ouvrir() {
		if(!estOuverte) {
			estOuverte = true ;
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public boolean fermer () {
		if (estOuverte) {
			estOuverte =false;
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public boolean remplirTout() {
		if (liquide  < capaciteEnL ) {
			liquide = capaciteEnL ;
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public boolean remplir (double quantiteEnL) {
		if (liquide  < capaciteEnL) {
			liquide = liquide+quantiteEnL ;
			return true ; 
		}
		else {
			return false ;
		}
	}
	
	public boolean viderTout() {
		if(estOuverte & liquide > 0) {
			liquide = 0 ;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean vider (double quantiteEnL) {
		if(estOuverte & liquide > 0) {
			liquide = liquide+quantiteEnL;
			return true;
		}
		else {
			return false;
		}
	}
	
	// constructeur par defaut
	
	public une_bouteille() {
		nom = "inconnu";
		capaciteEnL = 0;
		liquide = 0;
		estOuverte = false;
	}
	
	// constructeur avec parametre
	
	public une_bouteille(String _nom, double _apaciteEnL, 
		double _liquide, boolean _estOuverte) {
		
		nom = _nom;
		capaciteEnL = _apaciteEnL ;
		liquide = _liquide;
		estOuverte = _estOuverte;
		
	}
	
}
