import java.util.Scanner;
public class  IT26102487Lab4Q2 {
     public static voi main (String[]args){
	   Scanner input = new Scanner(System.in);
	   
	     // Declare the variables
		 double examMarks , labMarks ,  examPrecentage , labPrecentage,finalMarks  ;
		 
		 // Create a Scanner object to read input 
		 Scanner input = new Scanner  (System.in);
		 
		 //Input and validate exam marks
		 System.out.print("Please enter exam marks (out of 100 ):") ;
		 examMarks = input.nextDouble() ;
		 if (examMarks < 0 || examMarks > 100 ){
		    System.out.println ("Invalid input  for exam marks. Terminating program.")
			return;       // Exit the program
		 }
		 
		
		 
		 //Input and validate lab submission marks
		 System.out.print("Please enter lab submission  marks (out of 100 ):") ;
		 labMarks = input.nextDouble();
		 if (labMarks < 0 || labMarks > 100 ){
		    System.out.println ("Invalid input  for lab submission  marks. Terminating program.");
	        return;       // Exit the program
		 }
		 
		 
		 //Input precentage for exam  marks
		 System.out.print("Please enter the precentage given for the exam :") ;
		 examPrecentage = input.nectDouble();
		 
		 //Input precentage for lab submission  marks
		 System.out.print("Please enter the precentage given for the lab submission :") ;
		 labPrecentage = input.nectDouble();
		 
		 //Validate that precentages add up to 100
		 if (examPrecentage + labPrecentage != 100) {
		     Syestem.out.println("The precentage must add up to 100. Teminating program.");
			 return;         //Exit the program
			 
			 //Calculate final exam marks
			 finalMarks = (examMarks * ecamPrecentage /100) + (labMraks * labPrecentage / 100);
			 
			 //Output.final exam mark
			 System.out.println ();
			 System.out.println ("Final Exam is ; " finalMark);
	 }
  }