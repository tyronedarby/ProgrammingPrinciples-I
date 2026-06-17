/**
* File: Lab07Prob03.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Oct 3, 2025
* Description:
*/

public class Lab07Prob03 {
    public static void main(String[] args) {
        // Declare variables
        double x = Math.PI / 6.0;
        int numTerms = 7;
        double sign;
        double approximatedCos = 0.0;
        double xPower;
        long factorial;
        int factorialValue;
        double term;
        
        // Outer loop for each term in the Taylor series
        for (int i = 0; i <= numTerms; i++) {
            // Calculate (-1)^i
            sign = Math.pow(-1, i);
            
            // Calculate x^(2i)
            xPower = Math.pow(x, 2 * i);
            
            // Calculate (2i)! using inner loop
            factorial = 1;
            factorialValue = 2 * i; 
            
            // Inner loop to calculate factorial(2i)
            for (int j = 1; j <= factorialValue; j++) {
                factorial *= j;
            }
            
            // Calculate the current term
            term = (sign * xPower) / factorial;
        
            approximatedCos += term;
            
        }
        
        // Calculate the actual value of Cos(PI/6)
        double actualCos = Math.cos(x);
        
        //System.out.println();
        System.out.printf("Actual Cos (PI/6): %.16f%n", actualCos);
        System.out.printf("Approx Cos (PI/6): %.16f%n", approximatedCos);
    }
}