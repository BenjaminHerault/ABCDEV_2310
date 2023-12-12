package comment_quitter_ou_relancer_un_programme;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
			boolean quitter = false;
			String saisie = "";
			
			Scanner userInput = new Scanner(System.in);
			
			while(!quitter) {
				System.out.println("application en cours d'execution");
				// on demande a l'utilisateur si il souhaite quitter ou continuer
				System.out.println("Appuyer sur (o) pour continuer ou (n) pour quitter ");
				//utilisateur saisie oui ou non sinon on lui repose la question
				saisie = userInput.nextLine();
				
				if(saisie.equals("o")) {
					quitter = false;
				}
				else if(saisie.equals("n")) {
					quitter = true;
				}
				else {
					// on demande a l'utilisateur si il souhaite quitter ou continuer
					System.out.println("Appuyer sur (o) pour continuer ou (n) pour quitter ");
					//utilisateur saisie oui ou non sinon on lui repose la question
					saisie = userInput.nextLine();
				}
			}
			
			

		userInput.close();
	}

}
