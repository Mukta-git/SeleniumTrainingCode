package javasessions;
import java.util.Scanner;


public class AverageNumb {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
  
 /* public String middle(String s)
  {
      int pos;
      int len;
      
      if(s.length()%2==0) {
    	  pos= s.length();
    	  len=2;
      }
    	  
    	  else {
    		  pos= s.length();
    		  len=1;
    		  
    	  } 
	  return s;
  }*/
  
  
  
}