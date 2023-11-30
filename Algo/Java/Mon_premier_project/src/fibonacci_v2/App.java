package fibonacci_v2;

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
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de nombre de la suite de Fiboacci souhaite-vous affiché");
		nb = sc.nextInt();
		
		position = 2;
		resultat = "\tO\n\t1";
		nbPrecedent = 0f;
		nbCourant = 1f;
		i = 0;
		//debut de si
			//if(nb>2){
				//debut de tant que
				for(i=2; i<nb;) {
					nbSuivant = nbPrecedent + nbCourant;
					resultat = resultat +"\n\t"+ nbSuivant;
					nbPrecedent = nbCourant;
					nbCourant = nbSuivant;
					position = position+1;
					i = i+1;
				//}
				//fin de tant que 
			}
			//else {
				//nb=2; 
			//}
			//fin de si
			System.out.println("Les " +nb +" premiers nombre de la suite de Fibonacci sont : ");
			sc.close();

	}

}
