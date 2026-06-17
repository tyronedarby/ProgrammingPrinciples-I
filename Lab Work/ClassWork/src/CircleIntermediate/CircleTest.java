/**
 * File: csci1301/CircleTest.java
 * @author Christopher Williams
 * Created on: Jan 10, 2017
 * Modified: Jul 3, 2019
 * Description: Test the Circle class by creating an instance and working with 
 * 				instance variables and methods
 */

public class CircleTest {
	
	public static void main(String[] args) {
		// Create a circle with the default constructor
		Circle myCircle = new Circle();

		// Output radius (accessor) of object created with default constructor
		System.out.printf("Radius: %.2f%n", myCircle.getRadius());

		// Output Circumference and area of object created with default constructor
		System.out.println("Before changing radius: ");
		System.out.printf("Circumference: %.2f%n", myCircle.getCircumference());
		System.out.printf("Area: %.2f%n%n", myCircle.getArea());

		// Change the radius of the circle using mutator
		myCircle.setRadius(5.0);

		// Output Circumference and area of circle with new radius
		System.out.println("After changing radius: ");
		System.out.printf("Circumference: %.2f%n", myCircle.getCircumference());
		System.out.printf("Area: %.2f%n%n", myCircle.getArea());

		// illustrate reference types ideals (points at memory)
		Circle circ1 = new Circle();
		circ1.setRadius(5);
		Circle circ2 = new Circle();
		System.out.printf("Radius (circ1): %.2f%n", circ1.getRadius());
		System.out.printf("Radius (circ2): %.2f%n%n", circ2.getRadius());
		
		// DEBUG: Print address - ObjectType@address
//		System.out.println(circ1);
//		System.out.println(circ2);
//		System.out.println();

		// make "copy" of reference, now points to same object
		// confirm with debug blocks above and below
		circ2 = circ1;   
		
		// DEBUG: Print address - ObjectType@address 
//		System.out.println(circ1); 
//		System.out.println(circ2);
//		System.out.println();
		
		circ1.setRadius(10.0);
		System.out.printf("Radius (circ1): %.2f%n", circ1.getRadius());
		System.out.printf("Radius (circ2): %.2f%n%n", circ2.getRadius());

	}
}


