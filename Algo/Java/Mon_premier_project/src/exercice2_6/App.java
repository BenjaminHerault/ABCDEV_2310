package exercice2_6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		Variables
		nombre est un entier
		i est un entier
		compteur est un entier
	Debut du programme
		Ecrire "Saisir un nombre entier"
		lire nombre
		compteur <-- 0
		Debut boucle pour
		Pour i allant de 2 a nombre-1 
			Debut Si
				Si nombre mod i = 0
				Alors
					Compteur <-- compteur+1
			Fin si
		Fin pour
		
		Debut si
			Si compteur = 0
			Alors
				Ecrire "Le nombre ",nombre," est premier"
			Sinon
				Ecrire "le nombre ",nombre," n'est pas premier"
		Fin si
	Fin du programme
		 */
		
		//declaration des Variables
		int nb ;
		int i ;
		int compteur ; 
		
		Scanner sc = new Scanner(System.in);
		
		//Debus de programmation
		System.out.println("Saisir un nombre entier");
		nb = sc.nextInt();
		compteur = 0;
		//debut de boucle pour 
			for (i=2;i<nb;i++) {
				//debut de si
					if (nb % i == 0) {
						compteur = compteur +1;
					}
				//fin de si
				sc.close();
			}
		//fin de pour 
			//debut de si
				if (compteur ==0) {
					System.out.println("le nombre "+nb+" est premier");
				}
				else {
					System.out.println("Le nombre "+nb+" n'est pas premier");
				}
			// fin de si
		//fin de programmation 
		//sc.close();
	}

}
