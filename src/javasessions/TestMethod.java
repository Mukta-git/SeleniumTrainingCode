package javasessions;

public class TestMethod {
	
	// data variables
	//class var
	// methods/functions
	
	public int sum(int a, int b) {
			int total=a+b;
		return total;
	}
		
		public int mut() {
			int x=10;
			int y=20;
			int amount=x*y;
			return amount;
		}
		
		public String testsum(String Name) {
			
			//System.out.println(Name);
			return Name;
		}
		
		
		public int maximum(int a, int b, int c) {
			int max= (a>b?(a>c?a:c):(b>c?b:c));       
		    return max;
			
		}
		
		public int minimum(int a, int b, int c) {
		int min =(a<b?(a<c? a:c):(b<c?b:c));
	  
	    return min;
		}
		
		public double circum(double r) {
			double circumference= 2*3.14*r;
			return circumference;
			
		}
	

	public static void main(String[] args) {
		TestMethod t = new TestMethod();
		int sum1= t.sum(30,40);
		System.out.println(sum1);
		
		int amount1= t.mut();
		System.out.println(amount1);
		
		String s=t.testsum("John");
		System.out.println(s);
		
		
		int max1=t.maximum(10,25, 5);
		System.out.println("Max= "+ max1);
		
		
		int min1= t.minimum(10, 2, 3);
		System.out.println("Min= "+min1);
		
		System.out.println(t.circum(5));

	}

}
