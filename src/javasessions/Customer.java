package javasessions;

public class Customer {
	
	String name;
	int id;
	String city;
	boolean isActive;
	
	
	//Constructors don't return anything
	// 0 param const or default const
	// cont is helping to initialize class var and helping to create the right object.
	
	public Customer() {
		System.out.println("0 param");
		}
	public Customer(int i) {
		System.out.println("1 param"+i);
		}	
	
	
	
	public Customer(String name, int id, String city, boolean isActive) {
		//super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.isActive = isActive;
	}
	public static void main(String[] args) {
		
		Customer c1= new Customer();
		Customer c2= new Customer(10);
		Customer c3= new Customer("Peter",10,"LA", true);
		System.out.println(c3.name+ " "+ c3.id + " "+ c3.city +" "+c3.isActive );
		//c1;
		
	}

}
