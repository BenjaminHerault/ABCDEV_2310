package exercice_5_tableaux;

public class App {

	public static void main(String[] args) {
		//declration des variable
		
		int i;
		
		int tab1[] = {4,8,7,9,1,5,4,6};
		int tab2[] = {7,6,5,2,1,3,7,4};
		int tab3[] = new int[8];
			
		System.out.println("La valeur du tableaux est : "+"\n");
		
		//debut de pour
		
			for( i=0; i<=tab2.length-1;i++ ) {
				tab3[i]=tab1[i]+tab2[i];
			}
			for(int j = 0; j <= tab3.length-1;j++) {
				
				System.out.print(" "+tab3[j] + " ");
			}
			
		
		//fin de pour
		
	}

}
