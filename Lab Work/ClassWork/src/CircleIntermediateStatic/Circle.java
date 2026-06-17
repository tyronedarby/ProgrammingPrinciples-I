/**
 * File: Circle.java
 * @author Christopher Williams
 * Created on: Jan 10, 2017
 * Modified: Apr 17, 2021
 * Description: Create a Circle class with radius.  Contains examples of 
 *              static data members, instance methods, accessors, and mutators.
 *              Note that the entire class uses the get/set methods wherever 
 *              possible for error-checking purposes.  
 */

class Circle {
	/** The radius of this circle */
	private double radius;
	private static int numberOfCircles;

	/** Default/no-arg constructor, calls convenience constructor */
	public Circle() {
		setRadius(1.0); // default radius of 1
	}
	
	/** Convenience constructor to create with specific radius */
	public Circle(double newRadius) {
		Circle.numberOfCircles++;
		setRadius(radius);
	}
	
	/** Set (mutator) a new radius for this circle */
	public void setRadius(double newRadius) {
		radius = (newRadius > 0) ? newRadius : 0;
	}

	/** Return (accessor) the radius */
	public double getRadius() {
		return radius;
	}

	/** Return the diameter of this circle */
	public double getDiameter() {
		return 2 * getRadius();
	}

	/** Return the area of this circle */
	public double getArea() {
		return getRadius() * getRadius() * Math.PI;
	}

	/** Return the circumference of this circle */
	public double getCircumference() {
		return 2 * getRadius() * Math.PI;
	}
	
	/** Return total number of circles */
	public static int getNumberOfCircles() {
		return Circle.numberOfCircles;
	}
}
