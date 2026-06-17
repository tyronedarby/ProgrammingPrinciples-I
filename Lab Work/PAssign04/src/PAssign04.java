/**
* File: PAssign04.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Sept 20, 2025
* Description: This Java program prompts the user to enter rectangle dimensions and center coordinates, 
* 			   then determines whether a given test point lies within the bounds of that rectangle.
*/

import java.util.Scanner;

public class PAssign04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt for width and height
		System.out.println("Enter width for rectangle: ");
		int width = input.nextInt();
		
		System.out.println("Enter height for rectangle: ");
		int height = input.nextInt();
		
		// Consume the leftover newline after nextInt()
		input.nextLine();
		
        // Check for valid rectangle dimensions
		if(width <= 0 || height <= 0) {
			System.out.println("Your rectangle must have a positive height and width.");
		} else {
			// Prompt for center of the rectangle
			System.out.println("Enter x,y value for center point of rectangle: ");
			String cenPoint = input.nextLine(); 
			
			String[] centerParts = cenPoint.split(",");

	        int centerX = Integer.parseInt(centerParts[0].trim());
	        int centerY = Integer.parseInt(centerParts[1].trim());

			System.out.println("Enter x,y value for test point: ");
			String testPoint = input.nextLine();
			String[] pointParts = testPoint.split(",");

	        int pointX = Integer.parseInt(pointParts[0].trim());
	        int pointY = Integer.parseInt(pointParts[1].trim());
	        
	        // Calculate rectangle bounds
	        int halfWidth = width / 2;
	        int halfHeight = height / 2;

	        int left = centerX - halfWidth;
	        int right = centerX + halfWidth;
	        int bottom = centerY - halfHeight;
	        int top = centerY + halfHeight;

	        // Check if the point is inside the rectangle
	        boolean isInside = (pointX >= left && pointX <= right) &&
	                           (pointY >= bottom && pointY <= top);

	        // Output result
	        if (isInside) {
	            System.out.printf("(%d, %d) is in the rectangle centered at (%d, %d) with width %d and height %d%n", pointX, pointY, centerX, centerY, width, height);
	        } else {
	        	System.out.printf("(%d, %d) is not in the rectangle centered at (%d, %d) with width %d and height %d%n", pointX, pointY, centerX, centerY, width, height);
	        }

		}
		
	}
}