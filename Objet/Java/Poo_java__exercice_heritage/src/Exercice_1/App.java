package Exercice_1;

public class App {

	public static void main(String[] args) {
		
		Personne Test = new Personne();
		Etudiant Test1 = new Etudiant("Jean", "Bon", 2010, "Bac S ");
		Professeur Test2 = new Professeur ("Paul", "Ochon", 1978 , "Mathématique");
		
	
		//System.out.println (Test.disBonjour());
		System.out.println(Test1.GoToClasses());
		System.out.println(Test2.cours());

	}

}
