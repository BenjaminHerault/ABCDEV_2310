package Geometry_exercice_4;

public class App {

	public static void main(String[] args) {
		Point point = new Point(0, 0) ;
		Cercle cercle = new Cercle (point, 2.5);
		Point pointAaa = new Point(0,2.5);
		
		cercle.afficher();
		cercle.testAppartenance(pointAaa);
		
	}

}
