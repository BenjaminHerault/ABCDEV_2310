package exercice_7_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nb =1, i=0,pg=0,po=0;
		Scanner sc = new Scanner(System.in);
		while(nb !=0) {
			System.out.println("Saisir un nombre");
			nb = sc.nextInt();
			i++;
				if(i == 1 || nb>pg) {
					pg=nb;
					po=i;
				}
		}
		
		System.out.println("Le nombre le plus grand est : " +pg);
		System.out.println("Il a ete saisi en position numero " +po);
		sc.close();
	}

}
