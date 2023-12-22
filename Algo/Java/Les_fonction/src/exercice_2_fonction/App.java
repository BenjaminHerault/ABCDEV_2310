package exercice_2_fonction;

import java.util.Scanner;

public class App {
	
	public static int compteur (String mot) {
		int compteur =0;
		
		for(int j = 0; j<= mot.length()-1;j++) {
			if( mot.charAt(j)=='a'||
				mot.charAt(j)=='A'||
				mot.charAt(j)=='e'||
				mot.charAt(j)=='E'||
				mot.charAt(j)=='u'||
				mot.charAt(j)=='U'||
				mot.charAt(j)=='i'||
				mot.charAt(j)=='I'||
				mot.charAt(j)=='o'||
				mot.charAt(j)=='O'||
				mot.charAt(j)=='y'||
				mot.charAt(j)=='Y') {
				
				compteur = compteur +1;
			}
		}
		return compteur;
	}

	public static void main(String[] args) {
		int compteur;
		String mot;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un mot ou une phare");
		mot = sc.nextLine();
		compteur = compteur (mot);
		
		System.out.println("Il a " + compteur + " voyelle");
		
		sc.close();
	}

}
