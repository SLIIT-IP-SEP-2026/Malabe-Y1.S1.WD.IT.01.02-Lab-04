import java.util.Scanner;
public class IT26100181Lab4Q2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Getting the inputs for exam marks...
		System.out.print("Enter your exam marks (Out of 100) : ");
			double examMarks = input.nextDouble();
		
		// Checking the validity of examMarks...
		if(examMarks < 0 || examMarks > 100){
			System.out.println("Invalid input for the exam marks . Terminating the program");
			return;
		}
		
		// Getting the inputs for exam marks...
		System.out.print("Enter your lab submisson marks (Out of 100): ");
			double labSubMarks = input.nextDouble();
		
		// Checking the validity of labSubMarksMarks...
		if(labSubMarks < 0 || labSubMarks > 100){
			System.out.println("Invalid input for the lab submisson marks . Terminating the program");
			return;
		}
		
		//Input percentage for the exam marks...
		System.out.print("Please enter the percentage given for the exam : ");
		double examPercentage = input.nextDouble();
		
		//Input percentage for the lab submission marks...
		System.out.print("Please enter the percentage given for the lab submission marks : ");
		double labPercentage = input.nextDouble();
		
		if (examPercentage + labPercentage != 100 ){
			System.out.println("The percentages must add up to 100. Terminating program...");	
			return;
		}
		
		// Calculate final exam mark..
		double finalMarks = (examMarks * examPercentage / 100 ) + (labSubMarks * labPercentage / 100 );
		
		// Output the final mark...
		System.out.println();
		System.out.println("Final Exam Mark is : " + finalMarks);
		
	}
}