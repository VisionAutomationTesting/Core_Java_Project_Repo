package AccessModifier_1;

//Illegal modifier for the class Parent; only public, abstract & final are permitted
public class Parent {

	// all access modifiers are accessible
	class demo {

	}

	// Public -
	public int parentAge = 40;

	public void parentM1() {
		System.out.println("This is public parnet class m1 method");
	}

	// Protected

	protected String parentCar = "Tata Safari";

	// default

	String parentOffice = "Kothrud MAin Branch";

	// private

	private String personal_thing = "Tijori";

	// what is the access modifier for default constructor - is class accessibility
	public Parent() {
		System.out.println(" parent class constructor");
	}

	public static void main(String[] args) {

//		Parent.main(args);

		System.out.println("this is main call");

		// Public - inside the class
		Parent p = new Parent();
		p.parentM1();
		System.out.println("Paretn age " + p.parentAge);

		// protected

		System.out.println("car " + p.parentCar);

		// default

		System.out.println(" office -" + p.parentOffice);

		// private - is only accessible inside the same class
		System.out.println("private -" + p.personal_thing);
	}

}
