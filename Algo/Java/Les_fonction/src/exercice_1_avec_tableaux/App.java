package exercice_1_avec_tableaux;

import java.util.Scanner;

public class App {
	public static int calcul(int arg1 ,int  arg2 ,int arg3 ,int arg4 ,int arg5) {
		int somme = 0;
		somme = arg1 + arg2 + arg3 + arg4 + arg5;
		return somme;
	}

	public static void main(String[] args) {
		//int nb=0;
		int somme;
		
		Scanner sc = new Scanner(System.in);

		int[] tab = new int[5];
		for(int i= 0 ; i<= tab.length-1;i++) {
			System.out.println("Saisir le nombre ° " +(i+1));
			tab[i]=sc.nextInt();
			
		}		
		somme=calcul(tab[0], tab[1] , tab[2] , tab[3] , tab[4]);
		System.out.println("La somme des valeurs est : "+somme);
		sc.close();
	}

}
