package AccessModifier_2;

import AccessModifier_1.Child;
import AccessModifier_1.Parent;

// non relational class different pack
public class NonRelational {

	public static void main(String[] args) {

		Parent p = new Parent();
//		System.out.println("Public");
		// public
		p.parentM1();
		System.out.println("Paretn age " + p.parentAge);
		// protected - restricted
		// System.out.println("parent car access "+ p.parentCar);

		// default- only accessible inside the pack
//		System.out.println("paretn office  "+ p.parentOffice);

		System.out.println();

		Child c = new Child();
		// public
		c.parentM1();
		System.out.println("Paretn age from child class of same pack " + c.parentAge);
		System.out.println();
		// protected - restricted
		// System.out.println("parent car access "+ c.parentCar);
		// default- only accessible inside the pack
//		System.out.println("paretn office through child "+ c.parentOffice);

		Child_2 c2 = new Child_2();
		// public
		c2.parentM1();
		System.out.println("Paretn age from child class 2 of different pack " + c2.parentAge);
		// protected - restricted
//		 System.out.println("parent car access "+ c2.parentCar);

		// default- only accessible inside the pack
//		System.out.println("paretn office through child "+ c2.parentOffice);
		
		// private - is only accessible inside the same class
//				System.out.println("private -" + p.personal_thing);

	}

}
