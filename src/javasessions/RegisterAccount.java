package javasessions;

public class RegisterAccount {
	
	String firstName;
	String lastName;
	String email;
	int telephone;
	String password;
	String passwordConfirm;
	
	public RegisterAccount(String firstName, String lastName, String email, int telephone, String password,
			String passwordConfirm) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}


	public void UserRegistration() {
		System.out.println("Enter First name " + firstName);
		System.out.println("Enter Last name "+ lastName);
		System.out.println("Enter email "+ email);
		System.out.println("Enter telephone "+ telephone);
		System.out.println("Enter password "+ password);
		System.out.println("Enter confirm Password "+ passwordConfirm);
		System.out.println("Click on Register user");
		System.out.println("user is registered successfully");
	}


	public static void main(String[] args) {
		RegisterAccount ra= new RegisterAccount("tom", "Mile", "test@gmail.com", 12356, "pswd@1", "pswd@1");
	//	System.out.println(ra.FirstName+ ra.LastName + ra.Telephone);
		
		ra.UserRegistration();
		RegisterAccount ra1= new RegisterAccount("Peter", "Test", "abct@gmail.com", 17895, "pswd@1", "pswd@1");
		ra1.UserRegistration();

	}

}
