import java.util.Scanner;
public class IT26102462LAB4Q2{
     public static void main(String[] args){
		 
     Scanner input = new Scanner(System.in);

      System.out.print("Please enter exam marks (out of 100):");
      double exammarks = input.nextDouble();
	  if (exammarks < 0 || exammarks >100){
          System.out.println("Invalid inpit for exam marks. Terminating program.");
        return; // Exit the program
	  }
	  
	  System.out.print("Please enter submission marks(out of 100):");
      double submissionmark =input.nextDouble();
	  if ( submissionmark< 0 || submissionmark > 100) {
          System.out.println("Invalid input for lab submission marks. Terminating program.");
         return; // Exit the program
	  }
	  
	  System.out.print("Please enter the percentage given for the exam:");
      double exampercentage =input.nextDouble();
	  
	  System.out.print("Please enter the percentage given for the lab submission:");
      double labpercentage =input.nextDouble();
	  
	  if (exampercentage + labpercentage != 100) {
           System.out.println("The percentages must add up to 100. Terminating program.");
        return; // Exit the program
	  }
	  
	  double Finalmark =(exammarks * exampercentage / 100) + (submissionmark * labpercentage / 100);
	  System.out.println("Final Exam Mark is : " + Finalmark);
	  

	 }
 }