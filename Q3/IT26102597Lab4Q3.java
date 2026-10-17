import java.util.Scanner;

public class IT26102597Lab4Q3{
   public static void main (String [] args) {
	   
   //Declare variables
   int number;
   String output;
   
   //Create an object called input to scanner class
   Scanner input = new Scanner (System.in);
   
   //Take user input
   System.out.println("Enter a number: ");
   number = input.nextInt();
   
   //Determin whether the the number is positive or negative using ternary operator
   output = (number > 0) ? "The number is: positive" : 
            (number < 0) ? "The number is: negative" :
			"The number is Zero" ;
   
   //Print the output
   System.out.println(output);
   
   
   }
}