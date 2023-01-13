package Inheritance;

public class TestCar {

	public static void main(String[] args) {
			BMW b= new BMW();
			b.start();//overridden
			b.stop();//inherited
			b.autoParking();//individual
			b.engine();
			
			Audi a= new Audi();
			a.theftSafety();
			
			Car c=new Car();
			c.start();
			c.stop();
			c.refuel();
			c.engine();
			System.out.println("---------");
			
			// top casting
			// child class object can be referenced by parent class ref var.
			Car c1= new BMW();
			c1.start();
			c1.stop();
			c1.refuel();
			c1.engine();
			
			
			// child class object can be referenced by grand parent class ref var.
			Vehicle v1= new BMW();
			v1.engine();
			

	}

}
