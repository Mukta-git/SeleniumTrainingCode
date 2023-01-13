package javasessions;

public class Employee {
	
	
	String Name;
	int age;
	double salary;
	String city;
	boolean isActive;
	
	
	public static void main(String[] args) {
	
		Employee e= new Employee();
		e.age=32;
		e.Name="Lisa";
		e.city= "Toronto";
		e.isActive =true;
		
		System.out.println(e.Name + " "+ e.age + " " + e.city + " "+e.isActive  );
		System.out.println(e); //reference to employee object so give address where object is stored
		
		
		new Employee().Name= "Ram";// no ref
		System.out.println(new Employee().Name);// giving null as new object got created
		
		Employee e3= new Employee();
		e3=null;
		//e3.Name ="Harry";
		//System.out.println(e3.Name);//NPE
	}

}
