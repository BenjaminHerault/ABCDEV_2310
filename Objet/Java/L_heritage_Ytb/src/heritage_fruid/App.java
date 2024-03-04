package heritage_fruid;

public class App {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		a.taste();
		a.miam();
		
		PineApple pen = new PineApple();
		pen.taste();
		pen.miam();
		
		if (!(a instanceof PeelFruit)) {
			System.out.println("Ce fruit n'implement pas l'interface PeelFruit !");
			PeelFruit fruit = pen ;
			fruit.isPeeled();
		}
	}

}
