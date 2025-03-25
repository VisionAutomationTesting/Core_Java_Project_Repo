package ThisAndSuperKey;

public class BankAccount {

	String bankAccountType;
	int accountNumber;
	String name;
	double balence;

	// this - keyword is refers to current class object
	//* - it is used to call currant class instance variable
	// - it is used to call currant class method

	//* - it can be pass as method argument
	// - it can be pass in return statement

	// - this keyword is not used inside static block

	void setAccData(String bankAccountType, int accountNumber, String name, double balence) {
		this.bankAccountType = bankAccountType;
		this.accountNumber = accountNumber;
		this.name = name;
		this.balence = balence; // instance variable

//		m1(); // this.m1();

	}

	void m1() {
		System.out.println("this is normal method ---");

		BankAccount baObj = new BankAccount();
		BankAccount baObj2 = m3();

	}

	// XYZ.aMehtod(this);

	void m2(BankAccount obj) {
		obj.m1();
	}

	BankAccount m3() {
//		return new BankAccount();
		return this; // at the return statement
	}

	void getAccDetails() {
		System.out.println("Account details - ");
		System.out.println("Type = " + bankAccountType);
		System.out.println("accountNumber = " + accountNumber);
		System.out.println("name = " + name);
		System.out.println("balence = " + balence);

		this.m1(); // methods
		System.out.println();

		m2(this); // as argument

//		m2(new BankAccount());
	}

}
