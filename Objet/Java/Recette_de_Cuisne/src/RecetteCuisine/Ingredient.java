package RecetteCuisine;

public class Ingredient {

		private String nomAliment, etat;
		private int quantite;
		private String unite ;
	
	public Ingredient (String _nomAliment, String _etat , int _quantite, String _unite) {
		this.nomAliment = _nomAliment;
		this.etat = _etat;
		this.quantite = _quantite;
		this.unite = _unite;
	}
}
