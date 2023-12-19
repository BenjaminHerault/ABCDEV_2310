package exercice_9_tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nb ;
		int somme;
		int moy ;
		int nbSup ;
		int tab[];
		int i ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de valeur du taleau");
		nb = sc.nextInt();
		
		tab= new int[nb];
	
			for(i=0; i<= tab.length-1;i++) {
				System.out.println("Saisir le nombre ° " +(i+1));
				tab[i] = sc.nextInt();
			}
	
			somme=0;
	
			for(i = 0; i<=tab.length-1;i++) {
				somme = somme +tab[i];
			}
	
			moy = somme/nb;
			nbSup =0;
			
			for(i =0; i <= tab.length-1;i++) {
				if(tab[i] > moy) {
					nbSup = nbSup+1;
				}
			}

			System.out.println("Le nombre d'eleves depassent la moyenne de la classe est ; " + nbSup );
			sc.close();
	}

}
