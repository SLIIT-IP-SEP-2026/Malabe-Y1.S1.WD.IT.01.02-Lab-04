import java.util.Scanner;

public class IT26102528Lab4Q3 {
    public static void main(String[] args) {

        // Create a Scanner object to get keyboard input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Use the ternary operator to check the number
        String result = (number > 0) ? "Positive"
                      : (number < 0) ? "Negative"
                      : "Zero";

        // Display the result
        System.out.println("The number is: " + result);

        // Close the Scanner object
        input.close();
    }
}