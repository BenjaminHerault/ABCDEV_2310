package exercice_5_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nombre;
		int i= 1;
		int resulta= 1;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		for(i = 1; i<=nombre;i++) {
			resulta = resulta*i;
		}
		System.out.println("Le factorielle de " + nombre + " est " + resulta);
		sc.close();

	}

}
