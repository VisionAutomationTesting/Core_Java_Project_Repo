package InheritanceDemo;

public class Daughter extends Father{
	
	String daughterVehical="Activa";
	
	void daughterMethod() {
		System.out.println("I am in daughter class method !!!!!!");
	}
	
	public static void main(String[] args) {

		Daughter d=new Daughter();
		System.out.println(d.fatherVehical);
		d.fatherMethod();
		System.out.println(d.daughterVehical);
		d.daughterMethod();
	}
}
