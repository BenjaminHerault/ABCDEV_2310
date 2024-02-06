package Robot;

public enum Recolte {
	RESTEPLACE100("Il reste 100% de place dans le stockage ",100 ),
	RESTEPLACE90("Il reste 90% de place dans le stockage ",90),
	RESTEPLACE80("Il reste 80% de place dans le stockage ",80),
	RESTEPLACE70("Il reste 70% de place dans le stockage ",70),
	RESTEPLACE60("Il reste 60% de place dans le stockage ",60),
	RESTEPLACE50("Il reste 50% de place dans le stockage ",50),
	RESTEPLACE40("Il reste 40% de place dans le stockage ",40),
	RESTEPLACE30("Il reste 30% de place dans le stockage ",30),
	RESTEPLACE20("Il reste 20% de place dans le stockage ",20),
	RESTEPLACE10("Il reste 10% de place dans le stockage ",10),
	RESTEPLACE0( "Il reste 0% de place dans le stockage " ,0);

	private String combienDePlace;
	private int pourcantage;
	
	
	Recolte(String _combienDePlace , int _pourcantage) {
		this.combienDePlace = _combienDePlace;
		this.pourcantage = _pourcantage;
	}
	public String getCombienDePlace() {
		return combienDePlace;
	}
	public int getPourcantage() {
		return pourcantage;
	}
}
