package Ytb;

public class User {

	private String lastName;
	private String firstName;
	private String phone;
	private String address;
	

	public static class UserBuilder {
		private String lastName = " \nNom de famille non definit ";
		private String firstName = "\nPrenom non definit ";
		private String phone = "\nPas de numero definit ";
		private String address = "\nAucune adresse ";
		
		public UserBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public UserBuilder withFirsName(String firstName ) {
			this.firstName = firstName;
			return this;
		}
		
		public UserBuilder withPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public UserBuilder withAddress(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User();
			user.firstName = firstName;
			user.lastName = lastName;
			user.address = address;
			user.phone = phone;
			return user;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAdrress() {
		return address;
	}
}
