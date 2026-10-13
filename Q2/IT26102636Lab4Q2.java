import java.util.Scanner;

public class IT26102636Lab4Q2{
   
   public static void main(String[]args){
   
   // Declare the variables
   double examMarks,labMarks,examPercentage,labPercentage,finalMark;
   
   //Create Scanner object to read input
   Scanner input= new Scanner(System.in);
   
   //Input and validate exam marks
   System.out.print("Enter exam marks(out of 100): ");
   examMarks=input.nextDouble();
   if (examMarks<0 || examMarks>100 ){
	   System.out.println("Invalid input for exam marks. Terminating program.");
	   return;
   }
   
   //Input and validate lab submission marks
   System.out.println("Lab submission marks(out of 100): ");
   labMarks=input.nextDouble();
   if (labMarks<0 || labMarks >100){
	   System.out.println("Invalid input for lab submission marks .Ternating program.");
	   return;
   }
   
   //Input percentage for exam marks
   System.out.println("Enter the precentage given for the exam: ");
   examPercentage=input.nextDouble();
   
   //Input percentage for lab submission marks
   System.out.println("Enter the precentage given for the lab submission: ");
   labPercentage=input.nextDouble();
   
   //Validate that percentage add up to 100
   if (examPercentage + labPercentage != 100){
	   System.out.println("The percentage must add up to 100.Terminating program.");
	   return;
   }
   
   //Calculate final exam marks
   finalMark = (examMarks * examPercentage /100) + (labMarks *labPercentage/100);
   
   //Output final exam marks
   System.out.println();
   System.out.println("Final Exam Mark is : "+ finalMark);
   }
}