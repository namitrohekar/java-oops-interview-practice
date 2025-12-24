package oops4;


 abstract class Animal{
	 
	 abstract void makeSound();
	 
	 public void sleep() {
		System.out.println("Sleeping zzzz");
	 }
	
}
 
 
 class Dog extends Animal{

	@Override
	public 	void makeSound() {
		System.out.println("The dog barks");
		super.sleep();
	}
	
 }
	class Cat extends Animal{
		
		@Override
		public 	void makeSound() {
			System.out.println("The cat meow's");
			super.sleep();
		}
	 
 }
 


public class AbstractDemo {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.makeSound();
		cat.makeSound();
		
	}
}
 
