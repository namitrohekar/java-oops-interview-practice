package oops3;





class Shape{
	
	public double area() {
		return 0;
	}
}

class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	
	public Rectangle( double length , double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		
		return   length * breadth;
	}
	
}

class Circle extends Shape{
	private double radius;
	
	public Circle( double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return  3.14*(radius*radius);
	}
	
}


public class ShapeDemo {
	
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(12.3 , 8.7 );
		
		Circle c = new Circle(3.14);
		
		
		System.out.println("Area of Circle " +  c.area());
		System.out.println("Area of Rectangle " + r.area());
	}

}
