package boucle_For;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//declaraction des variables
		int nombre1;
		int i;
		int resultat;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre de 1 à 10");
		nombre1 = sc.nextInt();
		sc.close();
		
		for(i = 0; i<=10;i++ ){
			resultat = i * nombre1;
			System.out.println(i + " * " + nombre1 + "= " + resultat);
		}
		//sc.close();
	}
}
