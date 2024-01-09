package exercice_3_fonction;

import java.util.Scanner;

public class App {
	
	public static String purge(String chaine, String lettre){
		String chainePurger = "";
		char lettreChar = lettre.charAt(0);
		
		for(int i = 0; i < chaine.length();i++){
			if(chaine.charAt(i) != lettreChar){
				chainePurger = chainePurger + chaine.charAt(i);
			}
		}
		return chainePurger;
	}

	public static void main(String[] args) {
		
		String chaineSaisie, lettreSaisie;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisr un mot ou une prhase");
		chaineSaisie = sc.nextLine();
		System.out.println("Saisr une lettre");
		lettreSaisie = sc.nextLine();
		
		System.out.println(purge(chaineSaisie,lettreSaisie));
		
		sc.close();

	}

}