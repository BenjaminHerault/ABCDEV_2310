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
	

}
