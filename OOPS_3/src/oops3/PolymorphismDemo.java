package oops3;

import java.util.ArrayList;

/*
 This program has classes and methods used in ShapeDemo 
 Since its same package I am able to call them if you are doing this independently kindly make them 
 */


public class PolymorphismDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Shape> shapeList = new ArrayList<>();
		
		shapeList.add( new Rectangle(13, 7));
		shapeList.add(new Circle(7));
		shapeList.add( new Rectangle(11, 5));
		shapeList.add(new Circle(17));
		
		for( Shape s : shapeList) {
			System.out.println("Area is : " +  s.area());
		}
		
	}

}
