/**
* File: PAssign01.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Aug 22, 2025
* Last Modified: Aug 22, 2025
* Description: 
*/

public class Lab02Prob02 {
	public static void main(String[] args) {
		int BirthYear = 1998; 
		int CurrentYear = 2025;
		int age = CurrentYear-BirthYear;
		int In15year = age + 15;
		int TwiceAge = age * 2;
		int HalfAge = age / 2;
		
		
		System.out.print("You were born in " + BirthYear + " and are " + age + " years old.");
		System.out.print("\nIn 15 years, you will be " + In15year+ " years old.\n"
				+ "Someone twice your age is " + TwiceAge + "years old.\n"
			+ "Someone half your age is " + HalfAge + " years old.\n");
	}

}
