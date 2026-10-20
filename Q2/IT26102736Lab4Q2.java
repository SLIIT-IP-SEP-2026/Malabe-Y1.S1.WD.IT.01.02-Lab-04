import java.util.Scanner;
public class IT26102736Lab4Q2
{
	public static void main(String[]args)
	{
		//Defining Variables
		double examMarks,labMarks,examPercentage,labPercentage,finalMarks;
		
		// Create Scanner object
		Scanner input=new Scanner(System.in);
		
		// 1. Input and validate exam marks
		System.out.print(" Please enter exam marks(out of 100):");
		examMarks=input.nextDouble();
		if (examMarks<0|| examMarks>100){
			System.out.println("Invalid marks for exam marks.Terminating program.");
			return;
		}
		
		// 2. Input and validate lab submission marks
		System.out.print(" Please enter lab submission marks(out of 100):");
		labMarks=input.nextDouble();
		if (labMarks<0|| labMarks>100){
			System.out.println("Invalid marks for lab marks.Terminating program.");
			return;
		}
		
		// 3. Input percentages for exam and lab components
		System.out.print(" Please enter the percentage given for the exam:");
		examPercentage=input.nextDouble();
		System.out.print(" Please enter the percentage given for the lab submission:");
		labPercentage=input.nextDouble();
		
		// 4. Validate that total percentages add up to 100%
		if (examPercentage+labPercentage!=100){
			System.out.println(" The percentage must add up to 100. Terminating the program.");
			return;
		}
		// 5. Calculate final mark based on weighted percentages
		finalMarks=(examMarks*(examPercentage/100))+ (labMarks*(labPercentage/100));
		
		//Displaying the final calculated mark
		System.out.println();
		System.out.println("Final Mark is :"+finalMarks);
		
		//closing scanner
		input.close();
	
	}
}