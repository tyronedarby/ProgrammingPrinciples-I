import java.util.Scanner;

class Lab02Prob03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create an integer named birthYear and store 1997
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();
        int currentYear = 2025;
        int currentAge = currentYear - birthYear;
        int ageIn15Years = currentAge + 15;
        int twiceAge = currentAge * 2;
        double halfAge = currentAge / 2.0;

        System.out.println("You were born in " + birthYear + " and are " + currentAge + " years old.");
        System.out.println("In 15 years, you will be " + ageIn15Years + " years old.");
        System.out.println("Someone twice your age is " + twiceAge + " years old.");
        System.out.println("Someone half your age is " + halfAge + " years old.");
    }

}