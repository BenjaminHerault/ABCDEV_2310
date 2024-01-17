package porteDeGarage;

public class App {

	public static void main(String[] args) {
			
		PorteDeGarage PorteDeGarageDefaut = new PorteDeGarage();
		PorteDeGarage PorteDeGarageRef = new PorteDeGarage(false , false , true , 0);
		
		//boolean test1 = PorteDeGarageRef.ouvrir();
		
		//boolean test2 = PorteDeGarageRef.fermer();
		
		//boolean test3 = PorteDeGarageRef.deverrouiller();
		
		//boolean test4 = PorteDeGarageRef.verrouiller();
		
		boolean test5 = PorteDeGarageRef.ouvrirPartiellement(50);
		
	}

}
