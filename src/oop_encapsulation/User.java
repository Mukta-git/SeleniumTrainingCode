package oop_encapsulation;

public class User {

	public static void main(String[] args) {
		Employee e2= new Employee();
		e2.getName("Peter");
		System.out.println(e2.setName());
		
		e2.setAge(18);
		System.out.println(e2.getAge());
		
		e2.setSalary(12.56);
		System.out.println(e2.getSalary());
		
		Browser br=new Browser();
		br.launchBrowser();
		
		
		//Post - create a user
		Customer c= new Customer("Tom",101,"test@gmail.com");
		// Put/Patch update user 
		//c.setName("Pete");
		//get user
		
		System.out.println(c.getName()+" "+ c.getUserId()+" "+ c.getEmailId());
		
		
		
	}
	
	

}
