package ThisAndSuperKey;

public class SuperDemo extends Employee {

	// super - is used to refer immediate parent class object
	// - is used to call parent class variable
	// - is used to call parent class methods
	// * - is used to call parent class constructor

	public SuperDemo() {
		super(123456); // it should be called inside the constructor and it should be first statement
//		super(123,"asdg");
		System.out.println(" this is SuperDemo class non parm constuctor");
	}

	SuperDemo(int abc, String n) {
//		this(); // both the statements should be first so it gives error
		super(abc, n);
		System.out.println("this is Super class constructor with 2 parm");
	}

	void demo() {
		System.out.println("this is demo() for SuperDemo class");
		System.out.println("employee id " + super.empId); // variable call
		System.out.println();
		super.empDetails(); // method call
	}

}
