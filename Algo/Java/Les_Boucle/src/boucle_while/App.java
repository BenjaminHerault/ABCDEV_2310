package boucle_while;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Declaration des variable 
		int nombre1;
		int i=0;
		int resultat;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre de 1 à 10");
		nombre1 = sc.nextInt();
		
		while(i<=10) {
			resultat = i * nombre1;
			System.out.println(i + " * " + nombre1 + " = " + resultat );
			i++;
		}
		sc.close();
	}

}
