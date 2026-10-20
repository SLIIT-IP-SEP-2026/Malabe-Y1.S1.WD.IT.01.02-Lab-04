import java.util.Scanner;
public class IT26100181Lab4Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Getting the inputs...
		System.out.print("\nEnter the number : ");
		int num = input.nextInt();
		
		// Checking the number negative/positive or zero...
		String result = (num > 0 ) ? "The number is a Positive number.":
						(num < 0 )? "The number is a Negative number." : "The number is 0.";
		
		// Printing the result...
		System.out.println(result);
	}
}