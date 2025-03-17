package TypeCastingInJava;

public class Sample extends Parent {

	// Type Casting > changing one type of data into another type

	

	// Primitive casting
	// Up Casting

	// casting/ changing lower type of a data into higher type

	// Down Casting
	// casting/ changing higher type of a data into lower type
	
	// Non Primitive casting -- non primitive data types like class , array

	public static void main(String[] args) {

		// Up casting
		// no any data leak
		byte numOFEmployee = 20; // 127
		System.out.println(numOFEmployee);

		int numOFEmployeeInt = numOFEmployee;
		System.out.println(numOFEmployee);

		numOFEmployeeInt = 128;
		System.out.println(numOFEmployeeInt);

		long bigNumOFEmployee = numOFEmployeeInt;
		System.out.println(bigNumOFEmployee);

		System.out.println();
		// down casting
		// Possibility to data leak
		bigNumOFEmployee = 210938l;
		System.out.println("long val - " + bigNumOFEmployee);

		int smallerInt = (int) bigNumOFEmployee;

		System.err.println("int val -  " + smallerInt);

		// --------------------

		char c = 'A';
		System.out.println(c);

		int ch = c;
		System.out.println(ch);

		// ----------------------------------
		// non primitive casting
		// Wrapper classes
		// Byte, Short, Integer, Long, Character, Float, Double

		
		Integer intObje = numOFEmployeeInt;

		System.out.println(intObje);

		// ---
		Parent p = new Parent();
		Sample s = new Sample(); // child

		Parent p1 = new Sample(); // Parent p1=new Child(); only when Sample is inherited by Parent

//		 Sample s1=(Sample) new Parent(); // Child c1=new Parent();  not acceptable in java
//		 
//		 s1.m1();

	}

}
