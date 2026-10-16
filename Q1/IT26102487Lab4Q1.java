import java.util.Scanner;
public class IT26102487Lab4Q1 {
   public static void main(String[]args){
       // Create a Scanner object to read input
	   Scanner input = new Scanner (System.in);
	   
	   int number;
	   
	   // Prompt user to enter a number
	   System.out.print("Enter a number: ");
	   number = input.nextInt();
	   
	   //Check if the number is positive ,negative,or zero
	   if (number > 0) {
	       System.out.println("The number is: Positive");
		 }
		 else if (number < 0){
		 System.out.println("The number is : Negative");
		 }
		 else {
		 System.out.println("The number is : Zero");
		 }
   }
}