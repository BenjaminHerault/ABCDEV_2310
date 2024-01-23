package cours_ville;

public class Ville {
	
		// les attributs 
	// stocke le nom de la ville
	private String nomVille;
	// stocke le nom du pays de la ville 
	private String nomPays;
	// stock le nombre d'habitant de la ville 
	private int nbHabitants ;
	private char categories;
	//variable publique qui compte les instances 
	public static int nbInstances = 0;
	//variable privée qui compte les instances 
	private static int nbInstancesBis = 0;

	
	// constructeur par defaut
	public Ville() {
		System.out.println("Création d'une ville par defaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
		this.setcategorie();
		// on incremmente les variables à chaque appel du constructeur
		nbInstances++;
		nbInstancesBis++;
	}
	
	// constructeur avec paramétres
	// J'ai ajoutè un << p >> en 1ére lettre des paramétres 
	// ce n'est pas une convention, mais ça peut être un bon moyens de les repérer.
	public Ville (String pNom, int nbre, String pNomPays) {
		System.out.println("Creation d'une ville avec des parametres");
		nomVille = pNom;
		nomPays = pNomPays;
		nbHabitants = nbre;
		this.setcategorie();
		// on incremmente les variables à chaque appel du constructeur
		nbInstances++;
		nbInstancesBis++;
	}
	//**********************ACCESSEURS***********************//
	
	// retourne le nom de la ville
	public String getNom() {
		return nomVille;
	}
	
	// retourne le nom de pays 
	public String getNomPays() {
		return nomPays;
	}
	
	// Retourne le nombre d'habitant
	public int getNbHabitants() {
		return nbHabitants;
	}
	
	//Retourne la categorie 
	public char getCategories() {
		return categories;
	}
	
	// Retourne le nombre d'instance
	public static int getNbInstances(){
		return nbInstancesBis;
	}
	
	//**********************MUTATEURS***********************//
	
	// Définit le nom de la ville
	public void setNom(String pNom) {
		nomVille = pNom;
	}
	
	//Définit le  nom de pays
	public void setNomPays (String pNomPays) {
		nomPays = pNomPays ;
	}
	
	//Définit le nombre d'habitant
	public void setNbHabitants(int nbre) {
		nbHabitants = nbre ;
		this.setcategorie();
	}
	
	// Définit la categorie de la ville
	private void setcategorie() {
		int bornesSuperieurs [] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories [] = {    '?','A',   'B',   'C',      'D',   'E',    'F',       'G',       'H'}; 
		
		int i = 0;
	
		while(i < bornesSuperieurs.length && this.nbHabitants > bornesSuperieurs[i]) {
			i++;
		}
		this.categories = categories[i];
	}
	
	// Retourne la description de la ville 
	public String decrisToi() {
		return "\t" +this.nomVille+" est une ville de "
					+this.nomPays
					+" elle comporte : "
					+this.nbHabitants
					+" habitant(s) => elle est donc de categorie : " 
					+this.categories;
	}
	
	// Retourne une chaine de caractères selon le résultat de la comparaison 
	public String comparer(Ville v1) {
		String str = new String();
		
		if(v1.getNbHabitants() >  this.nbHabitants) {
			str = v1.getNom()+" est plus peuplée que " +this.nomVille;
		}
		else {
			str = this.nomVille+" est plus peuplée que " +v1.getNom();
		}
		return str;
	}
}
























