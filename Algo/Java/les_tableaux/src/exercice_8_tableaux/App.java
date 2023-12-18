package exercice_8_tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//declaration des variable
		int nbmax = 0 ;
		int nb ;
		int tab[];
		
		Scanner  sc = new Scanner (System.in);
		
		System.out.println("Saisir le nombre de valeur du tableau");
		nb = sc.nextInt();
		
		tab= new int[nb];
		
		//debut de pour
		for(int i= 0 ; i<= tab.length-1;i++) {
			System.out.println("Saisir le nombre ° " +(i+1));
			tab[i] = sc.nextInt();
		}
		// fin de pour
		
		//debut de pour
		//for(int j= 0 ; j<= tab.length-1;j++) {
		//	System.out.print(" " +tab[j] + " ");
		//}
		// fin de pour
		
		// debut de pour 
		
		for (int k=0; k<= tab.length-1;k++) {
			if(tab[k]> tab[nbmax]) {
				nbmax = k;
			}
		}
		
		System.out.println("\n" + "Le nombre le plus grand est " + tab[nbmax]+ " il se trouve en index " + nbmax);
		
		sc.close();
	}

}