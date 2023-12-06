package exercice_4_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		Variable 
			nombre est un entier 
			i est un entier 
			resulta est un entier
			debus de programmation 
			i<-- 0
				resulta <--0
		Afficher ‘’ saisir un nombre ‘’
			Ecrire nombre
		Debus de pour i=0   i<=nombre  i++
			Resulta <--resulta + i
		Fin de pour	
		fin de programmation 

		*/

		//declaration des variable 
		

		int nombre;
		int i= 0;
		int resulta= 0;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		for(i = 0; i<=nombre;i++) {
			resulta = resulta+i;
		}
		System.out.println(resulta);
		sc.close();
		
	}

}
