package exercice_3_tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Declaration des variables 
		int nb, nbPosi, nbNega ;
		int tab[];

		//debut de programmation
		Scanner valeur = new Scanner(System.in); 
		
		System.out.println(" Entre le nombre de valeur que vous compte saisir ");
		nb = valeur.nextInt();
		
		tab = new int[nb];
		
		nbPosi = 0;
		nbNega = 0;
		
		for (int i = 0 ; i<= tab.length-1;i++) {
			
			System.out.println("Saisir le nombre ° " + (i+1));
			tab[i] = valeur.nextInt();
			
			if(tab[i]>0){
				nbPosi =nbPosi +1;
			}
			else if(tab[i]<0) {
				nbNega = nbNega +1;
			}
		}
		
		System.out.println("Le nombre de valeurs positive : " +nbPosi);
		System.out.println("Le nombre de valeurs negative : " +nbNega);
		
		valeur.close();
		//Fin de programmation 
	}

}
