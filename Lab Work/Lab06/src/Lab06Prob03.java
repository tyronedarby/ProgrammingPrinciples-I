import java.util.Scanner;

public class Lab06Prob03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// CREATE VARIABLES 
		int count = 0;
		double num = 0;
		int sum = 0;
		double average = 0;
		//CREATE LOOP
		while(num != 672) {
			System.out.println("Enter a Number: ");
			num = input.nextDouble();
			
			
			if(num % 2 == 0 && num >= 2) {
				sum += num;
				count++;
			}
		}
		
		if(count > 0) {
			average = (double) sum / count;
		}
		// OUTPUT 
		System.out.printf("For the positive, even numbers, the sum was %d and the average was %.4f", sum, average);
		
	}
}