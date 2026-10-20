import java.util.Scanner;
public class IT26102736Lab4Q3
{
	public static void main(String[]args)
	{
		// Define variables
		int number; 
		String result;
		
		// Creates Scanner object
	    Scanner input=new Scanner(System.in);
		
		//Get number from user
		System.out.print(" Enter a number:");
		number= input.nextInt();
		
		//checking if the number is Positive, Negative, or Zero using ternary operator
		result=(number>0) ? " The number is: Positive":
		       (number<0) ? " The number is : Negative":
			   "The number is Zero";
			   
		//display the final results
	    System.out.println(result);
		
		//close scanner
		input.close();

	}
}