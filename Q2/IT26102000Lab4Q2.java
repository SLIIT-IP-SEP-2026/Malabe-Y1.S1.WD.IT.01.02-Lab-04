import java.util.Scanner;
 
 public class IT26102000Lab4Q2{
 
 public static void main(String[] args){
 
  double examMarks, labMarks, examPercentage, labPercentage, total;
  
  Scanner input = new Scanner(System.in); 
  
  System.out.print("Enter exam marks(out of 100): ");
  examMarks = input.nextDouble();
  
  if(examMarks < 0 || examMarks > 100){
   System.out.print("Invalid input. Terminating the program.");
   return;
  }
  
  System.out.print("Enter lab marks(out of 100): ");
  labMarks = input.nextDouble();
  
  if(labMarks < 0 || labMarks > 100){
   System.out.print("Invalid input. Terminating the program.");
   return;
  }
  
  System.out.print("Enter the percentage for exam marks: ");
  examPercentage = input.nextDouble();
  
  System.out.print("Enter the percentage for lab marks: ");
  labPercentage = input.nextDouble();
  
  if(examPercentage + labPercentage != 100){
   System.out.print("The percentages must add up to 100. Terminating the program.");
   return;
  }
 
  total = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100 );
  System.out.print("The total mark is: " + total);
  
 }
 
 }