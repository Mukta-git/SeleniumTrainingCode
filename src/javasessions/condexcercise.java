package javasessions;

public class condexcercise {

	public static void main(String[] args) {
		String env="proD";
		
		switch(env.toLowerCase()) {
		
		case "qa":
			System.out.println("its qa env");
			
		break;
		
		case"int":
			System.out.println("its int env");
			break;
			
		case "full":
			System.out.println("its full env");
			break;
			
		case "prod":
			System.out.println("its prod env");
			break;
			
		default:
			System.out.println("check the env"+ env);
		
		}
		
		
		// switch case cannot work with float or double
		
		int i=12;
switch(i) {
		
		case 10:
			System.out.println("its: "+ i);
			
		break;
		
		case 22:
			System.out.println("its: "+ i);
			break;
			
			
		default:
			System.out.println("check the numb "+ i);
		
		}
		

	}

}
