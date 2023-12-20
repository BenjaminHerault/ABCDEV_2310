package exercice_vrai_1_fonction;

import java.util.Scanner;

public class App {
	public static int calcul(int arg1 ,int  arg2 ,int arg3 ,int arg4 ,int arg5) {
		int somme = 0;
		somme = arg1 + arg2 + arg3 + arg4 + arg5;
		return somme;
	}

	public static void main(String[] args) {
		int nb1, nb2 , nb3 , nb4 , nb5;
		int somme;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir la 1er valeur ");
		nb1 = sc.nextInt();
		System.out.println("Saisir la 2ème valeur ");
		nb2 = sc.nextInt();
		System.out.println("Saisir la 3ème valeur ");
		nb3 = sc.nextInt();
		System.out.println("Saisir la 4ème valeur ");
		nb4 = sc.nextInt();
		System.out.println("Saisir la 5ème valeur ");
		nb5 = sc.nextInt();
		
		somme=calcul(nb1, nb2 , nb3 , nb4 , nb5);
		System.out.println("La somme des valeurs est : "+somme);
	}

}
