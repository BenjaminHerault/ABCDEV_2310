package Robot;

public class RoboSpatial {
	private final String nom ;
	private double abscisseXBase ;
	private double ordonneeYBase ;
	private boolean estVoler;
	private boolean estRecolte;
	private boolean estRecharcher;
	private boolean estPiloter;
	
	public RoboSpatial(){
		this.nom = "perseverance" ;
		this.abscisseXBase = 0;
		this.ordonneeYBase = 0;
		this.estVoler =  false ;
		this.estRecolte = false ;
		this.estRecharcher = false; 
		this.estPiloter = false ;
	}
	public RoboSpatial(String _nom, double _abscisseXBase, 
			double _ordonneeYBase, Boolean _estVoler, 
						Boolean _estRecolte, Boolean _estRecharcher, 
						Boolean _estPiloter ){
		this.nom = _nom ;
		this.abscisseXBase = _abscisseXBase ;
		this.ordonneeYBase = _ordonneeYBase ;
		this.estVoler =  _estVoler ;
		this.estRecolte = _estRecolte ;
		this.estRecharcher = _estRecharcher ; 
		this.estPiloter = _estPiloter ;
	}
	//pour faire avancer le robot
	public boolean Avancer(Coordonnees _Coordonnees){
		if(this.ordonneeYBase <= _Coordonnees.getOrdonneeY()&& this.estPiloter && estRecharcher ) {
			this.ordonneeYBase = _Coordonnees.getOrdonneeY();
			return true ;
		}
		else {
			return false;
		}
	}
	//pour faire recule le robot
	public boolean Recule(Coordonnees _Coordonnees){
		if(this.ordonneeYBase >= _Coordonnees.getOrdonneeY()&& this.estPiloter && estRecharcher ) {
			this.ordonneeYBase = _Coordonnees.getOrdonneeY();
			return true;
		}
		else {
			return false;
		}
	}
	//pour faire avancer le robot a droite
	public boolean Avanceredroite(Coordonnees _Coordonnees){
		if(this.abscisseXBase <= _Coordonnees.getAbscisseX()&& this.estPiloter && estRecharcher ) {
			this.abscisseXBase = _Coordonnees.getAbscisseX();
			return true;
		}
		else {
			return false;
		}
	}
	//pour faire avancer le robot a gauche 
	public boolean avancerGauche(Coordonnees _Coordonnees){
		if(this.abscisseXBase >= _Coordonnees.getAbscisseX()&& this.estPiloter && estRecharcher ) {
			this.abscisseXBase = _Coordonnees.getAbscisseX();
			return true;
		}
		else {
			return false;
		}
	}
	public boolean OnPiloter() {
		if (!this.estPiloter) {
			this.estPiloter = true;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean Recharcher() {
		if(!this.estRecharcher) {
			this.estRecharcher=true;
			return true ;
		}
		else
			return false;
	}
	// a travailler 
	public boolean Recolte () {
			if (!this.estRecolte) {
				this.estRecolte= true;
				return true;
			}	
			else {
				return false;
			}
	}	
}
