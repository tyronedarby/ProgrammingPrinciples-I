/**
 * File: Triangle.java
 * Class: CSCI 1301
 * Author: Brian Abbott, Tyrone Darby
 * Created on: 11/14/25
 * Last modified: 11/14/25
 * Description: This .java file creates a Class per PDF specs.
 */

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle() {
        setSideA(3.0);
        setSideB(4.0);
        setSideC(5.0);
    }

    Triangle(double sideA, double sideB, double sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public double getArea() {
        double s = (this.sideA + this.sideB + this.sideC) / 2.0;
        return Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
    }

    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public String getInfo() {
        return String.format("Side A: %5.2f\tSide B: %5.2f\tSide C: %5.2f\tArea: %5.2f\tPerimeter: %5.2f", getSideA(), getSideB(), getSideC(), getArea(), getPerimeter());
    }

    public double getSideA() {
        return this.sideA;
    }

    public void setSideA(double sideA) {
        // if sideA is less than 0.0, set to 1.0
        this.sideA = sideA > 0.0 ? sideA : 1.0;
    }

    public double getSideB() {
        return this.sideB;
    }

    public void setSideB(double sideB) {
        // if sideB is less than 0.0, set to 1.0
        this.sideB = sideB > 0.0 ? sideB : 1.0;
    }

    public double getSideC() {
        return this.sideC;
    }

    public void setSideC(double sideC) {
        // if sideC is less than 0.0, set to 1.0
        this.sideC = sideC > 0.0 ? sideC : 1.0;
    }

}