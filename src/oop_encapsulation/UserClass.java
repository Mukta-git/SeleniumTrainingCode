package oop_encapsulation;

public class UserClass {

	public static void main(String[] args) {
		
		Login l1=new Login("test","test123","admin");
		
		System.out.println(l1.getUserName()+" "+ l1.getPassword());
		
		System.out.println(l1.role);
		l1.setPassword("testingpswd");
		System.out.println(l1.getPassword());
		
		System.out.println(l1.getInfo());
		
		Application.getInfo();
		
		
	}

}
