package Aquarium;

enum Sexe {
	MALE , FEMELLE , HERMAPHODITEAGE, HERMAPHODITEOPPORTUNISTE ;
}
public class Poisson {
	private String nom ;
	private Sexe sexe;
	
	public Poisson() {
		this.nom = "Bob";
		this.sexe = Sexe.FEMELLE ;
	}
	public Poisson(String _nom, Sexe _sexe) {
		this.nom = _nom ;
		this.sexe = _sexe ;
	}

}
