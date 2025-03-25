package AbstractionInJava;

public interface Vehical extends HigherLevelAutority {

	// to achieve 100 % abstraction & to achieve multiple inheritance in java
	// all methods are abstract and public in nature
	// all variable/ fields are static and final in nature
	// we can not able to add complete methods inside the interface
	// we can not able to add static , final , private methods as well as constructor
	// we can not able to create object of interface , need to use  implementation class
	
	String VEHICAL_INDUSTRY="TATA Moters";
	
//	Interfaces cannot have constructor
//	Vehical(){
//		
//	}

	 void enginType();
	 
	 void ignition();
	 
	 
	 
	 // after java 8 we can add default complete methods inside interface
//	 default void demo() {
//		 
//	 }
	 
	 // after java 9 we can add private method inside the interface
//	 private void demo2() {
//		 
//	 }
}

