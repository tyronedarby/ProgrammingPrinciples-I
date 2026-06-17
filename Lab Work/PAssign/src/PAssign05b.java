/**
* File: PAssign05b.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Sept 28, 2025
* Description: A program that asks the user how many exam grades they will be entering and, using a for loop.
*/

import java.util.Scanner;

public class PAssign05b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declare variables 
		double grade = 0;
		int numOfGrades = 0;
		int invalidGrades = 0;
		double minGrade = Double.MAX_VALUE;
        double maxGrade = Double.MIN_VALUE;
        int grades;
        
		int a = 0, b = 0, c = 0, d = 0, f = 0;
		System.out.println("Number of Grades:");
		grades = input.nextInt();
		
		for(int i = 1; i <= grades; i++) {
			//Get user input
			System.out.printf("Enter grade from 0-100 (%d of %d): ", i, grades);
			grade = input.nextDouble();
			
			if(grade >= 0 && grade <= 100) {
				numOfGrades += 1;
				//Update smallest grade
				if (grade < minGrade) {
                    minGrade = grade;
                }
                
                // Update largest grade
                if (grade > maxGrade) {
                    maxGrade = grade;
                }
                //Check the numbers of letter grade
                if(grade >= 90.0 && grade <= 100.0) {
    				a += 1;
    			} else if(grade >= 80.0 && grade <= 89.9){
    				b += 1;
    			} else if(grade >= 70.0 && grade <= 79.9) {
    				c += 1;
    			} else if(grade >= 60.0 && grade <= 69.9) {
    				d += 1;
    			} else {
    				f += 1;
    			}

			} else if(grade != -999.0){
				System.out.println("Error: That is not a valid score.");
				invalidGrades += 1;
			}
			
				
		}
		// Always display the format, use 0.00 for min/max when no valid grades
		if (numOfGrades == 0) {
			System.out.printf("Valid grades: \t%d\nInvalid grades: \t%d\nHighest grade: \t%.2f\nLowest grade: \t%.2f\n", numOfGrades, invalidGrades, 0.0, 0.0);
		} else {
			System.out.printf("Valid grades: \t%d\nInvalid grades: \t%d\nHighest grade: \t%.2f\nLowest grade: \t%.2f\n", numOfGrades, invalidGrades, maxGrade, minGrade);
		}
		System.out.printf("\nAs: \t%d\nBs: \t%d\nCs: \t%d\nDs: \t%d\nFs: \t%d", a, b, c, d, f);
	}
}