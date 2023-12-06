package exercice_2_boucle_v2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nb ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entre 10 et 20");
		nb = sc.nextInt();
		
		while (nb<10 || nb>20){
			if(nb<10) {
				System.out.println("Plus grand ! ! !");
				nb = sc.nextInt();
			}
			else {
				System.out.println("Plus petit ! ! !");
				nb = sc.nextInt();
			}
		}
		System.out.println("Vous avez fini ");
		sc.close();
	}

}