package AbstractionInJava;

public abstract class Calculater{

	int aVal;
	// Abstraction -
	// hiding internal implementation and showing on essential functionality to the
	// end user
	// example ATM, Phone Call
	// security , usability provided by abstraction

	// to achieve Abstraction
	// 1 Abstract Class
	// 2 Interface

	// Abstract class
	// the class should be declare by abstract keyword
	// 0 - 99 % abstraction achieve
	// when we wants to add/show abstract [in-complete] and non abstract [complete-
	// with body] method inside the class
	// abstract method is a method which is declared by abstract keyword and it does
	// not have its implementation [method body]
	// normal method is also known as non abstract method inside the abstract class

	// we can't able to create a object of abstract class
	// to create object / to use abstract class we need a concrete class

	// which contains implementation of all abstract method present in parent

	// abstract / in-complete method
	abstract void calculateAvg(int a, int b, int c);

	abstract int calculateDiv(int num, int div);
	// abstract class does not allow/ contain static, final, private abstract method
//	The abstract method calMutiFotwoNo in type Calculater can only set a visibility modifier, one of public or protected

	abstract void calMutiFotwoNo(int a, int b);

	// the abstract class can contain 0 abstract method

	void addition() {
		System.out.println("this in not abstract /complete method " + aVal);
	}

	// abstract class can contain static, final, private normal method

	static void sub() {
		System.out.println("this is normal method");
	}

	private final void multi() {
		System.out.println("this is normal method");
	}

	// abstract class can contain constructors

//	Calculater() {
//		System.out.println("this is abstract calculatoer class constructors");
//	}

	Calculater(int a) {
		System.out.println("this is abstract calculatoer class constructors " + a);
		aVal = a;
	}

//	public static void main(String[] args) {
//		
//		Calculater c=new Calculater();
//	}
//	
}
