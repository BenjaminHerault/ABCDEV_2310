package exercice_2_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 Variable 
			nb est un entier 
			compteur est un entier 
		Debus de programmation
			Nb <--0
			Compteur <-- 0 
		Debus de tant que nb <10 OU nb >20
			Afficher ‘’Saisir un nombre’’
			Ecrire nb
			Compteur prend +1
		Debus de si
			Si nb <10
				Afficher ‘’ Plus grand !’’
				Ecrire ‘’ saisir un nombre ‘’
				Afficher nb
			Sinon 
				Afficher ‘’ Plus petit ! ‘’
				Ecrire ‘’ saisir un nombre ‘’
				Afficher nb
			Fin de si
				Afficher ‘’ Vous avez gagné ‘’
				Afficher ‘’ vous avez réussi’’ ,compteur 
		Fin de programmation 	
		*/
		
		//Declaration des variable 
		int nb = 0 ;
		int compteur = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		while(nb <10 || nb >20) {
			System.out.println("Saisir un nombre");
			nb = sc.nextInt();
			compteur = +1 ;
			if(nb < 10) {
				System.out.println("Plus grand ! ");
			}
			else{
				System.out.println("Plus petit");
		}
			System.out.println("vous avez gagné");
			System.out.println("Vous avez réussi " +compteur);
			
			sc.close();
		
		}
	}
}
