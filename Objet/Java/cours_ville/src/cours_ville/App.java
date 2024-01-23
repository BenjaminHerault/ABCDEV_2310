package cours_ville;

public class App {

	public static void main(String[] args) {
		
	
	
		Ville ville = new Ville();
		System.out.println("Le nombre d'instances de la classe Ville est : "+ville.nbInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "+ville.getNbInstances());
		
		Ville ville1 = new Ville("Marseille" , 870321 , "France");
		System.out.println("Le nombre d'instances de la classe Ville est : "+ville.nbInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "+ville.getNbInstances());
		
		Ville ville2 = new Ville("Mulhouse" , 108038 , "France");
		System.out.println("Le nombre d'instances de la classe Ville est : "+ville.nbInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "+ville.getNbInstances());
		

		System.out.println("\n\n"+ville1.decrisToi());
		System.out.println(ville.decrisToi());
		System.out.println(ville2.decrisToi()+"\n\n");
		System.out.println(ville2.comparer(ville1));
	

		Ville ville3 = new Ville("Marseille", 870321, "France");
		Ville ville4 = new Ville("Mulhouse", 108038, "France");
		
		System.out.println("\n ville  = " +ville.getNom()+ " ville de " +ville.getNbHabitants()
							+ " habitant(s) se situant en "+ville.getNomPays());
		
		System.out.println(" ville3 = " +ville3.getNom()+ " ville de " +ville3.getNbHabitants()
							+ " habitants(s) se situant en " +ville3.getNomPays());
		
		System.out.println(" ville4 = "+ville4.getNom()+" ville de "+ville4.getNbHabitants()
							+" habitant(s) se situant en "+ville4.getNomPays()+"\n\n");
	/*
		 Nous allons interchanger les villes 1 et 2
		 tout ca par l'intermédiaire d'une autre object ville
	*/
		Ville temp = new Ville();
		temp = ville1;
		ville1 = ville2;
		ville2= temp;
		
		System.out.println(" ville1 = " +ville1.getNom()+ " ville de " +ville1.getNbHabitants()
							+ " habitants(s) se situant en " +ville1.getNomPays());
		
		System.out.println(" ville2 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()
							+" habitant(s) se situant en "+ville2.getNomPays()+"\n\n");

	/*
		 Nous allons maintenant interchanger leur noms 
		 par le biais de leurs mutateurs
	 */

		ville1.setNom("Honk Kong");
		ville2.setNom("New York");
		
		System.out.println(" ville1 = " +ville1.getNom()+ " ville de " +ville1.getNbHabitants()
							+ " habitants(s) se situant en " +ville1.getNomPays());
		
		System.out.println(" ville2 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()
							+" habitant(s) se situant en "+ville2.getNomPays()+"\n\n");
	

		System.out.println(ville.getNom());
	
		//Sans modification du get 
		Ville ville5 = new Ville("Marseille" , 123456789, " France");
		System.out.println(ville5.getNom());
		
		//modification du nom de la ville avec le set
		ville5.setNom("Paris");
		// affichage du nouveau nom de la ville avec le get 
		System.out.println(ville5.getNom());
	}
		
}
