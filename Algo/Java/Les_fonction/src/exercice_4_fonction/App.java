package exercice_4_fonction;

import java.util.Scanner;

public class App {
	
	
	public static String suppLettre (String supp , String mot ) {
        for(int i = 0; i<= mot.length()-1;i++) {
            if (mot.charAt(i) == supp.charAt(0)) {
                 mot = mot.substring(0, i) + mot.substring(i + 1);
                 i--;
             }
        }
		return mot;
	}
	public static String suppMot (String supp , String mot ) {
        for(int i = 0; i<= mot.length()-1;i++) {
        	for(int k = 0 ; k<= supp.length()-1;k++) {
                if (mot.charAt(i) == supp.charAt(k)) {
                    mot = mot.substring(0, i) + mot.substring(i + 1);
                    i--;
                    break;
                }
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
        System.out.println("Saisir des caractères à supprimer : ");
        supp = sc.nextLine();
        
    	mot = suppLettre(supp , mot);
        System.out.println(mot);
		sc.close();
    }
}

