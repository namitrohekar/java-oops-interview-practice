package oops5;


interface A{
	
	default void show() {
		System.out.println("A show");
	}
}
interface B{
	
	default void show() {
		System.out.println("B show");
	}
}



class C implements A ,B{

	@Override
	public void show() {
		
		A.super.show();

		B.super.show();
	}
	
	// we can also here do showA and showB 
}	

public class DefaultMethodConflictDemo {
	public static void main(String[] args) {
		
		C obj = new C();
		
		
		obj.show();
		
		// Or 
		A a1 = new C();
		a1.show();
		
		B b1 = new C();
		b1.show();
	}

}
