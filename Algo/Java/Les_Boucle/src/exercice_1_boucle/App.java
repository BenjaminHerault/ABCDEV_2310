package exercice_1_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nb;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("entre un nombre entre 1 et 3 ");
		nb = sc.nextInt();
		while(1>nb || 3<nb) {
			System.out.println("Saisir un autre nombre toujour entre 1 et 3");
			nb= sc.nextInt();
		}
		System.out.println("Bonne reponse ");
		sc.close();
	}

}