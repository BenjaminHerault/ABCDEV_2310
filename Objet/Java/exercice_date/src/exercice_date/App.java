package exercice_date;

public class App {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Les_Date testDate = new Les_Date(25,12,2024);
		Les_Date testComparer = new Les_Date(20,12,2024);
		
		testDate.transformerNbLettre();
		testDate.NbJours();
		testDate.afficher(testDate);
		System.out.println(testDate.afficher(testDate));
		
		testComparer.transformerNbLettre();
		testComparer.NbJours();
		testComparer.afficher(testComparer);
		System.out.println(testComparer.afficher(testComparer));
		testComparer.comparer(testComparer);
		
	}

}
