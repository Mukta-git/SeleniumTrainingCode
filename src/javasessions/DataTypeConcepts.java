package javasessions;

public class DataTypeConcepts {

	public static void main(String[] args) {
	
		byte a= 10;
		byte b=5;
		
		System.out.println(a+b);
		
		int c= a-b;
		System.out.println(c);
		
		
		short z= 250;
		short z1= 4000;
		int z3= z+z1;
		
		System.out.println(z3);
		
		int d= 456123;
		int d1= 78945612;
		
		int d2=d+d1;
		System.out.println(d2);
		
		long x1= 1234567895111l;
		long x2= 7894563211l;
		
		long x3=x1+x2;
		System.out.println(x3);
		
		
		float h1=1.12f;
		float h2= 22.1f;
		System.out.println(h1+h2);//23.220001, why its not 23.22- binary conversion causes this deviation, use wrapper classes
		
		System.out.println(h1);
		System.out.println(h2);
		
		
		float h4= 100;
		
	System.out.println(h4);
	
	double p1= 1.2366554444d;
	double p2= 23.222225555555d;
	System.out.println(p1+p2);
	
	
	
	boolean y1=true;
	boolean y2= false;
	
	if (y1=true)
	{System.out.println(y1);
	 
	}
	else 
		System.out.println(y2);
	
	
		
		char j1= 'A';
		char j2= 'a';
		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j2-j1);
		System.out.println(j1+j2);
		System.out.println((int)j2);
		System.out.println((byte)'a');
		
		
	}
	
}
