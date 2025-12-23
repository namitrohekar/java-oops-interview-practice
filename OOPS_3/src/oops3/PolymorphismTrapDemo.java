package oops3;


class A{
	void show() {
		System.out.println("A show");
	}
}

class B extends A {
	
	void show() {
		System.out.println("B show");
	}
}


public class PolymorphismTrapDemo {

	/*
	 * Here in this program we use A class to create Object of B 
	 * the object creation happens at new keyword 
	 * we can understand this by how we sometimes create collections 
	 * we write List on left side and ArrayList on right ArrayList is being implemented through List 
	 * same logic applies here hence A reference is pointing to a B object 
	 * Method calls are resolved at runtime based on the actual object, not the reference type.
	 * so "B show" will print
	 * */
	
	public static void main(String[] args) {
		
		A obj = new B();
		obj.show();
	}
	
}
