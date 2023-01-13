package javasessions;

public class ConditionalStatements {
		
	public void display(int marks) {
		
		if(marks>90 && marks<=100) {
			System.out.println("Grade AA");
		}
		else if(marks>80 && marks<=90) {
			System.out.println("Grade AB");
		}
		else if(marks>70 && marks<=80) {
			System.out.println("Grade BB");
		}
		else if(marks>60 && marks<=70) {
			System.out.println("Grade BC");
		}
			
			else if(marks>50 && marks<=60) {
				System.out.println("Grade CD");
			}
		
			else if(marks>40 && marks<=50) {
				System.out.println("Grade DD");
			}
			else
				System.out.println("Fail");
		
		}
	

	public static void main(String[] args) {
		
		int a= 10;
		int b=20;
		if (a==b) {
			
			System.out.println("Pass");
		}
		else
			System.out.println("fail");
		
		
		boolean f= true;
		if (f) {
			
			System.out.println("pass");
				}
		else
			System.out.println("fail");
		
		
		int marks= 80;
		if(marks>=80) {
			System.out.println("Grade A");
			if (marks>=85) {
				System.out.println("Eligible for scholarship");
			}
				else {
					System.out.println("not eligible for scholarship");
			}
		}
		
		else 
		{
			System.out.println("Grade B");
		}
		
		
		
		String s1= "test";
		String s2= "test1";
		if(s1.equals(s2)) {
			System.out.println("equal");
		}
		else 
			{System.out.println("fail");
				
			}
		
		
		String browser="Firefox";
		
		if(browser.equalsIgnoreCase("CHROME")) {
			System.out.println("launch chrome");
			}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("launch firefox");
			}
		else if(browser.equalsIgnoreCase("edge")) {
			System.out.println("launch edge");
			}
		else 
			System.out.println("check the browser"+ browser);
		
		ConditionalStatements c= new ConditionalStatements();
		c.display(71);

	}

}
