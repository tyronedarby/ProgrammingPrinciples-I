/**
* File: PAssign02.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Aug 30, 2025
* Description: calculate the weighted-average for this course.
*/

import java.util.Scanner;

public class PAssign02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Setting a counter at 0.
		int count = 0;
		
		//Getting user input and then calculate the weight for each course work.
		System.out.println("Enter Revel grade: ");
		double revelGrade = input.nextDouble();
		double w1 = revelGrade * 0.10;
		count++;
		
		System.out.println("Enter Programmming Assignment grade: ");
		double pAssgnGrade = input.nextDouble();
		double w2 = pAssgnGrade * 0.10;
		count++;
		
		System.out.println("Enter Lab grade: ");
		double labGrade = input.nextDouble();
		double w3 = labGrade * 0.10;
		count++;
		
		System.out.println("Enter Exam 1 grade: ");
		double exam1 = input.nextDouble();
		double w4 = exam1 * 0.15;
		count++;
		
		System.out.println("Enter Exam 2 grade: ");
		double exam2 = input.nextDouble();
		double w5 = exam2 * 0.15;
		count++;
		
		System.out.println("Enter Exam 1 grade: ");
		double exam3 = input.nextDouble();
		double w6 = exam3 * 0.15;
		count++;
		
		System.out.println("Enter Final Exam grade: ");
		double finalExam = input.nextDouble();
		double w7 = finalExam * 0.25;
		count++;
		
		//Calculate the final grade for the course.
		double finalGrade = (w1 + w2 + w3 + w4 + w5 + w6 + w7);
		
		//Output the result.
		System.out.println("There were " + count + " grades entered.");
		System.out.println("The final grade for this course is " + finalGrade + ".");
	}
}
