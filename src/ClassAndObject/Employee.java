package ClassAndObject;

public class Employee {

	
	// class is a reserved keyword which denote a class file
	// after class keyword the word is a type / a class type data type
	
//	class Department{}          
//	interface manufacturing{}
	
	int empId;  // instance variable
	String empName;
	long empMobileNo;
	
	String empAddress;
	
	static String companyName="Wipro"; // static variable
	
	void empTask(int jiraId) { // local variable & method
		System.out.println("Employee is working on the jira -"+jiraId);
	}
	
	 static { // block / static block
		System.out.println("this is a static block which execute befor main method");
		System.out.println("a block which loads in the memory before any object");
	}
	
	Employee(){ //constructor 
		System.out.println("this is a constructor of class");
	}
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println("we are in main method");
		
		// object 
		// ClassName  objName=new constructorOfClass();
		// new > is used to create new memory location
		// to call/use non static/instance things inside the static block/method
		
		// Deceleration / instance
		Employee rohit;
		
		rohit=new Employee(); // initilazion / object
		
		rohit.empId=007;
		rohit.empName="Rohit Rao";
		rohit.empMobileNo=9876543210L;
		rohit.empTask(101); 
		
		System.out.println(rohit.empId);
		System.out.println(rohit.empName);
		System.out.println(rohit.empMobileNo);
	
		System.out.println();
		
		Employee  obj=new Employee(); // initilazion / object
		
		obj.empId=007;
		obj.empName="Rohit Rao";
		obj.empMobileNo=9876543210L;
		obj.empTask(101); 
		
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.empMobileNo);
		
		System.out.println();
		System.out.println(rohit.companyName);
		System.out.println(obj.companyName);
		System.out.println(Employee.companyName);
		System.out.println(companyName);
		
	}
	
}
