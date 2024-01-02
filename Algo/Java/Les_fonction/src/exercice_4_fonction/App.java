package exercice_4_fonction;

import java.util.Scanner;

public class App {
	
	
	public static String mot (String supp ) {
		String mot ;
		int i;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saisir un mot ou une phare : ");
        mot = sc.nextLine();

        System.out.println("Saisir un caractère à supprimer : ");
        supp = sc.nextLine();

        for(i = 0; i<= mot.length()-1;i++) {
            if (mot.charAt(i) == supp.charAt(i)) {
                 mot = mot.substring(0, i) + mot.substring(i + 1);
             }
        }
		sc.close();
		return mot;
	}
	
    public static void main(String[] args) {
    	String mot;
    	String supp = null;
    	
    	mot = mot(supp);
        System.out.println(mot);
    }
}
