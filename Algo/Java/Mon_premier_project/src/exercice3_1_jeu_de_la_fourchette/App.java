package exercice3_1_jeu_de_la_fourchette;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		VARIABLES
			nombre est un entier
			nbJoueur est un entier
			max est un entier
			min est un entier
			essai est un entier
			win est un boolean
		
		DEBUT DU PROGRAMME
			nombre <-- est genere aleatoirement
			essai = 0
			win = false
			min = 0
			max = 100
		Debut boucle pour i = nbrandom
		Faire
			Ecrire "Saisir un nombre entre ",min," et ",max
			Lire nbJoueur
			
			Debut si
				si nbJoueur est superieur à nombre
				Alors 
				      Ecrire "C'est moins !!!"
				      max <-- nbJoueur 
				sinon si nbJoueur est inferieur à nombre
				      Ecrire"C'est plus !!!"
				      min <-- nbJoueur 
				sinon
				      win <-- vrai
			Fin Si
			essai <-- essai+1
		Tant que win = faux
			Ecrire "Bravo, vous avez trouve en", essai,  " essais "
		Fin du programme
		*/
		
		// declaration des variable 
		int max = 100;
		int min = 0;
		int essai = 0;
		
		int win;
		
		int i = 1;
		// declaation d'un objet random 
		Random random = new Random();
		
		int nbJoueur;
		// generation d'un nombre aleatoire 
		int nbrandom = random.nextInt(100)+1; 
		System.out.println(nbrandom);
		// debut boucle 
		
		while(i<=nbrandom); 
			
		
		
	}

}
