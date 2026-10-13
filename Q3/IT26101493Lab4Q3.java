import java.util.Scanner;

public class IT26101493Lab4Q3 {
	
	public static void main (String[]args){
		int number;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		result = (number > 0) ? "The Number is: Positive" :
				 (number < 0) ? "The Number is: Negative" :
				 "The Number is: Zero";
				 
		System.out.print(result);
	}
}