package javasessions;

public class SwitchStatements {

	public static void main(String[] args) {
		String br= "cHrome";
	
		switch(br.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
			
		case "firefox":
			System.out.println("launch firefox");
			break;
			
		case "ie":
			System.out.println("launch Ie");
			break;
			
		default:
			System.out.println("please check the browser"+ br);
			break;
		
		}
		
		
		String days= "saturday";
		
		switch(days.toLowerCase()) {
		case "monday":
			System.out.println("its a weekday");
			break;
			
		case "tuesday":
			System.out.println("its a weekday");
			break;
			
		case "saturday":
			System.out.println("its a weekend");
			break;
			
		case "sunday":
			System.out.println("Its a weekend");
			break;
			
		default:
			System.out.println("check the day");
			break;
		
		}
		
		//another way
		String day="Friday";

		switch (day.toLowerCase()) {

		case "monday":

		case "tuesday":

		case "wednesday":

		case "thrusday":

		case "friday":

			System.out.println("Workingday");

			break;

		case "saturday":

		case "sunday":

			System.out.println("Weekend");

			break;

		default:

			System.out.println("Not a valid day");

			break;

		}


		
	}
	
}