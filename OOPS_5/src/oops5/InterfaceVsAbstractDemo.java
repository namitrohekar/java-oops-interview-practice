package oops5;


abstract class Vehicle{
	
	private double speed;
	
	public Vehicle(double speed) {
		this.speed= speed;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	void start() {
		System.out.println("Vehicle Started!");
	}
	
	abstract void move();
}

class Car extends Vehicle{
	
	
	
	public Car(double speed) {
		super(speed);
	
	}

	@Override
	public void move() {
		System.out.println("Car is moving at speed" + getSpeed() );
	}
}






interface Movable{
	
	void move();
}

class Bike implements Movable{
	
	@Override
	public void move() {
		System.out.println("Bike is moving");
	}
	
	public void start() {
		System.out.println("Bike is started");
	}
}



public class InterfaceVsAbstractDemo {

	public static void main(String[] args) {
		
		
		Vehicle v1 = new Car(25);
		v1.start();
		
		Movable m1 = new Bike();
		
		m1.move();
		
		
		Bike b1 = new Bike();
		b1.start();
		
	}

}
