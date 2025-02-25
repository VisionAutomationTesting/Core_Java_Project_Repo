package StaticAndFinal;

//public final class Calculator
public class Calculator {

	 // final - is used to create constants in our class
	// final can be variable - the value of variable is fixed / it can not changed 
	// method - the method will not get override / the definition of method will not get updated
	// class - it can not get extended  example :- String class
	
	// naming of variable should be CAPITAL
	 final double PI=3.14;
	 
//	 static {
//		 PI=3.14;
//	 }
	 
	 
	static final String COMPANY_NAME="Wipro";
	
	//The blank final field dimension may not have been initialized
	final int dimension=4;
	
	final void addition(int a, int b) {
		//>>>>>>>>>>>>>>>>>>
		System.out.println("this is final mehtod ="+ (a+b));
	}
	
	//Illegal modifier for the constructor in type Calculator; only public, protected & private are permitted
//	final Calculator() {
//		
//	}
	
	void multi(final int a) {
		//The final local variable a cannot be assigned. It must be blank and not using a compound assignment
//		a=a*a;
		System.out.println(a*a);
	}
	
	public static void main(String[] args) {
    
		// local final variable can be assigned run time
		
		final int abc;
		
		 Calculator cal=new Calculator();
		 
		 // cal.PI=3.14521; // unable to updated the value
		 
		 System.out.println("Value for pi= "+ cal.PI);
		
		 cal.addition(100, 200);
		 
		 abc=45;
		 
		 System.out.println("abc ="+ abc);
		 
		 // abc=84; //The final local variable abc may already have been assigned

		// cal.COMPANY_NAME="TCS";
		 cal.multi(10);
		 
	}

}
