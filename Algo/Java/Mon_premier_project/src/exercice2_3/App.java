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
			
			
				//debut du grand si
				if(a<=b && a<=c ){
					//debus du petit si 1 
						if(b<=c) {
							System.out.println(a+ "<= "+ b + "<=" + c);
							}
							else{
								System.out.println( a+ " <= " + c + " <= " + b );
							}
						}
				//fin du petit si 1
				else if(b <= a && b <= c) {
					//debus du petit si 2
						if(a <= c) {
							System.out.println(b+ " <= " + a + " <= " +c);
							}
							else {
								System.out.println(b+ " <= " + c + " <= " +a );
							}
						}	
					//fin du petit si 2
				else {
					//depus du petit si 3
					if(a <= b) {
						System.out.println(c+ " <= " + a + " <= " +b );
					}
						else {
							System.out.println(c+ " <= " + b + " <= " + a);
						}
					//fin du petit si 3
				}
				//fin du grand si
				
				sc.close();
	}

}
