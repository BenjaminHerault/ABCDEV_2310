package fibonacci;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Declaration des variable
		int position;
		int nb;
		String resultat;
		float nbPrecedent;
		float nbCourant;
		float nbSuivant;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nb = sc.nextInt();
		
		position = 2;
		resultat = "\tO\n\t1";
		nbPrecedent = 0f;
		nbCourant = 1f;
		
		//debut de si
			if(nb>2){
				//debut de tant que
				while(position < nb) {
					nbSuivant = nbPrecedent + nbCourant;
					resultat = resultat +"\n\t"+ nbSuivant;
					nbPrecedent = nbCourant;
					nbCourant = nbSuivant;
					position = position+1;
				}
				//fin de tant que 
			}
			else {
				nb=2; 
			}
			//fin de si
			System.out.println("Les " + nb + " premiers nombres de la suite de Fibonacci sont \n" + resultat );
			sc.close();
	}

}
