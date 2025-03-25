package AbstractionInJava;

public class TestAbstract {

	public static void main(String[] args) {

		// Parent p=new Child();
		
		Calculater cal=new SciCalculator(1000);
		
		cal.addition();
		cal.calculateAvg(10, 20, 30);
		System.out.println(cal.calculateDiv(25, 5));
		
//		cal.multi();
		Calculater.sub();
		
		System.out.println();
		Calculater indCal=new IndustrialCalcy(2000);
		indCal.addition();
		indCal.calculateAvg(50,60, 80);
	}

}
