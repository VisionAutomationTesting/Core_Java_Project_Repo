package control_statements;

public class BreakAndContinue {

	public static void main(String[] args) {

		System.out.println("START \n");
		// break - used to stop the loop in between
		// break cannot be used outside of a loop or a switch

		for (int i = 0; i < 10; i++) { // dead code is the code which compile knows that it will not going to execute
										// any way

			if (i == 5) {
				break;
			}

			System.out.println(i);
			// System.out.println("--"); // unreachable code
		}

		System.out.println();

		int abc = 9;

		while (abc > 0) {
			System.out.println(abc);

			if (abc % 5 == 0) {
				break;
			}
			abc--;
		}

		System.out.println();

		int xyz = 20;

		for (;;) {
			System.out.println(xyz--);

			if (xyz == 0)
				break;
		}
//		---------------------++++++++------------------------------

		System.out.println("Continue key");

		// to skip the iteration
		// if continue keyword encountered all rest of statement are skipped
		// continue cannot be used outside of a loop

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) {
				System.out.println("- continued -");
				continue;
			}
			System.out.println(" " + i);
		}

		System.out.println();

		int count = 9;

		while (count >= 1) {

			if (count - 3 == 1) {
				System.out.println("-----++-----");
				count--;
				continue;
			}

			System.out.println(count);
			count--; // vvvimp
		}

		System.out.println("\n END");
	}

}
