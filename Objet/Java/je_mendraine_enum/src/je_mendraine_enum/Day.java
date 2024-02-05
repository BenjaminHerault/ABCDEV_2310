package je_mendraine_enum;

public enum Day {
	
	MATIN(8, "Il est l'heure de se lever"), 
	MIDI(12, "A table"), 
	APRESMIDI(15, "Bon fooot"), 
	SOIR(22, "Bonne Nuit"), 
	NUIT(2, "Fais de beau reve");
	
	private int hour;
	private String message;
	
	Day (int _hour , String _message ){
		this.hour = _hour; 
		this.message = _message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getHour() {
		return hour;
	}

}
