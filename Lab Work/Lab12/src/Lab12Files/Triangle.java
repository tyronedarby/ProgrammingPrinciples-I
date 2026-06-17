/**
 * Triangle class for Lab 12
 */

public class Triangle {
	// private data members
	private double sideA;
	private double sideB;
	private double sideC;
	
	// Default, no-arg constructor
	public Triangle() {
		setSideA(3.0);
		setSideB(4.0);
		setSideC(5.0);
	}
	
	// Convenience constructor to set all sides
	public Triangle(double newSideA, double newSideB, double newSideC) {
		setSideA(newSideA);
		setSideB(newSideB);
		setSideC(newSideC);
	}

	// Return area of Triangle
	public double getArea() {
		double s = getPerimeter() / 2.0;
		return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}
	
	// Return perimeter of Triangle
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
	
	// Accessors/mutators with error checking
	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		if (sideA > 0.0) {
			this.sideA = sideA;
		} else {
			this.sideA = 1.0;
		}
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		if (sideB > 0.0) {
			this.sideB = sideB;
		} else {
			this.sideB = 1.0;
		}
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		if (sideC > 0.0) {
			this.sideC = sideC;
		} else {
			this.sideC = 1.0;
		}
	}

	// String information about each Triangle
	public String getInfo() {
		return String.format("Side A: %5.2f\tSide B: %5.2f\tSide C: %5.2f\tArea: %5.2f\tPerimeter: %5.2f", 
				sideA, sideB, sideC, getArea(), getPerimeter());
	}
		
}
