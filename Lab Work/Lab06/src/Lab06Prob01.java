import java.util.Scanner;

public class Lab06Prob01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double userInput;
        double smallest = Double.MAX_VALUE;
        double largest = Double.MIN_VALUE;
        boolean validValueEntered = false;
        
        System.out.println("Enter floating-point values between -100.0 and 100.0.");
        System.out.println("Enter -19.5 to exit.");
        
        do {
            System.out.print("Enter a value: ");
            userInput = input.nextDouble();
            
            // Check if it's the sentinel value
            if (userInput == -19.5) {
                break;
            }
            
            // Check if the value is within the valid range
            if (userInput >= -100.0 && userInput <= 100.0) {
                validValueEntered = true;
                
                // Update smallest value
                if (userInput < smallest) {
                    smallest = userInput;
                }
                
                // Update largest value
                if (userInput > largest) {
                    largest = userInput;
                }
            } else {
                System.out.println("Value outside range (-100.0 to 100.0) - ignoring.");
            }
            
        } while (userInput != -19.5);
        
        // Display results
        if (validValueEntered) {
            System.out.printf("The max value was: %.1f%n", largest);
            System.out.printf("The min value was: %.1f%n", smallest);
        } else {
            System.out.println("There were no valid values");
        }
        
        
    }
}