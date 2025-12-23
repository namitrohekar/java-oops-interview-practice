package oops3;


class Vehicle{
	
	final void start() {
		System.out.println("Vehicle Start !");
	}
}


class Car extends Vehicle{
	
//	@Override 
//	final void start() {
//		super.start();
//	}
	
	final void drive() {
		System.out.println("Car is driving ");
	}
	
	
}

public class FinalMethodDemo {
	
	
	public static void main(String[] args) {
		
		/* Once the method is final it becomes immutable even though 
		Inherits the member of parent class it can not override an immutable method
		hence the data stays consistent as intended to be 
		*/
		
		Vehicle v1 = new Vehicle();
		v1.start();
		
		Car c1 = new Car();
		
		c1.drive();
		
	}
	
	

}
