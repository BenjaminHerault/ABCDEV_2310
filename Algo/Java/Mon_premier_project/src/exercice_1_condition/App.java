package exercice_1_condition;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//declaration des variable
		int nombre;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		// debut de si
			if ( nombre>0) {
				System.out.println("Ce nombre est positif");
			}
			else {
				System.out.println("Ce nombre est negatif");
			}
	}

}
