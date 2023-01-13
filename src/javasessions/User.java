package javasessions;

public class User {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		
		User u1=new User();
		u1.name= "Raj";
		u1.age =30;
		u1.city= "Delhi";
		
		User u2=new User();
		u2.name= "Anita";
		u2.age =20;
		u2.city= "Bangalore";
		
		User u3=new User();
		u3.name= "John";
		u3.age =32;
		u3.city= "Toronto";
		
		User u4=new User();
		u4.name= "Ram";
		u4.age =35;
		u4.city= "Calgary";
		
		
		System.out.println(u1.name +" "+ u1.age+ " "+ u1.city); //Raj
		System.out.println(u2.name +" "+ u2.age+ " "+ u2.city);//Anita
		System.out.println(u3.name +" "+ u3.age+ " "+ u3.city);//John
		System.out.println(u4.name +" "+ u4.age+ " "+ u4.city);//Ram
		
		System.out.println("-------------------");
		u1=u2;
		
		System.out.println(u1.name +" "+ u1.age+ " "+ u1.city);//Anita
		System.out.println(u2.name +" "+ u2.age+ " "+ u2.city);//Anita
		System.out.println(u3.name +" "+ u3.age+ " "+ u3.city);//John
		System.out.println(u4.name +" "+ u4.age+ " "+ u4.city);//Ram

		System.out.println("-------------------");
		u2=u3;
		
		System.out.println(u1.name +" "+ u1.age+ " "+ u1.city);//Anita
		System.out.println(u2.name +" "+ u2.age+ " "+ u2.city);//John
		System.out.println(u3.name +" "+ u3.age+ " "+ u3.city);//John
		System.out.println(u4.name +" "+ u4.age+ " "+ u4.city);//Ram
		
		System.out.println("-------------------");
		u3=u4;
		
		System.out.println(u1.name +" "+ u1.age+ " "+ u1.city);//Anita
		System.out.println(u2.name +" "+ u2.age+ " "+ u2.city);//John
		System.out.println(u3.name +" "+ u3.age+ " "+ u3.city);//Ram
		System.out.println(u4.name +" "+ u4.age+ " "+ u4.city);//Ram
		
		System.out.println("-------------------");
		u4=u1;
		
		System.out.println(u1.name +" "+ u1.age+ " "+ u1.city);//Anita
		System.out.println(u2.name +" "+ u2.age+ " "+ u2.city);//Anita
		System.out.println(u3.name +" "+ u3.age+ " "+ u3.city);//John
		System.out.println(u4.name +" "+ u4.age+ " "+ u4.city);//Anita
	}

}
