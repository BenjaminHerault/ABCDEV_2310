package exercice_5_condition;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//declration vararible
		double prix;
		double nbphotocopies;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de photocopies");
		nbphotocopies = sc.nextDouble();
		//debut de si 
			if(nbphotocopies<=10){
				prix = nbphotocopies*0.10;
				prix = Math.round(prix*100.00)/100.00;
				System.out.println("le prix pour " +nbphotocopies +" et " +prix );
			}
			else if (nbphotocopies<=30) {
				prix = (10*0.10)+(nbphotocopies-10)*0.09;
				prix = Math.round(prix*100.00)/100.00;
				System.out.println("le prix pour " +nbphotocopies +" et " +prix); 
			}
			else {
				prix= (10*0.10)+(20*0.09)+(nbphotocopies-10)*0.08;
				prix = Math.round(prix*100.00)/100.00;
				System.out.println("le prix pour " +nbphotocopies +" et " +prix);
			} 
		//fin de si
	}

}
