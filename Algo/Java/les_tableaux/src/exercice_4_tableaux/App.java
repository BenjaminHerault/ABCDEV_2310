package exercice_4_tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	//declaration des variable
		int np, i, res;
		int tab[] ;
		
		Scanner sc = new Scanner(System.in);
		
		//debut de programmation
		
		System.out.println("Saisir le nombre de valeur du tableau");
		np = sc.nextInt();
		
		tab= new int[np];
		res = 0 ;
		
		sc.close();
		
		for(i=0; i<= tab.length-1; i++) {
			System.out.println("Saisir le nombre ° " + (i+1));
			tab[i] = sc.nextInt();
			res = res + tab[i];
		}
		
		System.out.println("la somme des elements du tableau est : " +"\n\n\t\t"+res );
		
		//fin de programmation 
		
		
	}

}
