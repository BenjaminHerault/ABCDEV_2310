package poupees_russes;

public class Les_poupees_russes {
	
	private int taille ;
	private boolean estOuverte ;
	private boolean contien ;
	private boolean estContenuDans ;
	private char identifiantPoupee;
	private char estContenuDansPoupee ;
	private char contientPoupee ; 

	// constructeur par defaut
	public Les_poupees_russes () {
		System.out.println("Creation d'une Poupees Russes par defaut ");
		taille = 0;
		estOuverte = false;
		contien = false;
		estContenuDans = false;
		
		this.setIdentifiantPoupee();
		this.setEstContenuDansPoupee();
		this.setContientPoupee();
	}
	
	// constructeur avec paramétres
	public Les_poupees_russes (int _taille , boolean _estOuverte, 
							   boolean _contien, boolean _estContenuDans ) {
		
		System.out.println("Creation d'une Poupees Russes avec parametres ");
		taille = _taille;
		estOuverte = _estOuverte;
		contien = _contien;
		estContenuDans = _estContenuDans;
		
		this.setIdentifiantPoupee();
		this.setEstContenuDansPoupee();
		this.setContientPoupee();
	}
	
	//**********************ACCESSEURS***********************//
	
	// retourne la taille de la pouper 
	public  int getTaille(){
		return taille ;
	}
	// retourne si la pouper ou ouverte 
	public boolean getEstOuverte() {
		return estOuverte;
	}
	// retourne si la pouper contien une autre pouper
	public boolean getContien() {
		return contien;
	}
	// retourne si la pouper estContenuDans une pouper
	public boolean getEstContenuDans() {
		return estContenuDans;
	}
	
	// quelle pouper 
	public char getIdentifiantPoupee(){
		return identifiantPoupee;
	}
	// dire dans quelle pouper elle et contenu 
	public char getEstContenuDansPoupee() {
		return estContenuDansPoupee;
	}
	// dire quel pouper elle contien 
	public char getContientPoupee() {
		return contientPoupee;
	}
	
	//**********************MUTATEURS***********************//
	// définit la taille 
	public void setTaille(int pTaille){
		taille = pTaille ;
		this.setIdentifiantPoupee();
	}
	// définit si ce ouvert
	public void setEstOuverte(boolean pEstOuverte){
		estOuverte = pEstOuverte;
	}
	// définit si elle contien une pouper
	public void setcontien (boolean pContien) {
		contien = pContien;
	}
	// définit si elle et contenu dans une autre pouper 
	public void setEstContenuDans (boolean pEstContenuDans) {
		estContenuDans = pEstContenuDans;
	}
	// définit quel pouper
	private void setIdentifiantPoupee() {
		char EstContenuDansPoupee [] = {'b','c'};
		char identifiantPoupee    [] = {'A','B' ,'C' }; 	
		
		int i = 0 ;
		
		while (i < taille_pouper_cm.length && this.taille > taille_pouper_cm[i]) {
			i++;
		}
		this.identifiantPoupee = identifiantPoupee[i];
		
	}
	// définit dans quelle pouper elle et contenu
	private void setEstContenuDansPoupee() {
		// a et plus petit b et moyenne et c et la  plus grande 
		for(int = i ; )
		if(taille_pouper_cm[0] > taille_pouper_cm[1]) {
			
		}
		
		
	}
	// définit quelle pouper et contenu 
	private void setContientPoupee() {
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}