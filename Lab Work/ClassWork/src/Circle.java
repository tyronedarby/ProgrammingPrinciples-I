/**
 * File: csci1302/Circle.java
 * @author Christopher Williams
 * Description:  Emulates a circle as an object
 */

class Circle {
	/** The radius of this circle */
	double radius;

	/** Create a default Circle and set defaults for values */
	Circle() {
		radius = 1.0;
	}

	/** Create a Circle with a set radius */
	Circle(double newRadius) {
		radius = newRadius;
	}

	/** Return the diameter of this circle */
	double getDiameter() {
		return 2.0 * radius;
	}

	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return the perimeter (circumference) of this circle */
	double getPerimeter() {
		return 2.0 * radius * Math.PI;
	}
}