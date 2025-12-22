package oops1;



public class Rectangle {

	private double length;
	private double breadth;
	
	
	public Rectangle( double length , double breadth ) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {
		
		return length * breadth;
	}
	
	public double perimeter() {
		return 2 *(length + breadth);
	}
	
	
	  @Override
	    public String toString() {
	        return "For the given rectangle the Length is : " + length +
	                "and Breadth is= " + breadth  ;
	    }
	
	
	public static void main(String[] args) {
		
		
		Rectangle r1 = new Rectangle(12, 7);
		Rectangle r2 = new Rectangle(17.34, 9.45);
		
		
		
		System.out.println(r1);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		
		
		
		System.out.println(r2);
		System.out.println(r2.area());
		System.out.println(r2.perimeter());
		
		
	}
}
