package exercice_3_boucle_pour;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int np = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisir un nombre");
		np = sc.nextInt();
		System.out.println("Les valeurs des 10 nombre sont ");
		
			for(int i = 1 ; i<=10 ; i++) {
			np = np+1;
			System.out.println(np);
			}
		sc.close();
	}

}
