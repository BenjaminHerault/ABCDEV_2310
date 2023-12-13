package exercice_2_tableaux;

public class App {

	public static void main(String[] args) {
		// Ecrire un algorithme qui déclare et remplit un tableau 
		// contenant les six voyelles de l’alphabet latin.
		// A, E, I, O, U, Y
		
		char[] tabVoy = new char[6];
		tabVoy[00]=  'A';
		tabVoy[01]=  'E';
		tabVoy[02]=  'I';
		tabVoy[03]=  'O';
		tabVoy[04]=  'U';
		tabVoy[05]=  'Y';
		
		System.out.println("Les six voyelles de l'alphabet latin sont :" +"\n\n");
		
		for (char tabVoy1 : tabVoy) {
			System.out.println("\t\t" + tabVoy1+"\n"+"");
		}
	}
}
