package etats_dune_bouteille;

public class App {
	
	public static void main(String[] args) {
		
		double quantiteEnL = 1.5;

		une_bouteille bouteille1 = new une_bouteille();
		
		une_bouteille bouteille2 = new une_bouteille("Badoit",1.5,0.5,false);
		
		une_bouteille bouteille3 = new une_bouteille("Badoit",2.5,1,true);
		une_bouteille bouteille4 = new une_bouteille("Badoit",2.5,1,false);
		une_bouteille bouteille5 = new une_bouteille("Badoit",2.5,1,true);
		
		une_bouteille bouteille6 = new une_bouteille("Badoit",2.5,0.5,true);
		
		
		une_bouteille bouteille7 = new une_bouteille("Badoit",2.5,0.5,true);
		une_bouteille bouteille8 = new une_bouteille("Badoit",2.5,0.5,false);
		
		une_bouteille bouteille9 = new une_bouteille("Badoit",2.5,0.5,true);
		une_bouteille bouteille10 = new une_bouteille("Badoit",2.5,0.5,false);
		
		
		boolean test1 = bouteille1.ouvrir();
		test1 = bouteille1.ouvrir();
		
		boolean test2 = bouteille2.fermer();
		test2 = bouteille2.fermer();
		
		boolean test3 = bouteille3.remplirTout();
		test3 = bouteille3.remplirTout();
		boolean test4 = bouteille4.remplirTout();
		test4 = bouteille4.remplirTout();
		boolean test5 = bouteille5.remplirTout();
		test5 = bouteille5.remplirTout();
		
		
		boolean test6 = bouteille6.remplir(quantiteEnL);
		test6 = bouteille6.remplir(quantiteEnL);
		
		boolean test7 = bouteille7.viderTout();
		test7 = bouteille7.viderTout();
		boolean test8 = bouteille8.viderTout();
		test8 = bouteille8.viderTout();
		
		boolean test9 = bouteille9.vider(quantiteEnL);
		test9 = bouteille9.vider(quantiteEnL);
		boolean test10 = bouteille10.vider(quantiteEnL);
		test10 = bouteille10.vider(quantiteEnL);
	}

}
