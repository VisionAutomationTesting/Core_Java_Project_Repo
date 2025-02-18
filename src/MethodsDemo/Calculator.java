package MethodsDemo;

public class Calculator {

	// Methods / functions- is set statements/ block of code which used to perform a specific task / action
	
	// main method
	 // is a starting point of our java program
	// Why main method is static
	 // static properties load in memory area before class object gets its memory
	 // it does not need to invoked by object
	
	// pre-defined methods 
	 // are methods which declared or created in java library 
	
	// user defined methods
	// static method & non-static/instance methods
	// access_specifier return_type methodName(list of arguments){
	   // method block
	//}
	
	
	//return-type methodName(){}
	void add() {
		
		System.out.println("Add method");
		int a=700;
		int b=30;
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("addition of a+b = "+(a+b));
	}
	
	// common methods for all object
	static void calculationPro() {
		System.out.println("to get this fuction u need to subscribe !!!");
	}
	
	// argument / parameters
	// no limit for arguments list 
	// when you set a argument list then method should be call by that args
	
	void calculateSquare(int num) {
		int sq=num*num;
		System.out.println("Square of num "+ num+ " is ="+sq);
	}
	
	void additionOFtwoNum(int fNum, int sNum) {
		System.out.println("fNum = "+fNum);
		System.out.println("sNum = "+sNum);
		System.out.println("addition of fNum+sNum = "+(fNum+sNum));
	}
	
	void additionOFtwoNumWithFloat(int fNum, double sNum) {
		System.out.println("fNum = "+fNum);
		System.out.println("sNum = "+sNum);
		System.out.println("addition of fNum+sNum = "+(fNum+sNum));
		
	}
	
	//return type
	// all data type and void are the return type
	// a specific type value will be returned by method 
	// void - no return value
	
	
	int abc;
	
	long addFothreeNumber(int a, int b, int c) {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		long sum=a+b+c;
//		System.out.println("sum = "+sum);
		// return typeOFvalue
		return sum; // this statement should be the last statement of your method
		// System.out.println(sum); unreachable
	}
	
	int substraction(int a, int b) {
		int sub=a-b;
		return sub;
	}
	
	// access_specifier return_type methodName(list of arguments){
	public static void main(String[] args) {
		
		System.out.println("Start");
		//
		
		Calculator cal=new Calculator();
		
		// invoke / use/ call
		
		cal.add();
		
		// call static method
		 // directly in static block
		 // using class name
		 // using object - its not recommended by java
		calculationPro();
//		Calculator.calculationPro();
//		cal.calculationPro();
		
		
		cal.calculateSquare(9); // pass the value / parameter
		
		cal.additionOFtwoNum(512, 20);
		
		cal.additionOFtwoNumWithFloat(52,35.95);
		
		
		System.out.println("inside the println and sum = "+ cal.addFothreeNumber(50, 60, 70));// return value
		
		long total = cal.addFothreeNumber(5003, 602, 705);
		
		System.out.println("totla ="+ total);
		System.out.println("avg of total= "+(total/3));
		
		
		System.out.println("-------------------------employee details -------------------------------------------------------");
		//---------------------employee class ------------------
		
		Employee emp1=new Employee();
		emp1.empDetails(101, "Suresh", "Pune");
		
		Employee emp2=new Employee();
		emp2.empDetails(102,"Ramesh","Latur");
		
		System.out.println("End");
	}

}
