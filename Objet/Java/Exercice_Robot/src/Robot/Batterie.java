package Robot;

public enum Batterie {
	BATTERIERESTE100("Il reste 100% de batterie",100),
	BATTERIERESTE75("Il reste 75% de batterie",75),
	BATTERIERESTE50("Il reste 50% de batterie",50),
	BATTERIERESTE25("Il reste 25% de batterie",25),
	BATTERIERESTE5("Déploiement tu panneaux solaires",5);
	
	private String batterieReste;
	private int nbPourcent;

	Batterie(String _batterieReste, int _nbPourcent){
		this.batterieReste =_batterieReste;
		this.nbPourcent = _nbPourcent;
	}
	public String getBatterieReste(){
		return batterieReste;
	}
	public int getNbPourcent() {
		return nbPourcent;
	}
}
