package exercice_1_fonction;

import java.util.Scanner;

public class App {
	
	
	public static void nombresuivant5(int nb5,int nb) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un nombre");
		nb = sc.nextInt();
		for(int i = 1; i<= 5;i++) {
			nb5 = nb+i;
			System.out.print(" "+nb5+" ");
		}
		sc.close();
		
	}

	public static void main(String[] args) {
		
		nombresuivant5(0, 0);

	}

}
