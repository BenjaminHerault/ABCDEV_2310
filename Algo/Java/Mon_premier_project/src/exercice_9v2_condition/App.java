package exercice_9v2_condition;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//declaration des variable 
		int jour,mois,annee,jourMax;
		boolean jourValide = false ;
		boolean moisValide = false;
		boolean bissextille;
		
		//debut de programmation
			Scanner sc = new Scanner(System.in);
			System.out.println("Saisir le numero du jour");
			jour = sc.nextInt();
			System.out.println("Saisir le numero du mois");
			mois = sc.nextInt();
			System.out.println("Saisir l'annee");
			annee = sc.nextInt();
				
					
			bissextille = annee%400 == 0 || (annee%100 != 0 && annee%4 == 0);
			jourMax = 0;
			moisValide = mois >=1 && mois <= 12 ;
				//debut de si
					if(moisValide){
						//debut de si
						if(mois==2 && bissextille){
							jourMax = 29;
							}
						else if (mois == 2) {
							jourMax = 28;
						}
						else if (mois == 4 || mois == 6 || mois ==9 || mois == 11){
							jourMax = 30;
						}
						else {
							jourMax =31;
						}
						//fin de si
						jourValide = jour >= 1 && jour <=jourMax;
					}
				//fin de si
					//Debut de si
					if(jourValide == true && moisValide == true) {
						System.out.println("La date est valide");
					}
					else {
						System.out.println("La date n'est pas valide");
					}
				//fin de si 
	}

}
