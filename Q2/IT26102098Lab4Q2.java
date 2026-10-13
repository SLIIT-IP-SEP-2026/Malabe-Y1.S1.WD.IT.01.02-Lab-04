import java.util.Scanner;
public class IT26102098Lab4Q2 {
	
	public static void main(String[] args) { 
	    Scanner input = new Scanner(System.in);
		
		double examMarks, labMarks;
		double examPrecentage, labPrecentage;
		double finalMark;
		
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextDouble();
		
		if (examMarks < 0 || examMarks > 100) {
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		System.out.print("Please enter lab submission marks (out of 100): ");
		labMarks = input.nextDouble();
		
		if (labMarks < 0 || labMarks > 100) {
			System.out.println("Invalid input for lab marks. Terminating program.");
			return;
		}
		System.out.print("Please enter the percentage given for the exam: ");
		examPrecentage = input.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		labPrecentage = input.nextDouble();
		
		if (examPrecentage + labPrecentage != 100) {
			System.out.println("The precentages must add up to 100. Terminating program.");
			return;
		}
		
		finalMark =(examMarks * examPrecentage / 100) + (labMarks * labPrecentage / 100);
		
		System.out.println();
		System.out.println("Final Exam Mark is : " + finalMark);
		
		}
		
}
	
	
	
	
	
	
	
	
	

	