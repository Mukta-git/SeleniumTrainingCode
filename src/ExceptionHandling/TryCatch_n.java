package ExceptionHandling;

public class TryCatch_n {
	String name1;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		TryCatch_n obj1 = new TryCatch_n();
		// obj = null;
		try {
			obj1.name1 = "Tom";// NPE
			int i = 9 / 0;
			System.out.println("hello"+i);
		}

		catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			try {
				int p = 9 / 0;
			} catch (ArithmeticException e1) {
				e1.printStackTrace();
				
			}
			System.out.println("byeeeeeeeeee");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		} catch (Error e) {
			System.out.println("Error is coming....");
			e.printStackTrace();
		}

		System.out.println("Bye");

		System.out.println("landing on home page...");

		int a[] = new int[2];// 0,1
		try {
			a[4] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is coming....");
			e.printStackTrace();
		}

		System.out.println("logout");

	}

}
