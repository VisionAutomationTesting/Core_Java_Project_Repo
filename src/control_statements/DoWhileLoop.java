package control_statements;

public class DoWhileLoop {

	public static void main(String[] args) {
		System.out.println("start\n");
		// do while loop is always executed at least one time even condition is get
		// false

		int a=0;

		do {
			
//			a=5; // run time value is get piked
			System.out.println(a + " Java Programing");
			
			a++;
		} while (a <= 10);
		
		System.out.println();
		
		int i=10;
		
		do {
			System.out.println(i--);
		}while(i>=1);
		

		System.out.println("\nEnd");
		
		// while 
		// first check the condition	
		// if condition is false the while block is not executed
		// while does not use ; to end
		
		// do while 
		// at first do block is executed and the last condition is get checked
		// if condition is false the do  block will  executed for one time
		// do while need to close by ; at the end
	
	}

}
