package porteDeGarage;

public class App {

	public static void main(String[] args) {
			
		PorteDeGarage PorteDeGarageTestOuvert = new PorteDeGarage(true , false , 0 , 0, 0);
		PorteDeGarage PorteDeGarageTestFerme = new PorteDeGarage(false , false , 0 , 0, 0);
		PorteDeGarage PorteDeGarageTestDeverrouiller = new PorteDeGarage(true , true , 0 , 0, 0);
		PorteDeGarage PorteDeGarageTestVerrouiller = new PorteDeGarage(true , false , 0 , 0, 0);
		PorteDeGarage PorteDeGarageTestOuvrirPartiellement = new PorteDeGarage(true , false , 0 , 0, 100);
		PorteDeGarage PorteDeGarageTestFermerPartiellementFermer = new PorteDeGarage(false , false , 0 , 0, 0);
		
		boolean test1 = PorteDeGarageTestOuvert.ouvrir();
		
		boolean test2 = PorteDeGarageTestFerme.fermer();
		
		boolean test3 = PorteDeGarageTestDeverrouiller.deverrouiller();
		
		boolean test4 = PorteDeGarageTestVerrouiller.verrouiller();
		
		boolean test5 = PorteDeGarageTestOuvrirPartiellement.ouvrirPartiellement(50);
		
		boolean test6 = PorteDeGarageTestFermerPartiellementFermer.fermerPartiellement(50);
		
	}

}
