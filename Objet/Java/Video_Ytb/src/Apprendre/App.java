package Apprendre;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hello !");
		
		Date currentDate = new Date();

		System.out.println("Le jour actuel est ->" + currentDate.getDay());
		System.out.println("Le mois en cours es -> " +currentDate.getMonth());
		System.out.println("L'année en cours est -> " +currentDate.getYear());
	}

}
