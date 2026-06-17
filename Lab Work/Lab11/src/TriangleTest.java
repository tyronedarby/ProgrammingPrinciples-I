/**
 * File: TriangleTest.java
 * Class: CSCI 1301
 * Author: Brian Abbott, Tyrone
 * Created on: 11/14/25
 * Last modified: 11/14/25
 * Description: This Class tests some Triangle objects.
 */

public class TriangleTest {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(6.4, 8.7, 10.2);
        Triangle triangle3 = new Triangle(-1.0, -2.0, -3.0);

        System.out.println(triangle1.getInfo());
        System.out.println(triangle2.getInfo());
        System.out.println(triangle3.getInfo());
    }

}