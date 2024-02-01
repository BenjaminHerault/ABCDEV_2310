package Robot;

public class RoboSpatial {
	private static String nom ;
	private double abscisserX ;
	private double ordonneeY ;
	private Boolean estVoler;
	private Boolean estRecolte;
	private Boolean estRecharcher;
	private Boolean estPiloter;
	
	public RoboSpatial(){
		nom = "perseverance" ;
		abscisserX = 0.0; 
		ordonneeY = 0.0;
		estVoler =  false ;
		estRecolte = false ;
		estRecharcher = false; 
		estPiloter = false ;
	}
	public RoboSpatial(String _nom ,double _abscisserX , double _ordonneeY , 
						Boolean _estVoler , Boolean _estRecolte , 
						Boolean _estRecharcher , Boolean _estPiloter ) {
		
		nom = _nom ;
		abscisserX = _abscisserX ; 
		ordonneeY = _ordonneeY ;
		estVoler =  _estVoler ;
		estRecolte = _estRecolte ;
		estRecharcher = _estRecharcher ; 
		estPiloter = _estPiloter ;
	}
	
	
}
