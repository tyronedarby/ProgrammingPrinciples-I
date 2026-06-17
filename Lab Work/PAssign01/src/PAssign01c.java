/**
* File: PAssign01c.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Aug 29, 2025
*/

public class PAssign01c {
	public static void main(String[] args) {
		double pressure, volume = 0.25;
		int temp = 313;
		int numOfMoles = 1;
		final double R = 8.31446;
		
		pressure = (numOfMoles * R * temp) / volume;
		
		System.out.println("The pressure of " + numOfMoles + " mole(s) of an ideal gas with volume " + volume + " m^3 at temperature " + temp + " K is " + pressure + " pascals.");
	}
}
