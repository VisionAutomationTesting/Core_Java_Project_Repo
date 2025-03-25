package AccessModifier_1;

public class Friend {

	public static void main(String[] args) {

		Parent p=new Parent();
		System.out.println("Public");
		// public
		p.parentM1();
		System.out.println("Paretn age "+ p.parentAge);
		
		// protected
		System.out.println("parent car access "+ p.parentCar);
		
		// default
		System.out.println("parent office "+ p.parentOffice);
				
		
		System.out.println();
		
		Child c=new Child();
		// public
		c.parentM1();
		System.out.println("Paretn age from child class of same pack "+ p.parentAge);
		
		// protected
		System.out.println("parent car access "+ c.parentCar);


		// default
		System.out.println("paretn office through child "+ c.parentOffice);
		
		// private - is only accessible inside the same class
//		System.out.println("private -" + p.personal_thing);
	}

}
