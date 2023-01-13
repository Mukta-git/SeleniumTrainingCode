package Inheritance;

// IS A Relationship
public class BMW extends Car{

	// mMethod overriding: same name in child and parent class, same no. of params,
	//same sequence of params and same return type-> Run time Polymorphism 
	
	//final- to prevent method overriding
	// to prevent inheritance
	// to provide constant values
	
	//private methods cannot be overridden
	
	@Override
	public void start() {
		System.out.println("BMW...start");
	}
	
	public void autoParking() {
		System.out.println("BMW Autoparking");
	}
	
	// overridden can happen for non static method

	//method hiding
	public static void billing(){
		System.out.println("bmw billing");
	}
}
