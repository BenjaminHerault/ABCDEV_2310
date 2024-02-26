package Exercice_2;

public class Appartement extends Maison  {

	public Appartement() {
		super(50);
	}
	@Override
	public String toString() {
		return "J'habite un appartement d'une surface de " + this.surface +" m²" ;
	}

}