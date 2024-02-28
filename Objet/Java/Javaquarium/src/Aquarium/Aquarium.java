package Aquarium;

public class Aquarium {

	private Poisson poisson;
	private Algue algues;
	private PasserTemps temps ;
	
	public Aquarium(Poisson _poisson, Algue _algues, PasserTemps _temps) {
		poisson = _poisson;
		algues = _algues;
		temps = _temps;
	}
}
