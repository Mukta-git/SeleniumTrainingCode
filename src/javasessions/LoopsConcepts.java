package javasessions;

public class LoopsConcepts {

	public static void main(String[] args) {
		
	//Assignment 1
		
		String s= "I am Batman";
		int i=1;
		
		while(i<=5) {
			System.out.println(s);
			i++;
			
		}
		
		//Assignment 2
		
		int j= 1;
		while (j<=10) {
			System.out.println((s)+ " "+ j);
			j++;
		}
		
		
		// Assignment 3-WAP to print 10 to 1 using for, while and do-while loop
		
		int a=10;
		while(a>=1) {
			System.out.println(a);
			a--;
		}
		
		int b=10;
		do {
			System.out.println(b);
			b--;
		}while(b>=1);
		
		//Assignment 4
		
		String t= "Hello World";
		byte w=1;
		while(w<=10) {
			System.out.println(t);
			w++;
		}
		
		//Assignment 5
		int m = 1;
		while(m<=10) {
			System.out.println(m);
			m++;
		}
		
		// Assignment 6
		
			int z=10;
			int x= 20;
			//int u=50;
			
			System.out.println(Math.max(z,x)+ "max number");
			
		//A7- even
		int p=1;
		for(;p<=100;p++) {
			
		if(p%2==0) {
			System.out.println(p);
		}
			
		}
		
	//A7 odd
		int o=1;
		for(;o<=100;o++) {
			
		if(o%2==1) {
			System.out.println(o);
		}
			
		}
		
		//A9 A-Z
		char ch= 'A';
		
		for(;ch<='Z';ch++) {
			System.out.println(ch);
		System.out.println("ASCII value is "+ (int)ch);
	
		
	}
		//A9 a-z
char ch1= 'a';
		
		for(;ch1<='z';ch1++) {
			System.out.println(ch1);
		System.out.println("ASCII value is "+ (int)ch1);
			
	}
	
		//A9 0-9
		char ch2= '0';
				
				for(;ch2<='9';ch2++) {
					System.out.println(ch2);
				System.out.println("ASCII value is "+ (int)ch2);
					
			}
		//Ans 10
				System.out.println("This is ans 10");
				double g=1.0;
				for(;g<=10.0;g++) {
					System.out.println(g);
				}
				
		//Ans 11
				System.out.println("This is ans 11");
				
				int h=1;
				for(;h<=10;h++) {
					System.out.println(h);
					if(h%7==0) {
						System.out.println("bye, see you tomorrow");
						break;
					}
				}
				
		//Ans12
				System.out.println("Ans12");
				
				int score=0;
				for (;score<=100;score++) {
					if(score==0) {
						System.out.println("Zero duck");
						break;
								}
					if(score==25) {
						System.out.println("Good Job");
						break;
								}
					
					if(score==50) {
						System.out.println("good job - half century");
						break;
								}
					else if(score==100) {
						System.out.println("good job - century");
						break;
								} 
				}
				
				int score1=100;
				while(score1<=100) {
					
					if(score1==0) {
						System.out.println("Zero duck");
						break;
								}
					if(score1==25) {
						System.out.println("Good Job");
						break;
								}
					
					if(score1==50) {
						System.out.println("good job - half century");
						break;
								}
					else if(score1==100) {
						System.out.println("good job - century");
						break;
								}
					score1++;
				}
			
		// do while		
				int n=1;
				do {
					System.out.println(n);
					n++;
					
				}while(n<5);
				
				//using ramdom() method
                System.out.println("\nRandom number using random method:");
                for (int f=1;f<=5 ;f++ )
                {
                        System.out.println(Math.random());
                }
				
				
}
}