/**
 * File: csci1301/CircleTest.java
 * @author Christopher Williams
 * Created on: Jan 10, 2017
 * Modified: Apr 17, 2021
 * Description: Test the Circle class by creating an instance and working with 
 * 				instance variables and methods
 */

public class CircleTest {
	
	public static void main(String[] args) {
		// static variables are shared between all instances, should be 0 here
		System.out.printf("Number of Circles: %d\n\n", Circle.getNumberOfCircles());

		// Create a circle with the default constructor
		Circle myCircle = new Circle();

		// Output radius (accessor) of object created with default constructor
		System.out.printf("Radius: %.2f\n\n", myCircle.getRadius());

		// Output Circumference and area of object created with default constructor
		System.out.printf("Before changing radius: \nCircumference: %.2f\n", myCircle.getCircumference());
		System.out.printf("Area: %.2f\n\n", myCircle.getArea());

		// Change the radius of the circle using mutator
		myCircle.setRadius(5.0);

		// Output Circumference and area of circle with new radius
		System.out.printf("After changing radius: \nCircumference: %.2f\n", myCircle.getCircumference());
		System.out.printf("Area: %.2f\n\n", myCircle.getArea());

		// illustrate reference types (ref types hold memory addresses)
		Circle circ1 = new Circle(5.0);
		System.out.printf("Number of Circles: %d\n", Circle.getNumberOfCircles());
		
		Circle circ2 = new Circle();
		System.out.printf("Number of Circles: %d\n\n", Circle.getNumberOfCircles());
		
		// 3 total circles, even though circ1/circ2 have same radius
		System.out.printf("Radius (circ1): %.2f\n", circ1.getRadius());
		System.out.printf("Radius (circ2): %.2f\n\n", circ2.getRadius());
		
		
		// DEBUG: Print memory address - ObjectType@address
		System.out.println("Before copy:");
		System.out.println(circ1);
		System.out.println(circ2);
		System.out.println();

		// make "copy" of reference, now points to same object
		// confirm with debug blocks above and below
		circ2 = circ1;   
		
		// DEBUG: Print memory addresses - ObjectType@address, note they are the same
		System.out.println("After copy:");
		System.out.println(circ1); 
		System.out.println(circ2);
		System.out.println();
		
		// change radius of one
		circ1.setRadius(10.0);
		System.out.println("Radius (circ1): " + circ1.getRadius());
		System.out.println("Radius (circ2): " + circ2.getRadius());
		System.out.println();

		// static variables are shared between all instances
		Circle circ = new Circle();
		System.out.println("Number of Circles: " + Circle.getNumberOfCircles());
	}
}


