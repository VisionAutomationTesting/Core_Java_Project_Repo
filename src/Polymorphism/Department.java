package Polymorphism;

public class Department {
	
	int age=10;
	
	public Department() {
		System.out.println("Department -----");
	}
	Department(int a){
		
	}
	
	 int departmentDetails(int a, int b) {
		System.out.println("this is Admin department " +a);
		return a+b;
	}
	
	 //final void departmentDetails() 
	  void departmentDetails() {
		System.out.println("Parent Department class method");
	}
	

	void abc() {
		System.out.println("Department classs method abc()");
	}
	
	public static void main(String[] args) {
		
	}
}
