package javasessions;

import java.util.Arrays;

public class ArrayExcercise {

	public static void main(String[] args) {
		int a[]= new int [2];
		a[0]=20;
		a[1]=30;
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
		if(a[i]==20) {
			System.out.println(a[i]);
			break;
		}
		}
		
		//Array literals
		int pop[]= {10,20,30,-50};
		System.out.println(pop.length);
		
		
		String first[]= {"Hi", "bye","See ya"};
		
		for(int i=0; i<=first.length-1;i++) {
		System.out.println(first[i]);
		
		}

		System.out.println("--------------------------");
		/*print-
		00 01 02 03 04 05 06 07 08 09 
		10 11 12 13 14 15 16 17 18 19 
		20 21 22 23 24 25 26 27 28 29 
		30 31 32 33 34 35 36 37 38 39*/
		
		for(int k=0;k<=3;k++) {
			
			for(int m=0;m<=9;m++) {
				System.out.print(k+""+m+" ");
				}
			System.out.println();
		}
		
		//Static array
		Object emp[]=new Object[6];
		emp[0]="Tom";
		emp[1]= 22;	
		emp[2]="Team";
		emp[3]= 2000;
		emp[4]= 'M';
		emp[5]= 125.74;
		
		for(int z=0;z<emp.length-1;z++) {
		System.out.println(emp[z]);
	}
		
		
		int count[]={4,3,2,1,0};
		
		for(int d=0;d<=count.length-1;d++) {
		System.out.println("count = "+count[d]);
		}
		
		/*	 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 

		 */
		
for(int k=0;k<=9;k++) {
			
			for(int m=0;m<=9;m++) {
				System.out.print("- ");
				}
			System.out.println();
		}
//sum of number in array
int count1[]={6,4,3,2,1};
int sum=0;
for(int d=0;d<=count1.length-1;d++) {

sum = sum +count1[d];


}
double average= sum/count.length;
System.out.println(sum);
System.out.println(average);



//using for each loop

int count2[]={5,4,3,2,1};
int sum1=0;
for(int k : count2) {

sum1 +=k;

	
}




System.out.println(sum1);

//Write a Java program to sort a numeric array and a string array.

	int test[]= {100,54,150,52,5};
	
	Arrays.parallelSort(test);
	System.out.println(Arrays.toString(test));
	
String test1[]= {"we","are","best","in","zoo"};
	
	Arrays.parallelSort(test1);
	System.out.println(Arrays.toString(test1));


		
}
}
