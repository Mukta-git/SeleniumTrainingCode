package javasessions;

public class LoginPage {

	String userName;
	String password;
	
	
	
	public LoginPage(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public void doLogin() {
		System.out.println("username is "+ userName);
		System.out.println("password is " + password);
		System.out.println("user is logged in");
	}

	public static void main(String[] args) {
		LoginPage lp1= new LoginPage("test@gmail.com","test123");
		lp1.doLogin();
		
		LoginPage lp2= new LoginPage("ABC@gmail.com","ABC123");
		lp2.doLogin();
	}

}
