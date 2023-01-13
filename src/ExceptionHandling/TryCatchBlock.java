package ExceptionHandling;

public class TryCatchBlock {
	String Name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		
		TryCatchBlock obj= new TryCatchBlock();
		
		try {
			obj.Name= "Tom";
			int i= 9/0;
			
			System.out.println("hello"+ i);
		}
		catch(Exception e) {
			System.out.println("AE is coming");
			try {
				int p= 9/0;
			//	System.out.println("bye"+ p);
			}
			
			catch(ArithmeticException e1 ) {
				System.out.println("bye");
			e1.printStackTrace();
			try {
				obj= null;
							}
		 
			catch(NullPointerException e2) {
				System.out.println("see you later");
			e2.printStackTrace();
			
		}
			}

	}

}
	
}