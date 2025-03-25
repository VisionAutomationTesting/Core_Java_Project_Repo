package AbstractionInJava;

public class TestInterface {

	public static void main(String[] args) {

		//Vehical v=new Vehical();

		Vehical v=new Bike();
		v.enginType();
		v.ignition();
		System.out.println(Vehical.VEHICAL_INDUSTRY); // tata
		System.out.println(Bike.VEHICAL_INDUSTRY); // bajaj 
		
//		v.demo();
		
		System.out.println();
		
		v=new Scooty();
		
		v.enginType(); //same
		v.ignition();
		
		//v.companyPolicy();
		System.out.println();
		
		TataDept t=new Scooty();
		t.companyPolicy();
		t.enginType(); // same
		
		t.vehicalLaw();
	}

}
