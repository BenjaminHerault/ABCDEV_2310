package Exercice_2;

public class Maison {

	protected int surface ;
	protected Porte unePorte ;
	
	public Maison(int _surface) {
		this.surface = _surface;
		this.unePorte = new Porte("inconnus");
	}
	@Override
	public String toString() {
		return "J'habite une maison, d'une surface de " + this.surface + "m² "; 
	}
	// ********** Getters***********
	public int getSurface() {
		return this.surface;
	}
	public Porte getPorte() {
		return this.unePorte;
		
	}
	// ********** Setters **********
	public void setSurface (int _surface) {
		this.surface = _surface;
	}
	public void setPorte (Porte _uneporte) {
		this.unePorte = _uneporte;
	}
	
}