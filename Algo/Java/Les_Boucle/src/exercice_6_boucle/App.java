package exercice_6_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nb,i,nbmax=0, nbpose = 1;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Saisir un nombre");
		//nb = sc.nextInt();
		
		for(i=1; i<=20 ;i++) {
			System.out.println("Saisir un nombre");
			nb = sc.nextInt();
			
			if(i==1 ||nb > nbmax) {
			nbmax=nb;
			nbpose = 1+i-(nbpose-20);
			}
			
		}
		System.out.println("Le nombre le plus grand est "+nbmax+ " il se trouve en position " +nbpose);
		
	}

}
