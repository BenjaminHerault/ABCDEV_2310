package exercice2_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		Variable
			annee est un entier
		Debut du programme
			Ecrire "saisir une année"
			Lire annee
		Debut Si
			Si annee mod 4 = 0 ET annee mod 100 != 0 OU annee mod 400 = 0 
			Alors
			
				Ecrire "l'annee ",annee," est bisextille"
				
			Sinon
			
				Ecrire "l'annee ",annee," n'est pas bisextille"
		Fin Si
	Fin du programme
	*/
		
		//declaraction des variable
		int annee;
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Saisir une année");
		annee = sc.nextInt();
		
		//debus de si
		if( annee %4==0 && annee%100!=0 || annee%400 == 0 ) {
			System.out.println("l'annee " + annee + " est bisextille");
			}
			else {
				System.out.println("l'annee " + annee + " n'est pas bisextille");
				}
		//fin de si
		sc.close();
		
	}

}
