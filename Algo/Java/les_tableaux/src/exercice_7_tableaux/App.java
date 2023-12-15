package exercice_7_tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int i,k,nb ;
		int tab1[];
		
		Scanner sc = new Scanner(System.in);
		
		//debut de programmation
		
		System.out.println("Saisir le nombre de valeur du tableau");
		nb = sc.nextInt();
		
		tab1= new int[nb];
		
		//pour rentre les valeur dans le tableaux 
			for(i=0 ; i<= tab1.length-1;i++) {
				System.out.println("Saisir le nombre ° " +(i+1));
				tab1[i] = sc.nextInt();
			
			}
			System.out.print("Tableaux normal");
		//pour afficher le tableux normal 
			for(int j = 0; j <= tab1.length-1;j++) {
				System.out.print(" "+tab1[j] + " ");
			}
		
		System.out.print("\n");
		//pour gagner +1 
			for(k=0; k <= tab1.length-1;k++) {
				tab1[k]= tab1[k]+1;
			}
		System.out.print("Tableaux avec +1 : ");
		//pour afficher avec + 1 
			for(int o = 0; o <= tab1.length-1;o++) {
				System.out.print(" "+tab1[o] + " ");
			}
			
	}

}
