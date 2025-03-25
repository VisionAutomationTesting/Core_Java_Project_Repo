package AbstractionInJava;

public class SciCalculator extends Calculater {
// default 
	
	public SciCalculator(int val) {
		super(val);
	}
	
	void signCosTanAdd() {
		System.out.println("this is belongs to SCI cal class");
	}

	void calculateAvg(int a, int b, int c) {
		// hiding the implementation

		int total = a + b + c;
		int avg = total / 3;
		System.out.println("Average is - " + avg);

	}

	int calculateDiv(int num, int div) {

		return num / div;
	}

	
	void calMutiFotwoNo(int a, int b) {
	
		
	}

}
