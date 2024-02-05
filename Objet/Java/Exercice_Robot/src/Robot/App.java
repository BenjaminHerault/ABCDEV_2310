package Robot;

public class App {

	public static void main(String[] args) {
		Coordonnees cord = new Coordonnees (-6,-2);
		RoboSpatial bouge = new RoboSpatial();
		
		bouge.Avancer(cord);
		bouge.Recule(cord);
		bouge.Avanceredroite(cord);
		bouge.avancerGauche(cord);

		
	}
}
