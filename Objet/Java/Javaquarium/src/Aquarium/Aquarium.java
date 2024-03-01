package Aquarium;

import java.util.Random;
import java.util.Scanner;

public class Aquarium {

	private static Random random = new Random();
	
	private Poisson poisson;
	private Algue algues;
	private PasserTemps temps ;
	
	Scanner sc = new Scanner (System.in);
	
	
	public Aquarium(Poisson _poisson, Algue _algues, PasserTemps _temps) {
		this.poisson = _poisson;
		this.algues = _algues;
		this.temps = _temps;
	}
	public Poisson AjouterPoisson() {
		return poisson;
		
	}
	
}
