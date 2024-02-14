package robot_Mad;

import java.util.Scanner;

public class Manette {
	
	private Robot manette;
	private char boutonAvancer,boutonReculer,boutonTourneADroite,boutonTourneAGauche,boutonAllumer,boutonEteindre;
	private char UneManette ;
	private Scanner sc ;
	public Manette(){
		this.manette = new Robot();
		this.boutonAvancer = 'z';
		this.boutonReculer = 's';
		this.boutonTourneADroite = 'd';
		this.boutonTourneAGauche = 'q';
		this.boutonAllumer = 'a';
		this.boutonEteindre = 'e';
		this.UneManette =' ';
		this.sc = new Scanner (System.in);
	}
	public void appuyer() {
		while(this.UneManette != 'w') {
				System.out.println(  "\n" + "Allumer le Robot (a) "+ 
						"\n" + "Eteindre le Robot (e)"+
						"\n" + "Avancer (z) " +
						"\n" + "Tourner a Droite (d) " + 
						"\n" + "Tourner a gauche (q)" + 
						"\n" + "Reculer (s)");
				this.UneManette = sc.next().charAt(0);
				switch(this.UneManette) {
					case 'a':
						this.manette.action(Bouton.ALLUMER);
						break;
					case 'e':
						this.manette.action(Bouton.ETEINDRE);
						break;
					case 'z':
						this.manette.action(Bouton.AVANCER);
						break;
					case 'd':
						this.manette.action(Bouton.TOURNERADROITE);
						break;
					case 'q':
						this.manette.action(Bouton.TOURNERAGAUCHE);
						break;
					case 's':
						this.manette.action(Bouton.RECULER);
						break;
					case 'w' :
						System.out.println("DEAD ! GAME OVER ! LOSER !");
				default:
					break;
				}
				System.out.println(this.manette.affichageRobotInfo());
				}
			sc.close();
			}
}
