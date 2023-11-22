package exercice1_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
			VARIABLES
				nombre1 est un entier
				nombre2 est un entier
				moyenne est un reel
			DEBUT DU PROGRAMME
				Ecrire "Saisir le 1er nombre"
				Lire nombre1
				Ecrire "saisir le 2eme nombre"
		 		nombre2
				moyenne <-- (nombre1 + nombre2)/2d
				Ecrire "La moyenne est :",moyenne
			FIN DU PROGRAMME
*/
	// declaraction des variables	
		int nombre1;
		int nombre2;
		double moyenne;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		
		moyenne = (nombre1 + nombre2)/2d;
		
		System.out.println("Le resultat de la moyenne : " +moyenne);
		
		sc.close();
		
	}

}
