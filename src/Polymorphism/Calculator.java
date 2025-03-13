package Polymorphism;

public class Calculator {

	class calC {
		void add() {
			System.out.println("this add method is present inside the inner class");
		}
	}

	// Polymorphism - this is a oops concept
	// Poly - many / multiple
	// morphism - forms / action / approach
	// one task/actions is perform by many ways is known as polymorphism
	// ex. water - liquid, ice [solid], gas [boiling water]
	// search(int/ tring, [colom and rows])
	// utils class

	// 1 compile time Polymorphism - static binding - methods are get bind to each
	// other
	// at the time of compilation
	// Method overloading -
	// - method names should be same
	// - methods should be present inside the same class
	// - parameters should be different
		// - number of parameters
		// - type of parameters [data type]
		// - sequence of parameters
	
	// - only return type or access specifier or static and final keywords are not affect
	// on Method overloading / we can not achieve Method overloading

	// we can overload static , final, constructor and private methods
	
	void add(int a) {
		System.out.println("This is my 1 parm add method " + (a + 100));
	}

	int add(int a, int b, int c) {
		System.out.println("This is my 3 parm add method " + (a + c + b));
		return a + c + b;
	}

	void add(long a, long b) {
		System.out.println("This is my 2 parm add method " + (a + b));
	}
	
	void add(byte age1, byte age2) {
		
	}

	void add(String a, String b) {
		System.out.println("This is my second add method " + a + " " + b);
	}

	void add(int a, short b, int c, int d) {
		System.out.println("This is my 4 parm add method " + (a + c + b + d));
	}

	void sub(int a, int b) {

	}

	void sub(int a, int b, int c) {

	}
//	void add(long a, int b) {
//		System.out.println("This is my second add method "+ (a+b));
//	}

	void addtion(int a) { // not been overloaded

		System.out.println("This is my addition method " + (a + 200));

	}
// -----------------------------------------------------------

	void sub(float a) {

		System.out.println("This is my int substraction method " + (100 - a));

	}

	void sub(int a, long b) {
		System.out.println("int and long");
	}

	void sub(long a, int b) {
		System.out.println("long and int");
	}

//	void sub(long a) { 
//
//		System.out.println("This is my long substraction method " + (100-a));
//
//	}

	// can we overload constructor
	// yes we can by setting different params

	public Calculator() {
		System.out.println("this is no arg constructor");
	}

	public Calculator(int a) {
		System.out.println("this is with arg constructor " + a);
	}

	// can we overload main method
	// yes we can by setting different params

	public static void main(int[] arr) {
		System.out.println("this is int array arg main method");
//		System.out.println(arr);

		for (int i : arr)
			System.out.println(i);
	}

	public static void main(String[] args) {

		Calculator cal = new Calculator(10);
		// cal.add(10, 20);
		short sh1=11;
		cal.add(10, sh1, 12, 13);

		System.out.println("----------------");
		// Automatic Promotion
		// promote one (lower) type of data into another (higher) type

		long sh = 50;
		cal.sub(sh); // call int type of method

		System.out.println("----");

//		 cal.sub(10, 20); // The method sub(int, long) is ambiguous for the type Calculator

		calC c = cal.new calC();
		c.add();

		main(new int[] { 1, 2, 3 });

	}

}
