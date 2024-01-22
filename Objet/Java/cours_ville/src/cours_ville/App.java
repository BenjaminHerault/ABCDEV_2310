package cours_ville;

public class App {

	public static void main(String[] args) {
		
		
		Ville ville = new Ville();
		/*
		Ville ville1 = new Ville("Marseille", 870321, "France");
		Ville ville2 = new Ville("Mulhouse", 108038, "France");
		
		System.out.println("\n ville  = " +ville.getNom()+ " ville de " +ville.getNbHabitants()
							+ " habitant(s) se situant en "+ville.getNomPays());
		
		System.out.println(" ville1 = " +ville1.getNom()+ " ville de " +ville1.getNbHabitants()
							+ " habitants(s) se situant en " +ville1.getNomPays());
		
		System.out.println(" ville2 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()
							+" habitant(s) se situant en "+ville2.getNomPays()+"\n\n");
		
		*/
		/*
		 Nous allons interchanger les villes 1 et 2
		 tout ca par l'intermédiaire d'une autre object ville
		 */
		
		/*
		Ville temp = new Ville();
		temp = ville1;
		ville1 = ville2;
		ville2= temp;
		
		System.out.println(" ville1 = " +ville1.getNom()+ " ville de " +ville1.getNbHabitants()
							+ " habitants(s) se situant en " +ville1.getNomPays());
		
		System.out.println(" ville2 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()
							+" habitant(s) se situant en "+ville2.getNomPays()+"\n\n");
		*/
		
		/*
		 Nous allons maintenant interchanger leur noms 
		 par le biais de leurs mutateurs
		 */
		
	/*	ville1.setNom("Honk Kong");
		ville2.setNom("New York");
		
		System.out.println(" ville1 = " +ville1.getNom()+ " ville de " +ville1.getNbHabitants()
							+ " habitants(s) se situant en " +ville1.getNomPays());
		
		System.out.println(" ville2 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()
							+" habitant(s) se situant en "+ville2.getNomPays()+"\n\n");
		*/
		Ville ville3 = new Ville("Marseille" , 870321 , "France");
		Ville ville4 = new Ville("Mulhouse" , 108038 , "France");
		
		ville3.comparer(ville4);
		
		
		
		/*
		System.out.println(ville.getNom());
	
		//Sans modification du get 
		Ville ville1 = new Ville("Marseille" , 123456789, " France");
		System.out.println(ville1.getNom());
		
		//modification du nom de la ville avec le set
		ville1.setNom("Paris");
		// affichage du nouveau nom de la ville avec le get 
		System.out.println(ville1.getNom());
		*/
	}
		
}
