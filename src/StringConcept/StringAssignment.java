package StringConcept;

public class StringAssignment {

	public static void main(String[] args) {
	
		String str1= "Hello world";
		String str2= "Hello world1";
		String str3= "     Hello      Everyone      ";
		
	//assignment1
			if (str1.equals(str2)) {
				System.out.println("Strings are equal");
			}
			else {
				System.out.println("Strings are unequal");
			}
			
		//assignment 2
			System.out.println(str3.replace(" ", ""));
	
		//ass 3
			String str4="Myworld";
			System.out.println(str4.length());
			int hi= str4.length()-1;
			int lo= 0;
			
			System.out.println("First char is " + str4.charAt(lo));
			System.out.println("First char is " + str4.charAt(hi));
			
			String str5="Hello";
			System.out.println(str1.contains(str5));
			
			//ass5- Reverse your own name
			String str6= "Mukta", revstr="";
			char ch;
			for(int i=0;i<str6.length();i++) {
				ch=str6.charAt(i);
				revstr=ch+ revstr;
				//System.out.println(revstr);
					}
			System.out.println("Reverse String is :" + revstr);
			
			// ass 6- print second half of the string
			String word="Revers";
			char[]a=word.toCharArray();
			for(int i=a.length/2;i<a.length;i++) {
				System.out.print(a[i]);
			}
			
			// String Builder Concept
			
			//1: SB:
			String test = "Selenium";//muineleS
			StringBuilder stb = new StringBuilder(test);
			stb.reverse();
			System.out.println(stb);
			
			//2. 
			int length = test.length();//8
			String rev = "";
			for(int i=length-1; i>=0; i--) {
				rev = rev + test.charAt(i);//muineleS
			}
			System.out.println(rev);
			
			
			String messg = "your username is naveenautomation123";
//			String newStr = messg.substring(7);	
//			System.out.println(newStr);
			
		//	String newStr = messg.substrin
		//	System.out.println(newStr);
			
		String newStr = messg.substring(messg.indexOf(" ")+1, messg.length());
			System.out.println(newStr);
			
	}

}
