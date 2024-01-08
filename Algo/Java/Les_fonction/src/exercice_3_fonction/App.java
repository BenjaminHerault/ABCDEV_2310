package exercice_3_fonction;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //declration des variables
        String mot;
        String supp;
        int i ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un mot ou une phare : ");
        mot = sc.nextLine();

        System.out.println("Saisir un caractère à supprimer : ");
        supp = sc.nextLine();
        


        for(i = 0 ; i<= mot.length()-1;i++) {
        	if(mot != supp) {
              
        	}
        }

       
        System.out.println(mot);
        sc.close();
    }
}
