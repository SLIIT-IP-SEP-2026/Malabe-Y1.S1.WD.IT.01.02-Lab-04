import java.util.Scanner;

public class IT26102597Lab4Q2{
   public static void main (String [] args) {
   
   //Create an object called input to scanner class
   Scanner input = new Scanner (System.in);
   
   //Declare variables
   int number1 , number2, number3, number4;
   
    //Take user input
   System.out.println("Please enter exam marks (out of 100): ");
   number1 = input.nextInt();
   
   if (number1 >= 100)
   {
	   System.out.println("Invalid input for exam marks. Terminating program ");
	   return; //Exit the program
   }
   
   else 
   {
	 System.out.println("Please enter Lab submission marks (out of 100):");
	 
   }
   
     number2 = input.nextInt();
   
   
   if (number2 >= 100)
   {
	   System.out.println("Invalid input for Lab submission marks. Terminating program" );
	  return; //Exit the program 
   }	   
   
   else
   {
	   System.out.println("Please enter the percentage given from the exam: ");
   }
   
   number3 = input.nextInt();
   
   System.out.println("Please enter the percentage given from the lab submission: ");
   number4 = input.nextInt();
   
   //Calculate the Final exam marks
   double finalExamMarks = ((number1 * number3)/100 + (number2  * number4)/100);
   
   
   if ((number3 + number4) == 100)
   {
	 System.out.println("Final exam mark is:" + finalExamMarks );
   }

   else
   {
	 System.out.println("The percentages must add up to 100. Terminating program" );  
	 return;	 
   }
   
     
   }
}
   