package exercice_6_tableaux;

public class App {

	public static void main(String[] args) {
		
		int res = 0 ;
		int tab1[] = {4,8,7,12};
		int tab2[] = {3,6};
		
		for(int i=0; i<=tab1.length-1;i++) {
			
			for(int j=0; j<=tab2.length-1; j++) {
				res= res + (tab1[i]*tab2[j]);
			}
		}
		System.out.println(res);
	}

}
