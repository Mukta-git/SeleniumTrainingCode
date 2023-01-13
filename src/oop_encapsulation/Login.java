package oop_encapsulation;

public class Login {

	private String userName;
	private String password;
	public String role;
	public Login(String userName, String password, String role) {
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getInfo() {
		return userName + " "+ password+" "+ role;
	}
	
	
	
	
}
