import java.util.Scanner;
public class IT26102405Lab4Q3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInt = input.nextInt();
		
		String message = (userInt > 0) ? "Positive" : 
						 (userInt < 0) ? "Negative" : 
						 "Zero";
		
		System.out.print("The number is: " + message);
	
	}

}