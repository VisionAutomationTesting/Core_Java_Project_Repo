package ClassAndObject;

public class Department {
// this is master updates
	String deptName;
	
	static int abc;
	
	void demo() {
		Employee emp1 = new Employee();
		emp1.empId = 202;
	}

	public static void main(String[] args) {
		System.out.println("this is a dept class");

		int abc=9;
		
		Department it = new Department();

		it.deptName = "IT- Information Tech";

		System.out.println(it.deptName);

		Employee emp1 = new Employee();
		emp1.empId = 20;
		emp1.empName = "Ram Sing";
		emp1.empMobileNo = 9874563210l;
		System.out.println(emp1.companyName);
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.empMobileNo);
		
		
		
		System.out.println(Department.abc);//0
		System.out.println(abc);//9
	}

}
