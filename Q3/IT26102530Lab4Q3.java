import java.util.Scanner;

public class IT26102530Lab4Q3 {
	
    public static void main(String[] args) {
		
		// Declare the variables 
		int number;
		String result ; 
		
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        // Determine whether the number is positive or negative using Ternary Operator
        result = (number > 0) ? "The number is: Positive" : 
                 (number < 0) ? "The number is: Negative" :
				 "The number is: Zero";
        
        // Print the result
        System.out.println(result);
    }
}