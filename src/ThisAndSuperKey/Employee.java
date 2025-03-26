package ThisAndSuperKey;

public class Employee {

	int empId;
	String empName;

	public Employee(int id) {
		empId = id;
		System.out.println("This is with parm constructor from Emploee class");
	}

	public Employee(int id, String n) {
		this(id);
		empId = id;
		empName = n;
		System.out.println("This is with 2 parm constructor from Emploee class");
	}

	void empDetails() {
		System.out.println("Employee details");
		System.out.println("empId - " + empId); // this.empId
		System.out.println("empName - " + empName);
	}
}
