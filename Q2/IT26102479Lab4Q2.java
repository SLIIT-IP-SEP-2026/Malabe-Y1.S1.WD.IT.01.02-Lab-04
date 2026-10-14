import java.util.Scanner;

public class IT26102479Lab4Q2 {
	public static void main(String[] args) {
	
	//Declare the variables
	double examMarks , labMarks , examPercentage , labPercentage , finalMark;
	
	//Create a Scanner object to read input
	Scanner input = new Scanner(System.in);
	
	//Input and Validate exam marks
	System.out.print("Please enter exam marks (out of 100):");
	examMarks = input.nextDouble();
	if (examMarks < 0 || examMarks > 100) {
		System.out.println("Invalid input for exam marks. Terminating program.");
		return;   // Exit the program
	}
	
	//Input and Validate lab submission marks
	System.out.print("Please enter lab submission marks (out of 100):");
	labMarks = input.nextDouble();
	if (labMarks < 0 || labMarks > 100) {
		System.out.println("Invalid input for lab submission marks. Terminating program.");
		return;   // Exit the program
	}
	
	//Input percentage for exam marks
	System.out.print("Please enter the percentage given for the exam:");
	examPercentage = input.nextDouble();
	
	//Input percentage for lab submission marks
	System.out.print("Please enter the percentage given for the lab submission:");
	labPercentage = input.nextDouble();
	
	//Validate that percentage add up to 100
	if (examPercentage + labPercentage != 100) {
		System.out.println("The percentages must add up to 100.Terminating program.");
		return;   // Exit the program
	}
	
	//Calculate final exam mark
	finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
	
	// Output final exam mark
	System.out.println();
	System.out.println("Final Exam Mark is :" + finalMark);
	}
}
	
		