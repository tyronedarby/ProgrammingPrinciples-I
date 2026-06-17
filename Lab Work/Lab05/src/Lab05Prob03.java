import java.util.Scanner;

public class Lab05Prob03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a five-letter word: ");
        String word = input.nextLine();
        
        // Check if the word is exactly 5 characters
        if (word.length() != 5) {
            System.out.println("The string you entered (" + word + ") does not contain 5 characters");
            input.close();
            return;
        }
        
        // Store each character in separate char variables
        char firstChar = word.charAt(0);
        char secondChar = word.charAt(1);
        char thirdChar = word.charAt(2);
        char fourthChar = word.charAt(3);
        char fifthChar = word.charAt(4);
        
        // Swap first and last characters
        char temp = firstChar;
        firstChar = fifthChar;
        fifthChar = temp;
        
        // Swap second and fourth characters
        temp = secondChar;
        secondChar = fourthChar;
        fourthChar = temp;
        
        // Reassemble the characters into a new String
        String swappedWord = "" + firstChar + secondChar + thirdChar + fourthChar + fifthChar;
        
        // Print the result
        System.out.println("For the string " + word + " the reverse is " + swappedWord);
        
        input.close();
    }
}