package InheritanceDemo;

public class Child extends Parent{

	int childAge=25;
	
	void childClassMethod() {
		System.out.println("I am in child class method");
	}
	public static void main(String[] args) {

//		Parent p=new Parent();
//		System.out.println(p.parentAge);
//		p.parentClassMethod();

		Child c=new Child();
		System.out.println("Child age "+c.childAge);
		c.childClassMethod();
		
		// parent properties
		
		System.out.println("Parent age "+c.parentAge);
		c.parentClassMethod();
		
		//Grand parent properties
		System.out.println("Grand Parent age "+c.GrandParentAge);
		c.grandParentClassMethod();
		
		System.out.println("-------------------------");

		Parent p=new Parent();
		System.out.println("Grand Parent age "+p.GrandParentAge);
		p.grandParentClassMethod();
		System.out.println("Parent age "+p.parentAge);
		p.parentClassMethod();
		
//		GrandParent gp=new GrandParent();
	}

}
