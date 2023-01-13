package StringConcept;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		String s= "Testing";
		String s1= "100";
		String s2= "This is my java code  in testing";
		
		System.out.println(s2.length());
		System.out.println(s2.charAt(5));
		//System.out.println(s2.charAt(21));//StringIndexOutOfBoundsException // checked exception
		
		int len= s2.length();
		int li=0;
		int hi=len-1;
		System.out.println("Low index is:" +li);
		System.out.println("Highest index is : " + hi);
		
		System.out.println(s2.indexOf('h'));
		System.out.println(s2.indexOf('i'));// first occurrence of i
		System.out.println(s2.indexOf('i', s2.indexOf('i')+1)); // sec occurrence of i
		
		int inde3= s2.indexOf('i', s2.indexOf('i')+1);
		System.out.println(inde3);
		
		System.out.println(s2.indexOf('i', inde3+1)); // third occurrence of i
		
		int inde4= s2.indexOf('i', inde3+1);
		
		System.out.println(s2.indexOf('i', inde4+1));// fourth occurrence of i
		
		System.out.println(s2.indexOf("java"));
		System.out.println(s2.indexOf("python"));
		
		String msg= "welcome Mukta";
		if(msg.indexOf("Mukta")!= -1) {
			System.out.println("Mukta is present");
		}
		else {
			System.out.println("Mukta is not present");
			
			}
	
		String t1= "hello world";
		String t2= "hello world";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));	
		
	}

}
