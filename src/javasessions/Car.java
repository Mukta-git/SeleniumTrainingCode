package javasessions;

public class Car {

	String Name;
	int price;
	String color;
	static int wheels=4;
	
	
	public static void main(String[] args) {
		Car c= new Car();
		c.Name= "BMW";
		c.price =500;
		c.color ="red";
		
		
		Car c1= new Car();
		c1.Name= "BMW";
		c1.price =50;
		c1.color ="black";
		
		Car c2= new Car();
		c2.Name= "Audi";
		c2.price =40;
		c2.color ="Grey";
		
		System.out.println(Car.wheels);//access by class name 
		System.out.println(wheels);//access directly 
		
		// static var can be changed, so final keyword is used. final is used to make value constant
		// static is used where there is common value of the class.
		// var declared inside method is called local var. Static cannot used for local.

	}

}
