package StaticAndFinal;

//The type Sample cannot subclass the final class Calculator
public class Sample extends Calculator{

	// overriding - Cannot override the final method from Calculator
//	void addition(int e, int f) {
//		
//	}
	
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		
		System.out.println(s.PI);
		System.out.println(s.dimension);
		System.out.println(Sample.COMPANY_NAME);
		
	}
}
