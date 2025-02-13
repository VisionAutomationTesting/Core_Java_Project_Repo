package MethodsDemo;

public class Employee {

	
	int empid;
	String empName;
	String empCity;
	
	void empDetails(int id, String name, String city) {
		empid=id;
		empName=name;
		empCity=city;
		System.out.println("empid = "+empid);
		System.out.println("empName = "+empName);
		System.out.println("empCity ="+empCity);
	}
	
}
