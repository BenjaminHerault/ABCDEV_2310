package exercice_1_compte;

public class App {

	public static void main(String[] args) {
		Compte compte = new Compte(1000);
		
		compte.afficher();
		compte.deposer(500);
		compte.afficher();
		compte.retirer(3000);
		compte.afficher();
		compte.retirer(10.123);
		compte.afficher();
	}
}
