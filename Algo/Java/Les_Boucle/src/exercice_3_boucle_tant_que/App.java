package exercice_3_boucle_tant_que;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//declaration des variable 
		int np = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		//debut de programmation 
			System.out.println("Saisir un nombre ");
			np = sc.nextInt();
				while(i<10){
					np = np +1;
					System.out.println(np);
					i++;
				}
		//fin de porgrammation 
				sc.close();
	}

}
