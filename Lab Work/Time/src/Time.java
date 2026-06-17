import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Months: ");
		int totalMonths = input.nextInt();
		
		int totalYears = totalMonths / 12;
		int totalMonthLeft = totalMonths % 12;
		
		System.out.println(totalYears + " Year/Years" + "\n" + totalMonthLeft + " Month/Months");
	}
}
