package Ytb;

public class App {

	public static void main(String[] args) {
		
		User user2 = new User.UserBuilder()
				.withLastName("Belfort")
				.withFirsName("Laurent")
				.build();
		
		User user3 = new User.UserBuilder()
				.withFirsName("Lea")
				.withPhone("010203")
				.withLastName("Doliprane")
				.build();

		System.out.println(user3.getAdrress() +user3.getLastName());
	}

}
