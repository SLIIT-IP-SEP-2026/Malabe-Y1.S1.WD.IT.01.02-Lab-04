import java.util.Scanner;

public class IT26102597Lab4Q1{
   public static void main (String [] args) {
   
   //Create an object called input to scanner class
   Scanner input = new Scanner (System.in);
   
   //Declare variables
   int number;
   
   //Take user input
   System.out.println("Enter a number: ");
   number = input.nextInt();
   
   //Check number
   if  (number > 0)
   {
	   System.out.println("The number is: " + "positive" );
   }
   else if (number < 0)
   {
	   System.out.println("The number is: " + "negative" );
   }
   else if(number == 0)
   {
	   System.out.println("The number is Zero" );
   }
   
   }
}