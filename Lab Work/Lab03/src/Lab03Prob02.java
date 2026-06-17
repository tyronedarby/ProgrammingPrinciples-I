import java.util.Scanner;

public class Lab03Prob02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int totalCredit;
		
		System.out.println("Enter current accumulated credit hours: ");
		int creditAccum = input.nextInt();
		
		System.out.println("Enter number of total credit hours: ");
		totalCredit = input.nextInt();
		
		int creditLeft = totalCredit - creditAccum;
		double semester = 15;
//		double year = creditLeft * 2;
		double semesterLeft = creditLeft / 15.0;
		double yearLeft = semesterLeft / 2.0;
		double yearLeft2 = semesterLeft / 3.0;
		
		System.out.println("You have " + creditAccum + " credit hour(s).\n"
				+ "Your degree requires "+ totalCredit +" credit hour(s).\n");
		System.out.println("You have " + creditLeft + " credit hour(s) until graduation.");
		System.out.println("You have " + semesterLeft + " semester(s) (@ 15 credit hours/semester) left until graduation.\n"
				+ "You have " + yearLeft+ " year(s) (@ 2 semesters/year) left until graduation.\n"
				+ "You have " + yearLeft2 + " year(s) (@ 3 semesters/year) left until graduation.");
	}
	
}