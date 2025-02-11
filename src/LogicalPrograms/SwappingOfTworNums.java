package LogicalPrograms;

public class SwappingOfTworNums {

	public static void main(String[] args) {


		// Comparison/ swapping of two number with using third variable
		
		int a= 20;
		int b= 30;
		
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println(" after swap");
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		
		System.out.println();

		//		without 3rd variable
		
		int x=40;
		int y=60;
		
		System.out.println("Value of x = "+x);
		System.out.println("Value of y = "+y);
		
		x=x+y; // 40+60=100
		
		y=x-y; // 100-60=40
		x=x-y; // 100-40=60
		System.out.println(" after swap");
		
		System.out.println("Value of x = "+x);
		System.out.println("Value of y = "+y);
		
	}

}
