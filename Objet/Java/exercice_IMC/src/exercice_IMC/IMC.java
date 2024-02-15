package exercice_IMC;

public class IMC {
	private double taille ; 
	private double poids ;
	private int age ;
	
	public IMC() {
		taille = 0 ;
		poids = 0 ;
		age = 0 ;
	}
	public IMC( double _taille, double _poids, int _age) {
		taille = _taille;
		poids = _poids;
		age = _age;
	}
	public double imc() {
		return Math.round(this.poids/Math.pow(this.taille, 2)*100.00)/100.00;
	}
	public String interpretation() {
		double resultaIMC = this.imc();
		String resulta = "";
		
		if(resultaIMC <= 16) {
			resulta = "Votre IMC est de : " +resultaIMC+ " Maigreur extrême Risque de maladie Elevé";
		}
		else if (resultaIMC >= 16 && resultaIMC <= 18.4) {
			resulta = "Votre IMC est de : " +resultaIMC+ " Insuffisance pondérale. Risque de maladie : Moyen";
		}
		else if (resultaIMC >= 18.5 && resultaIMC <= 24.9) {
			resulta = "Votre IMC est de : " +resultaIMC+ " Corpulence normale. Risque de maladie : Faible";
		}
		else if (resultaIMC >=25 && resultaIMC <= 29.9) {
			resulta = "Votre IMC est de : " +resultaIMC+ " Surpoids. Risque de maladie : Moyen";
		}
		else if (resultaIMC >= 30 && resultaIMC <= 34.9) {
			resulta = "Votre IMC est de : " +resultaIMC+ " Obésité. Risque de maladie : Elevé";
		}
		else if (resultaIMC >= 35 && resultaIMC <= 40) {
			resulta = "Votre IMC est de : " +resultaIMC+ " Obésité sévère. Risque de maladie : Très élevé";
		}
		else if (resultaIMC > 40) {
			resulta = "Votre IMC est de : " +resultaIMC+ " Obésité morbide. Risque de maladie : Extrêmement élevé";
		}
		return resulta;
	}
	
}
