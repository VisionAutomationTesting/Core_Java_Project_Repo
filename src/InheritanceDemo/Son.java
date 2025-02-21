package InheritanceDemo;

public class Son extends Father{
	
	String sonVehical="Sports Bike";
	
	void sonMethod() {
		System.out.println("I am in son class method !!!!!!");
	}
	
	public static void main(String[] args) {

		Son s=new Son();
		System.out.println(s.fatherVehical);
		s.fatherMethod();
		System.out.println(s.sonVehical);
		s.sonMethod();
	}
}
