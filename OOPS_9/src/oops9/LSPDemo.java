package oops9;


/*
 * Liskov Substitution Principle(LSP) : means subclasses must honor the parents contract so they can be substituted without breaking correctness
 * 
 */

interface Shape{
	
	double area();	
}

class Rectangle implements Shape{
	
	private double length;
	private double breadth;
	
	public Rectangle( double length , double breadth) {
		this.length =length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		
		return  length * breadth;
	}
}


class Square implements Shape{
	
	private double side;
	
	
	public Square( double side) {
		this.side =side;
		
	}
	
	@Override
	public double area() {
		
		return  side * side;
	}
}


public class LSPDemo {
	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle(11, 7);
		
		Shape square = new Square(13);
		
		System.out.println("Area of Rectangle is : " +rectangle.area());
		System.out.println("Area of Square is : " + square.area());
	}

}
