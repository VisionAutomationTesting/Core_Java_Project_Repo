package LogicalPrograms;

public class GreterValBetweenThreeVar {

	public static void main(String[] args) {

		int a = 200;
		int b = 40;
		int c = 232;

		if ((a > b) && (a > c)) {
			System.out.println(a + " a is greather then b and c");
		} else if ((b > a) && (b > c)) {
			System.out.println(b + " b is greather then a and c");
		} else {
			System.out.println(c + " c is greather then a and b");
		}
		
		
		// ? :
		
		String result = (a > b) && (a > c) ?  "a is greter" : ((b > a) && (b > c)) ? "b is greater" : "c is greater";
		
		System.out.println(result);

	}
}
