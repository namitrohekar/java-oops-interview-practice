package oops7;


 class Vehicle{
	 
	 void start() {
		 System.out.println("Vehicle Started!");
	 }
 }
 
 class Car extends Vehicle{
	 
	 void drive() {
		 System.out.println("Car is Driving !");
	 }
 }
 
 

public class IsARelationshipDemo {

	public static void main(String[] args) {
		
	Car bmw = new Car();
	
	bmw.start();
	bmw.drive();
		
	}
}
