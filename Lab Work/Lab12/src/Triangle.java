
/**
 * File: TriangleLab11.java
 * Class: CSCI 1301
 * Author: Brian Abbott, Tyrone Darby
 * Created on: 11/21/25
 * Last modified: 11/21/25
 * Description: This .java file creates a Class for a triangle.
 */

public class Triangle {
    // private data members
    private double sideA;
    private double sideB;
    private double sideC;
    private static double largestInitialArea;

    // Default, no-arg constructor
    public Triangle() {
        setSideA(3.0);
        setSideB(4.0);
        setSideC(5.0);
        checkInitialArea();
    }

    // Convenience constructor to set all sides
    public Triangle(double newSideA, double newSideB, double newSideC) {
        this();
        setSideA(newSideA);
        setSideB(newSideB);
        setSideC(newSideC);
        checkInitialArea();
    }

    // updates the largest initial area if the value provided is larger
    public void checkInitialArea() {
        if (getArea() > Triangle.getLargestInitialArea()) {
            largestInitialArea = getArea();
        }
    }

    // Returns static property largest initial area
    public static double getLargestInitialArea() {
        return largestInitialArea;
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
