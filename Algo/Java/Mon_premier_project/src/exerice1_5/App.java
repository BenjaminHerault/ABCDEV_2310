package exerice1_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		VARIABLES
			a est un entier
			b est un entier
			c est un entier
		DEBUT DU PROGRAMME
			Ecrire "saisir la valeur de a"
			Lire a                               3
			Ecrire "Saisir la valeur de b"
			lire b                               5
			Ecrire "Valeur de a : ",a            		 3
			Ecrire "Valeur de b : ",b            5
			c <-- a                              c=3
			a <-- b                              a=5
			b <-- c                              b=3
			Ecrire "Valeur de a : ",a            5
			Ecrire "Valeur de b : ",b            3
	FIN DU PROGRAMME
	*/
		//declaration des variables
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir la valeur de a");
		a = sc.nextInt();
		System.out.println("Saisir la valeur de b");
		b = sc.nextInt();
		
		System.out.println("La valeur de a : " + a  + " et la valeur de b : " + b);
		
		c = a ;
		a = b ;
		b = c ;
		
		System.out.println("La valeur de a : " + a + " et la valeur de b : " + b);
		
		sc.close();
		
	}

}
