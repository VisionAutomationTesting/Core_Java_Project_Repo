package AbstractionInJava;

public class IndustrialCalcy extends Calculater{


	IndustrialCalcy(int a) {
		super(a);
	}


	void calculateAvg(int a, int b, int c) {
		System.out.println("this is n ind cal avg method " + (a+b+c)/3);
	}


	int calculateDiv(int num, int div) {
		int total=num/div;
		return total;
	}



	void calMutiFotwoNo(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
