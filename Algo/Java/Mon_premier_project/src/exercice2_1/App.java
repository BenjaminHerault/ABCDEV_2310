package exercice2_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		VARIABLES
			age est un entier
		Debut du programme
			Ecrire "Quel est votre age ?"
			Lire age
			Debut Si
				Si age >= 18
			Alors
				Ecrire "Vous êtes majeur"
			Sinon Si age < 0 
				Alors
					Ecrire "Vous n'êtes pas encore né"
			Sinon
				Ecrire "Vous êtes mineur"
		Fin Si
	Fin du programme
		 */
		
		//Declaration des variable
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quel est votre age ? ");
		age = sc.nextInt();
		
		if(age >= 18){
			System.out.println("Vous êtes majeur vous avez " +age);
		}
		else if(age <= 0){
			System.out.println("vous n'êtes pas encore né ");
		}
		else {
			System.out.println("Vous étes mineur votre age et : "+age);
		}
		
		sc.close();
		
	}

}
