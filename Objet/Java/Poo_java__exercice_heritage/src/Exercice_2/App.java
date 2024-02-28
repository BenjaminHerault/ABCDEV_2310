package Exercice_2;

public class App {

	public static void main(String[] args) {
		
		Maison test = new Maison(200) ;
		test.getPorte().setCouleur("Vert");
		Personne test3 = new Personne ("Benj", test);
		
		
		Appartement test4 = new Appartement();
		test4.getPorte().setCouleur("bleu clair");
		Personne test5 = new Personne("Lucas" ,test4);
		
		
		

		//System.out.println(test.toString());
		System.out.println(test3.toString());
		System.out.println(test5.toString());
		
	}

}