 import java.util.Scanner;
public class IT26102425Lab4Q1{
	public static void main (String[]args){
		
		//Declare variables
		int number;
		String result;
		
		//Creating a Scanner object called input
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a number
		System.out.print("Enter a number: ");
		//Storing the recieved input from the user in a variable
		number = input.nextInt();
		
		//Using if condition to check whether the number is positive, negative or zero using the tertiary operator
		if(number>0){
			result = "The number is: Positive";
		}else if(number<0){
			result = "The number is: Negative";
		}else{
			result = "The number is Zero";
		}
						
		//Displaying the result					
		System.out.println(result); 
	}
}