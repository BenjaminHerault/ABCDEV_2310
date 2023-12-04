package exercice2_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		double kilometre,miles;
		boolean fermeture_prog;
		boolean isNumeric;
		String quit, saisieUtilisateur;
		
		quit = "q";
		fermeture_prog = false;
		isNumeric = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(!fermeture_prog)
		{
			System.out.println("saisir le nombre de kilometre ou tapez q pour quitter");
			saisieUtilisateur = sc.next();
			if(saisieUtilisateur.equals(quit))
			{
				fermeture_prog = true;
			}
			else
			{
				for(int i = 0;i< saisieUtilisateur.length();i++)
				{
					if(!Character.isDigit(saisieUtilisateur.charAt(i)))
					{
						isNumeric = false;
					}
					else
					{
						isNumeric = true;
					}
				}
				if(isNumeric)
				{
					kilometre = Double.parseDouble(saisieUtilisateur);
					if(kilometre < 0.01 || kilometre > 1000000)
					{
						System.out.println("Saisie invalide, saisissez un nombre entre 0.01 et 1000000");
						saisieUtilisateur = sc.next();
					}
					else
					{
						miles = kilometre / 1.609;
						miles = Math.round(miles * 100.00)/100.00;
						System.out.println(kilometre + " est egale à "+ miles+" miles");
					}
				}
			}
		}
		sc.close();
	}
	
}
