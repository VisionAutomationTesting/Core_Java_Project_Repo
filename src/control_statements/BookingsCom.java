package control_statements;

import java.util.Scanner;

public class BookingsCom {

	public static void main(String[] args) {

		System.out.println("Welcome");
		String vehicalOption = "";
		// user first action

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		System.out.println("Please select the correct option");
		
		do {
			

			System.out.println("1 Car");
			System.out.println("2 Driver");
			System.out.println("3 Car with Driver");
			int op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("You have selected a car option");
				vehicalOption = "Car";
				flag = false;
				break;
			case 2:
				System.out.println("You have selected a driver option");
				vehicalOption = "Driver";
				flag = false;
				break;
			case 3:
				System.out.println("You have selected a car with driver option");
				vehicalOption = "Car With Driver";
				flag = false;
				break;
			default:
				System.out.println("!!!!!You have selected a wrong option!!!!!!");
				System.out.println("please select again");
				break;
			}

		} while (flag);

		System.out.println("End");
	}

}
