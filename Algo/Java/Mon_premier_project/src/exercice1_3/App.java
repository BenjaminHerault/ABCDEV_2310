package exercice1_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
			Variable
				rayonR est un entier 
				angleA est un entier
				aire est un reel
			Constante
				pi est un reel
			Début du programme
				Ecrire " Saisir le rayon R"
				lire rayonR
				Ecrire " Saisir l'angle a"
				lire angleA
				aire <-- (pi*rayonR^2*angleA)/360
				ecrire "L'aire du secteur circulaire est : ",aire 
			fin du programme 
		 */
		
		//declaraction des variables
		int rayonR;
		int angleA;
		double aire;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon R");
		rayonR = sc.nextInt();
		System.out.println("Saisir l'angle a");
		angleA = sc.nextInt();
		
		aire = ((Math.PI*Math.pow(rayonR, 2)*angleA)/360);
		aire = Math.round(aire*1000.00)/1000.00;
		
		System.out.println("L'aire du secteur circulaire est : "+aire);
		
		sc.close();

	}

}
