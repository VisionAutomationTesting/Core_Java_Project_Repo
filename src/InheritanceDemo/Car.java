package InheritanceDemo;

public class Car extends Vehical{

	int carModelNumber;
	String carComplany;
	
	void carSpecification() {
		System.out.println("all specification is mentioned below");
	}
	
	public static void main(String[] args) {
		System.out.println("first car");
		//Vehical v=new Vehical();
		Car c=new Car();
		c.wheels=4;
		c.enginType="Manual - 1.2 Petrol";
		c.gears=6;
		
		System.out.println(c.wheels);
		System.out.println(c.enginType);
		System.out.println(c.gears);
		c.features("SUV");
		
		
		c.carComplany="TATA";
		c.carModelNumber=2;
		System.out.println(c.carComplany);
		System.out.println(c.carModelNumber);
		c.carSpecification();
		
		System.out.println();
		System.out.println("second car");
		
		//Vehical v2=new Vehical();
		Car c2=new Car();
		c2.wheels=4;
		c2.enginType="Automatic - 1.2 Desal";
		c2.gears=3;
		
		System.out.println(c2.wheels);
		System.out.println(c2.enginType);
		System.out.println(c2.gears);
		c2.features("XUV");
		
		
		c2.carComplany="Mahindra";
		c2.carModelNumber=3;
		System.out.println(c2.carComplany);
		System.out.println(c2.carModelNumber);
		c2.carSpecification();
		
	}

}
