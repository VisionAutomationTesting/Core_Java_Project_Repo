package contructorDemo;

public class Employee {
	
	// Constructor
	 // is a special type of method which is mainly used to initialize an object [to give value to instance variables]

	// when a objected is created then constructor is get called
	// types of constructor
	// 1 - default constructor
	 // which is created by the compiled when used does not added any explicit constructor in his program
	 // Employee() {
	   // super();
    //}
	
	// 2 - user defined constructor
	 // 1 - non parameterized constructor / no argument constructor
	// 2 -  parameterized constructor / with argument constructor
	
	// we can add multiple constructor in single class
	
	// rule to create a user defined constructor
	 // constructor is like a method but/and its name should be same as class name
	 // it does not have any explicit return type, not even void
	
	// constructor returns an instance/object of class
	
	Employee(){
		System.out.println("this is user defined - no argument conrtuctor");
	}
	
	int empId;
	String empName;
	long empMobile;
	
	
	// parameterized constructor 
	//static is Illegal modifier for the constructor in type Employee; only public, protected & private are permitted
	Employee(int i, String n, long m) {
		System.out.println("this is user defined - w argument conrtuctor");
		empId=i;
		empName=n;
		empMobile=m;
	}

	String deptOfEmp(String deptName) {
		//System.out.println("Department is = "+deptName);
		System.out.println();
		return deptName+" of Employee";
	}
	
	void empDetails() {
		System.out.println("empId ="+empId);
		System.out.println("empName ="+empName);
		System.out.println("empMobile ="+empMobile);
		
	}
	
//	void setDetails(int id, String name, long mob) {
//		empId=id;
//		empName=name;
//		empMobile=mob;
//		System.out.println("empid = "+empId);
//		System.out.println("empName = "+empName);
//		System.out.println("empCity ="+empMobile);
//	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		
		Employee e1; // declaration / instantiation
		
		e1=new Employee();
		
		e1.empId=100;
		e1.empName="Dinesh";
		e1.empMobile=9876543210l;
		
		//e1.setDetails(100, "Dinesh", 9876543210l);
		
		e1.empDetails();
		e1.deptOfEmp("IT");
		
		System.out.println();
		
		Employee e2=new Employee(101,"Suresh", 8876543210l); 
		e2.empDetails();
		String dept=e2.deptOfEmp("Abmin");
		
		
		System.out.println(dept);
		
		Employee e3 =new Employee();
		
	}
}

