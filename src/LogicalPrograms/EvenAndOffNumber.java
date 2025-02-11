package LogicalPrograms;

import java.util.Scanner;

public class EvenAndOffNumber {

	public static void main(String[] args) {

		// print given number is even or odd

		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

//		String result= (num%2==0)? num+ " is even number" : num + " is odd number";

		System.out.println((num % 2 == 0) ? num + " is even number" : num + " is odd number");

//		if(num%2==0) {
//			System.out.println(num+" is even number");
//		}else {
//			System.out.println(num+" is odd number");
//		}

//		print 1 to 20 even numbers
		sc.close();

		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println();

// print 20 even numbers

		int count = 1;

		for (int i = 1; i <= 20; i++) {
			
//			while (count % 2 != 0) {
//				count++;
//			}

			if (count % 2 != 0) {
				count++;
			}

			System.out.print(count + ", ");
			count++;
		}

	}

}
