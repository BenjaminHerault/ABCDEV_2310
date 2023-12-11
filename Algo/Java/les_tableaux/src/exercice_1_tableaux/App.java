package exercice_1_tableaux;

public class App {

	public static void main(String[] args) {
		// Ecrire un algorithme qui déclare et remplit un tableau 
		// de 7 valeurs numériques en les mettant toutes à zéro.
		
		int[] tabNb = new int[7];
		
		for(int i  = 0 ; i <= tabNb.length-1;i++) {
			
			tabNb[i]=0;
			System.out.println(tabNb[i]);
		}
	}

}
