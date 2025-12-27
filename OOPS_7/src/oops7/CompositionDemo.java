package oops7;

class Engine{

	void start() {
		System.out.println("Engine Started!");
	}
}

class Bike{
	
	Engine engine = new Engine();
	
	void startBike() {
		engine.start();
		System.out.println("Bike started!");
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		
		Bike ninja = new Bike();
		
		ninja.startBike();
	}
}
