import java.util.Scanner;
public class IT26102425Lab4Q2{
	public static void main(String[]args){
		
		//Declare the variables
		double examMarks, labMarks, examPercentage, labPercentage, finalMark;
		
		//Create a Scanner object called input to read input
		Scanner input = new Scanner(System.in);
		
		//Input and validate exam marks 
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextDouble();
		if(examMarks<0 || examMarks>100){
			System.out.println("Invalid input for exam marks. Terminating program");
			//Exit the program
			return;
		}
		
		//Input and validate lab submission marks 
		System.out.print("Please enter lab submission marks (out of 100): ");
		labMarks = input.nextDouble();
		if(labMarks<0 || labMarks>100){
			System.out.println("Invalid input for lab submission marks. Terminating program");
			//Exit the program
			return;
		}
		
		//Input percentage for exam marks 
		System.out.print("Please enter the percentage given for the exam: ");
		examPercentage = input.nextDouble();
		
		//Input percentage for lab submission marks 
		System.out.print("Please enter the percentage given for the lab submission: ");
		labPercentage = input.nextDouble();
		
		//Validate that percentages add up to 100 or terminating the program
		if(examPercentage + labPercentage != 100){
			System.out.println("The percentages must add up to 100. Terminating program");
			//Exit the program
			return;
		}
		
		//Calculate the final mark
		finalMark = (examMarks*examPercentage/100) + (labMarks*labPercentage/100);
		
		//Display final mark
		System.out.println();
		System.out.println("Final Exam Mark is: " + finalMark);
	}
}