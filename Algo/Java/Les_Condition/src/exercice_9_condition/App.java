package exercice_9_condition;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//declaration des variable 
		int jour,mois,annee;
		//boolean jourValide ;
		//boolean moisValide;
		//boolean bissextille;
		
		//debut de programmation
			Scanner sc = new Scanner(System.in);
			System.out.println("Saisir le numero du jour");
			jour = sc.nextInt();
			System.out.println("Saisir le numero du mois");
			mois = sc.nextInt();
			System.out.println("Saisir l'annee");
			annee = sc.nextInt();			
			//debut de si
				if(mois <1 || mois > 12) 
				{
					System.out.println("Date invalite");
				}
				else if (mois == 2) {	
				//debut de si 
					if(annee%400==0) {
						//debut de si
							if(jour < 1 || jour >29) {
								System.out.println("Date invalide");
							}
							else {
								System.out.println("Date valide");
							}
					}
						//fin de si
					else if ( annee%100==0) {
						//debut de si 
							if (jour < 1 || jour > 28) {
								System.out.println("Date invalide");
							}
							else {
								System.out.println("Date valide");
							}
						//fin de si
					}
				//fin de si 	
				}
				else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
					//debut de si 
						if(jour <1 || jour > 31) {
							System.out.println("Date invalide");
						}
						else {
							System.out.println("Date valide");
						}
					//fin de si
				} 
				else {
					//debut de si
						if(jour < 1 || jour > 31 ) {
							System.out.println("Date invalide");
						}
						else {
							System.out.println("Date valide");
						}
					// fin de si
				}
			// fin de si	
				sc.close();
	}
			

}