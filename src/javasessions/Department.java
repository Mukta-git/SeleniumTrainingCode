package javasessions;

public class Department {
	
	public void sendMail() {
		
		System.out.println("Send email");
	}
	
	public static void getInfo() {
		
		System.out.println("Get info");
	}

	public static void main(String[] args) {
		
		Department d= new Department();
		d.sendMail();
		getInfo(); // static method can be called directly
		
		Department.getInfo();
		
		
		

	}

}
