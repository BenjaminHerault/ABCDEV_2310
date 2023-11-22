package exercice2_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 VARIABLES
			a est un reel
			b est un reel
			c est un reel
		Debut du programme
			Ecrire "Saisir le nombre a"
			Lire a
			Ecrire "Saisir le nombre b"
			Lire b
			Ecrire "saisir le nombre c"
			Lire c
			
		Debut Si
			Si a<=b ET a<=c Alors
				Debut Si
					Si b<=c Alors
						Ecrire a <= b <= c
						Sinon
						Ecrire a <= c <= b
				Fin Si
			Sinon Si b <= a ET b <= c Alors
				Debut Si 
					Si a <= c Alors
						Ecrire b <= a <= c
						Sinon
						Ecrire b <= c <= a
				Fin Si
					Sinon
					Debut Si
						Si a<= b Alors
					Ecrire c <= a <= b
					Sinon c <= b <= a
			Fin Si
		Fin Si
Fin du programme
		 */
		
		//Declaration des variable
			int a;
			int b;
			int c;
			
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Saisir le nombre a ");
			a = sc.nextInt();
			System.out.println("Saisir le nombre b ");
			b = sc.nextInt();
			System.out.println("Saisir le nombre c ");
			c = sc.nextInt();
			
			// debut de Si
				if(a<=b && a<=c) {	
				
				// debut de Si
					if(b<=c) {
						System.out.println( +a + " <= " + b + " <= " + c);
					}
					else {
						System.out.println( +a + " <= " + c + " <= " + b);
					}
				}
	}

}
