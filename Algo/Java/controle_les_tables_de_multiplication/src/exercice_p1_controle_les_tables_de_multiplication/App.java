package exercice_p1_controle_les_tables_de_multiplication;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//declration des variable
		int nb, i, resulta;
		Scanner sc = new Scanner(System.in);
		
		//debut de porgrammation
			System.out.println("Saisir un nombre entre 0 et 10");
			nb = sc.nextInt();
			
			//debut de pour
				for(i=0;i<=10;i++){
					resulta = i*nb;
					System.out.println(i+"*"+nb+"="+resulta);
				}
			//fin de pour
		
		//fin de programmation 
		sc.close();
	}

}
