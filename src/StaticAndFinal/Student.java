package StaticAndFinal;

//Illegal modifier for the class Student; only public, abstract & final are permitted

/**
 * this is a class which describs Student details and storage of different kinds of informations
 * <p>
 * Strings are constant; their values cannot be changed after they
 * are created. String buffers support mutable strings.
 * Because String objects are immutable they can be shared. For example:
 */

public class Student {

	
		static class extraCuricularActivity{
			
		}
	
		//Illegal modifier for the constructor in type Student; only public, protected & private are permitted
		 Student() {
			
		}
	
	//	static  - is mainly used for memory management perpose
	//  keyword which used to provide common properties to objects
	//	 - it does not require any object to call static things
	//	 - static things will load in memory before class object loading
	// - if any object has changed the static property valuse then all object will get the updated value
	//	 - static can be variable, method, inner-class, blocks
   
	String stdName;
	int rollNo;
	
	static String univercityName="Pune";
	static String batchName="BSC";
	
	//
	static {
		System.out.println("I am static block , I will execute befor main methos");
	}
	
	static void subjectList() {
		System.out.println("Subject() are -- Java, Automation Testing with Selenium, DataBase, Api");
	}
	
	
	 void diplay() {
		System.out.println(stdName);
		System.out.println(rollNo);
		
		System.out.println(univercityName); // can call directly inside the class
		System.out.println(Student.batchName); // call by using class name
		System.out.println();
	}
	
	 //Main method is not static in class StaticAndFinal.Student, please define the main method as:
//	   public static void main(String[] args)
	 // compiler/ it does not require any object to call main method
	 // compiler will always look for main method as structured
	public static void main(String[] args) {

		   //static int abc=0;
		
			System.out.println("Strudent details");
			
			Student s1=new Student();
			s1.stdName="Ramesh";
			s1.rollNo=101;
//			s1.univercityName="Pune";
//			s1.batchName="BSC";
			s1.diplay();
			subjectList();
			
			
			Student s2=new Student();
			s2.stdName="Suresh";
			s2.rollNo=102;
//			s2.univercityName="Latur"; // by using object but this is not recommended
//			s2.batchName="BBA";
			s2.diplay();
			s2.subjectList();
			
			Student s3=new Student();
			s3.stdName="Dinesh";
			s3.rollNo=103;
//			s3.univercityName="Pune";
//			s3.batchName="BSC";
			s3.diplay();
			Student.subjectList(); // recommended
			
			Student s4=new Student();
			s4.stdName="Mahesh";
			s4.rollNo=104;
//			s4.univercityName="Pune";
//			s4.batchName="BSC";
			s4.diplay();
	}

}
