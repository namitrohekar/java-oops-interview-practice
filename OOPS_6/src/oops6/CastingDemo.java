package oops6;



class Shape{

	void draw() {
		System.out.println("Drawing shape");
	}
}

class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Drawing circle ");
	}
	
	void radius(double radius) {
		System.out.println("The radius of a circle to be drawn is : " + radius);
	}
	
}


class Rectangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Drawing Rectangle ");
	}
	
	void area(double length , double breadth) {
		System.out.println("The area of reactangle is  : " + length * breadth);
	}
	
}



public class CastingDemo {
	
	public static void main(String[] args) {
		
		// Scenario A : UpCasting
		/*
		 * Explanation:
		 * safe because circle is child of shape
		 * understand like every circle IS A shape
		 */
		Shape shape1 = new Circle();
		shape1.draw(); 
		
		// Scenario B : DownCasting without instanceOf
		
		Shape shape2 = new Rectangle();
		
		// this will crash at runtime 
//		Circle wrongCast = (Circle) shape2; // crash here
//		wrongCast.radius(7); // never reached 
		
		
		
		// Scenario C : DounCasting with instanceOf
		Shape shape3 = new Circle();
		
		if(shape3 instanceof Circle) {
			Circle correctCast = (Circle) shape3;
			correctCast.radius(6); // safe call
		}
		
		
		  Shape shape4 = new Rectangle();
	        if (shape4 instanceof Rectangle) {
	            Rectangle rect = (Rectangle) shape4;
	            rect.area(11 , 7); // Safe call
	        }

	}

}
