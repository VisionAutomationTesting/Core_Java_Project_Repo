package control_statements;

public class IfElseStatements {

	// if .. else statements
	// syntax- rule/structor
	
	// if(condition) true{
	// statements /true block
	//}
	
	
	public static void main(String[] args) {
		
		System.out.println("START");
		int a=10;
		int b=65;
		
		if(a<b) {
			//true block
			System.out.println("if true block"); // type syso and ctrl+space enter
			System.out.println("a value is less then 65 = " + a);
		}
		
		// if ..else
		System.out.println("-------------------");
		
		if(a>=b) { // true or false
			//true block
			System.out.println("if / true block"); // type syso and ctrl+space enter
			System.out.println(a+ "a value is greter then b = " + b);
		}else {
			//false block
			System.out.println("else / false block");
			System.out.println(b+ " b value is greter then a = " + a);
		}
		
		System.out.println("-------------------");
		// if .. else if ... 
		
		if(a>100) {
			//first condition
			System.out.println("a > 100");
		}else if(100==a) {
			// second condition
			System.out.println(" a == than 100");
		}else {
			// end block
			System.out.println(" a is nither > nor == than 100 ");
		}
		System.out.println("-------------------");
		
		// if .. else ladder 
		a=10;
		b=100;
		System.out.println("a = "+a +" b = "+b);
		
		if(a>b) {
			System.out.println("a>b");
		}else if(a>1000) {
			System.out.println("a>1000");
		}else if(b>1000) {
			System.out.println("b>1000");
		}else if(a==b) {
			System.out.println("a==b");
		}else {
			System.out.println("else part");
		}
		
		
		System.out.println("END");
	}

}
