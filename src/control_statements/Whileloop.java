package control_statements;

public class Whileloop {

	public static void main(String[] args) {

		// while(condition){
		// statements/ while block
		// increment / decrement of expression / loop controler
		// }

		System.out.println("\"START\" \n");
		// first step - create variable for condition
		int i = 1;

		// step 2 - while loop will execute its block until condition got false

		while (i <= 20) { // 6<=5
			System.out.println(i + " Java Programing");

//			if(i==10) {
//				System.out.println(" ");
//			}

			i++;
		}

		// infinite loop - loop without break
		System.out.println();

		int total = 0;
		int a = 1;
		System.out.println("print the total of 1 to 10 number");

		while (a <= 100) {
			total = total + a;
			a++;
		}

		System.out.println("total of 1 to 100 number is = " + total);

		
		System.out.println("revers loop");
		
		
		int b=10;
		
		while(b>0) { // true or false
			System.out.println(b +" Welcom");
			b--;
		}
		
		System.out.println("\nEND");
	}
}
