package exercice1_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		VARIABLE
			rayonR est un entier
			aireSphere est un reel
			volumeSphere est un reel
		CONSTANTE
			pi est un reel
		DEBUT DU PROGRAMME
			Ecrire "Saisir le rayon"
			Lire rayonR
			aireSphere <-- 4 * pi * rayonR^2
			volumeSphere <-- 4/3 * pi * rayonR^3
			Ecrire "l'aire de la sphere est : ",aireSphere
			Ecrire "le volume de la sphere est : ",volumeSphere
		FIN DU PROGRAMME
		 */
		
		//declaraction des variables
		int rayonR;
		double aireSphere;
		double volumeSphere;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon");
		rayonR = sc.nextInt();
		
		aireSphere = (4*Math.PI*Math.pow(rayonR,2));
		aireSphere = Math.round(aireSphere*1000.00)/1000.00;
		volumeSphere = (4/3*Math.PI*Math.pow(rayonR, 3));
		volumeSphere = Math.round(volumeSphere*1000.00)/1000.00;
		
		System.out.println("Le resultat de l'air d'une sphere est : "+aireSphere);
		System.out.println("Le resultat du volume d'une sphere est : "+volumeSphere);
		
		sc.close();

	}

}