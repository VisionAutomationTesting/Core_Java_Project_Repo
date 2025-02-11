package control_statements;

import java.util.Scanner;

public class SwitchCaseStatements {

	public static void main(String[] args) {

		// after every case break statement should be mentiond or it will excute until
		// next break statement
		// if no case is given in switch it will execute default case

		// Only convertible int values, strings or enum variables are permitted

		System.out.println("Start");
		// mon => Monday
		// tue => Tuesday
		// wed => Wednesday
		// thr => Thursday
		// fri => Friday
		// sat => Saturday
		// sun => Sunday

		// diat plan

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a single charatecr");
//		char day = sc.next().charAt(0);

		String daystr = sc.next();

//		if(day=="mon") {
//			System.out.println("Today is Monday");
//			System.out.println("Apple, milk, Panner ");
//		}else if(day=="tue") {
//			System.out.println("Today is Tuesday");
//			System.out.println("Milk, Avakado, Green salad ");
//		}

		// dayVa==3; [case 3]

		switch (daystr) {

		case "mon": {
			String model = "creative";

			switch (model) {
			case "creative":
				System.out.println("creative");
				break;
			}

			System.out.println("Case 1 - mon");

			System.out.println("Today is Monday");
			System.out.println("Apple, milk, Panner ");

		}
			break;

		case "tue":
			System.out.println("Case 2 - tue");

			System.out.println("Today is Tuesday");
			System.out.println("Milk, Avakado, Green salad ");
			break;

		case "wed":
			System.out.println("Case 3 - wed");

			System.out.println("Today is Wednesday");
			System.out.println("DragenDruit, Avakado, Green sabji ");
			break;

		case "thr":
			System.out.println("Case 4 - thr");

			System.out.println("Today is Thursday");
			System.out.println("Greps, milk, Panner Paratha ");
			break;

		case "fri":
			System.out.println("Case 5 - fri");

			System.out.println("Today is Friday");
			System.out.println("Milk, Orenge, Veg ");
			break;

		case "sat":
			System.out.println("Case 6 - sat");

			System.out.println("Today is Saturday");
			System.out.println(" milk, Panner ");
			break;

		case "sun":
			System.out.println("Case 7 - sun");

			System.out.println("Today is Sunday");
			System.out.println("non veg ,Green salad ");
			break;

		default:
			System.out.println("wrong input / case is not matching");
		}

		System.out.println("END");

		sc.close();
	}

}
