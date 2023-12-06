package exercice_9_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Declaration des vaiable
		int nbChevauxPartants ;
		int nbChevauxJouer ;
		int i ;
		int numerateur=1 ;
		int denominateur1 ;
		int denominateur2 ;
		
		//Debut du programme 
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Saisir le nombre de chevaux partants ");
			nbChevauxPartants = sc.nextInt();
			System.out.println("Saisir le nombre de chevaux jouer");
			nbChevauxJouer = sc.nextInt();
			
		// debut de pour 
			for(i=2; i<=nbChevauxPartants;i++) {
				numerateur = numerateur*i;
				
			}
		//fin de pour
			denominateur1 = +1;
		//debut de pour
			for(i=2;i<=nbChevauxPartants-nbChevauxJouer; i++) {
				denominateur1 = denominateur1 * i;
				
			}
		//fin de pour
			denominateur2 = +1;
		//debut de pour;
			for(i=2;i<=nbChevauxJouer;i++) {
				denominateur2 = denominateur2*i;
				
		//fin de pour 
			}
			System.out.println("Dans l'ordre 1 chance sur " +numerateur/denominateur1);
			System.out.println("Dans le desordre 1 chance sur " + numerateur/(denominateur1*denominateur2));
			
			sc.close();
		//fin du programme 
	}

}
