package exercice3_1_jeu_de_la_fourchette;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// declaration des variable 
		int max = 100;
		int min = 0;
		int essai = 1;
		int nbJoueur;
		Scanner sc = new Scanner(System.in);
		// declaation d'un objet random 
		Random random = new Random();
		// generation d'un nombre aleatoire 
		int nbrandom = random.nextInt(100); 
		//Pour afficher le nombre random
		System.out.println(nbrandom);
		System.out.println("Saisr un nombre entre " + min + " et " + max );
		nbJoueur = sc.nextInt();
		// debut boucle 
		while(nbJoueur!=nbrandom) {
			if(nbJoueur>nbrandom) {
				System.out.println("C'est moins ! ! !");
				max = nbJoueur ;
				System.out.println("Saisir un nombre entre " + min + " et " + max );
				nbJoueur = sc.nextInt();
			}
			else if(nbJoueur<nbrandom) {
				System.out.println("C'est plus ! ! !");
				min = nbJoueur ;
				System.out.println("Saisir un nombre entre " + min + " et " + max );
				nbJoueur = sc.nextInt();
			}
			essai += 1;	
		}
		System.out.println("Vous avez Gagner ! En " + essai + " Bravo essayer de faire moins " );
		sc.close();
	}

}
