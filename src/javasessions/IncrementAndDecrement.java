package javasessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		//Pre increment
		int a= 1;
		int b= ++a;
		System.out.println(a);//2
		System.out.println(b);//2
		
		//Post Increment
		int x=1;
		int y=x++;
		System.out.println(x);//2
		System.out.println(y);//1
		
		//Pre decrement
				int a1= 2;
				int b1= --a1;
				System.out.println(a1);//1
				System.out.println(b1);//1
				
				//Post Decrement
				int x1=2;
				int y1=x1--;
				System.out.println(x1);// 1
				System.out.println(y1);//2
				
				int z=99;
				System.out.println(++z);//100
				int q= -99;
				System.out.println(q++);// -99
				
				int w= 78;
				System.out.println(w--);//78
				
				int e= 88;
				System.out.println(--e);//87
		

	}

}
