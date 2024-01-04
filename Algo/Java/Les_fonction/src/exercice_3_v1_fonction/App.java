package exercice_3_v1_fonction;

import java.util.Scanner;

public class App {
	
	
	public static String mot (String supp , String mot ) {
        for(int i = 0; i<= mot.length()-1;i++) {
            if (mot.charAt(i) == supp.charAt(0)) {
                 mot = mot.substring(0, i) + mot.substring(i + 1);
             }
        }
		return mot;
	}
	
    public static void main(String[] args) {
    	String mot;
    	String supp;
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saisir un mot ou une phare : ");
        mot = sc.nextLine();
        System.out.println("Saisir un caractère à supprimer : ");
        supp = sc.nextLine();
        
    	mot = mot(supp , mot);
        System.out.println(mot);
		sc.close();
    }
}
