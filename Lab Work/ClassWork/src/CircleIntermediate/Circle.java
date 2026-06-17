/**
 * File: csci1301/Circle.java
 * @author Christopher Williams
 * Created on: Jan 10, 2017
 * Modified: Jul 3, 2019
 * Description: Create a Circle class with radius.  Contains examples of 
 *              static data members and methods, accessors and mutators.
 */


class Circle {
	/** The radius of this circle */
	private double radius;

	/** Default/no-arg constructor */
	public Circle() {
		setRadius(1.0);
	}
	
	/** Convenience constructor to create with specific radius */
	public Circle(double newRadius) {
		setRadius(newRadius);
	}
	
	/** Set a new radius for this circle */
	public void setRadius(double newRadius) {
		radius = (newRadius > 0) ? newRadius : 0;
	}

	/** Eeturn the radius */
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
	
}
