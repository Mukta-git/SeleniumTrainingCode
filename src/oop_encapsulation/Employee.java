package oop_encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	
	public void getName(String name) {
		this.name =name;
				
	}
	
	public String setName() {
		return name;
		
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// what is use of toString method

 
	
	
	public static void main(String [] args) {
		Employee e1= new Employee();
		e1.name="Tom";
		e1.age =20;
		e1.salary =12.33;
		System.out.println(e1);
			
	}
}

