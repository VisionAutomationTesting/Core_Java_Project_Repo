package Polymorphism;

public class Employee extends Department {

	// Run time polymorphisum
	// dynamic binding - methods are get bind to each other at the time of execution
	// when we require to change/ modify the existing logic of parent class method
	// with respective to the sub class
	// mostly used in Abstraction
	// Method Overriding
	// 1 method should have same name
	// 2 method should present in different class
	// 3 method parameter should be same
	// 	- number of parameters
	// 	- type of parameters [data type]
	//	- sequence of parameters
	// 4 the class should have inheritance relation between them
	// 5 return type should be same 

	// static - This static method cannot hide the instance method from Department
	// This instance method cannot override the static method from Department
	// will affect on  Method Overriding
	// we can't achieve Method Overriding by using static at both side
	
	// final - 
	// we can use final keyword at child class overridden method
	// we can't override any parent class final method
	
	// private -  we can't override any  private method
	
	// main-  we can't override any  private method
	
	// constructor -  we can't override any  constructor method
	
	// Abstraction -- Abstract class and Interface

	final int departmentDetails(int x, int y) {
		System.out.println("this is it Employee department " + x);
		System.out.println("Employe details");
		return x+y;
	}
	
	 void departmentDetails() {
		System.out.println("Child Employee class method");
	}

	void EmployeeDetailes() {
		System.out.println("this is normal Employee class method");
	}

	void xyz() {
		
	}
	
	Employee(){
		System.out.println("Employee+++");
	}
	
//	void Department(){
//		System.out.println(" method department");
//	}
	
	
	 int age=90;
	public static void main(String[] args) {
//		int age=30;
//		Department d=new Department();
//		d.abc();
//		d.departmentDetails();
//		d.departmentDetails(10);
		
		System.out.println();
		
		Employee e=new Employee();
		e.abc(); // parent non overrided method
		e.departmentDetails();
		e.departmentDetails(50,60);
		e.EmployeeDetailes();
//		e.Department();
		
		System.out.println("age - "+e.age);
		
		System.out.println();
		// casting
		
		Department d=new Employee();
		d.abc();
		d.departmentDetails();
		d.departmentDetails(0, 0);
		
		System.out.println(d.age);
		
		
		// interface            class
//		WebDriver driver=new ChromeDriver();
		 
	}

}
