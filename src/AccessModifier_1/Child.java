package AccessModifier_1;

// same pack - child class
public class Child extends Parent {

	public static void main(String[] args) {

//		Parent p = new Parent();
//		System.out.println("Public");
//		// public
//		p.parentM1();
//		System.out.println("Paretn age " + p.parentAge);

		// protected
//		System.out.println("parent car access " + p.parentCar);
//
//		// default
//		System.out.println("paretn office " + p.parentOffice);

		// private - is only accessible inside the same class
//		System.out.println("private -" + p.personal_thing);
				
		System.out.println();

		Child c = new Child();
		// public
		c.parentM1();
		System.out.println("Paretn age from child class of same pack " + c.parentAge);

		// protected
		System.out.println("parent car access " + c.parentCar);

		// default
		System.out.println("paretn office through child " + c.parentOffice);
		
		// private - is only accessible inside the same class
//		System.out.println("private -" + c.personal_thing);
	}

}
