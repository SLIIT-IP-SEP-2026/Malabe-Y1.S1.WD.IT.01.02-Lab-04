import java.util.Scanner;

public class IT26102528Lab4Q1 {
    public static void main(String[] args) {

        // Create a Scanner object to get input from the keyboard
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check whether the number is positive
        if (number > 0) {
            System.out.println("The number is: Positive");
        }

        // Check whether the number is negative
        else if (number < 0) {
            System.out.println("The number is: Negative");
        }

        // If the number is neither positive nor negative, it is zero
        else {
            System.out.println("The number is: Zero");
        }

        // Close the Scanner object
        input.close();
    }
}