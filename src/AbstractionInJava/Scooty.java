package AbstractionInJava;

public class Scooty implements Vehical, TataDept {

	// to achieve multiple inheritance in java
	// we can add multiple interface to class by , separated
	// if suppose 2 same method are present in parent also acceptable because the
	// implementation is same/common for both the method
	public void enginType() {
		System.out.println("normal engin");
	}

	public void ignition() {
		System.out.println("self start");
	}

	public void companyPolicy() {

		System.out.println("tata company policy");
	}

	@Override
	public void vehicalLaw() {
		// TODO Auto-generated method stub

	}

}
