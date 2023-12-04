package exercice_9_boolean;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//declration des variable
		int jour, mois , annee;
		boolean estBissextille;
		Scanner sc = new Scanner (System.in);
		//debut de programmation 
		System.out.println("Saisir le numero du jour");
		jour = sc.nextInt();
		System.out.println("Saisir le numero du mois");
		mois = sc.nextInt();
		System.out.println("Saisir l'annee");
		annee = sc.nextInt();
		
		estBissextille = (annee%4 == 0 && annee%100 !=0) || annee%400 == 0;
		boolean cas1 = (mois == 1 || mois == 3 || mois == 5 || mois == 8 || mois== 10 || mois == 12) && (jour>=1 &&jour<=31) ;
		boolean cas2 = (mois == 4 || mois == 6 || mois == 9 || mois == 11) && (jour >= 1 && jour >=30);
		boolean cas3 = mois == 2 && estBissextille == true && jour >= 1 && jour <=29;
		boolean cas4 = mois == 2 && jour >=1 && jour <=28 ;
		// debut de si 
			if(cas1 == true || cas2 == true || cas3 == true ||cas4 == true ) {
				System.out.println("Date valide");
			}
			else {
				System.out.println("Date invalide");
			}
		//fin de si	
		sc.close();
		//fin de programmation 
	}

}
