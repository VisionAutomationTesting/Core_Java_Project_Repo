package control_statements;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("START \n");
		// for(variable deceleration and initilazation ; condition ; increment or
		// decrement)

		for (int i = 0; i <= 5; i++) { // 0 1 2 3 4 5 6
			System.out.println(i + " welcome");// 0 welcome 1 welcome 2 welcome 3 welcome 4 welcome 5 welcome
		}

		System.out.println("revers");
		//

		for (int j = 5; j >= 0; j--) {
			System.out.println(j);
		}
		System.out.println();

		int a = 0;

		for (; a <= 10;) {
			System.out.println(a + " option");

			// a++;
			// a=a+1; // incri by 1

			a = a + 3; // Increase by 2
		}

		// infinite loop

//		for(;;) {
//			System.out.println("infinite loop");
//		}

		System.out.println();
		int[] arr = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
		arr[9] = 100;

//		for(int i=0; i<10; i++) {
//			System.out.println("arr["+i+"]"+" - "+ arr[i]);
//		}

		for (int ele : arr) {
			System.out.println(" - " + ele);
		}
		
		
		System.out.println("nested for loop \n");
		
		
		for(int i=1; i<=2;i++) {
			
			System.out.print("| ");
			for(int j=1;j<=2;j++) {
				
				System.out.print("("+i +" "+ j+") ");
			}
			System.out.println("|");
		}

		System.out.println("\n END");
	}
}
