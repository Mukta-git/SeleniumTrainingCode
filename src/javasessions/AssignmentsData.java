package javasessions;

public class AssignmentsData {

	public static void main(String[] args) {
		
		System.out.println("Ans1");
		String s="Hello";
		String s1= "Mukta S";
		System.out.println(s+ "\n" + s1);
		
		
		System.out.println("Ans2");
		int a=74;
		int b=36;
		System.out.println(a+b);
		
		
		System.out.println("Ans3");
		int a1=50;
		int b1=3;
		System.out.println(a1/b1);
		
		
		System.out.println("Ans6");
		String s2="Hello Selenium";
		char s3='t';
		System.out.println(s2+s3);

		System.out.println("Ans7");
		int a2=100;
		int b2=200;
		int c1= 3400;
		System.out.println(a2+b2+c1);
		
		
		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		
		
		int f1= -25;
		if(f1>0) {
			System.out.println(f1+" is positive number");
			}
		else {
			System.out.println(f1+" is negative number");
		}
		
		
		System.out.println("Ans1 conditional");
		
		int z=125;
		int z1=75;
		int z2=87;
		if(z>z1) {
			if (z>z2) {
				System.out.println(z+ " is greatest number");
			}
		}
				else if(z2>z1) {
				System.out.println(z2+" is greatest");
				}	
				else {
					System.out.println(z1+" is greatst");
				}
			
			
		int r = 12;
        int e = 18;
        int w = 15;
        System.out.println("The Numbers are r= "+r+" e= "+e+" w= "+w);
        int max = (r>e ? (r>w ? r : w): (e>w ? e : w));
        System.out.println("Max= "+max);
        int min = (r<e ? (r<w ? r : w): (e<w ? e : w));
        System.out.println("Min= "+min);
		
		
		//Ternary operator
		int i1 = 10;

		int j1 = 20;

		System.out.println(i1==j1?"Both are equals":"Both are not equal");
		
	}
	
}

		
