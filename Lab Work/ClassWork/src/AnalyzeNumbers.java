import java.util.Scanner;

public class AnalyzeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompt user
		System.out.print("Enter the number of items: ");
		int size = input.nextInt();
		
		// create array of appropriate size
		double[] numbers = new double[size];
		double sum = 0;

		// enter all numbers
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}

		// determine average
		double average = sum / numbers.length;

		// determine count above average
		int count = 0; 
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > average) {
				count++;
			}
		}

		System.out.printf("Average is %.2f%n", average);
		System.out.printf("Number of elements above the average is %d", count);
	}
}