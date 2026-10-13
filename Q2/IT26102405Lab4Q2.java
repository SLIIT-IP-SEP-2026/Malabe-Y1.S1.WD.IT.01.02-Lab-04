import java.util.Scanner;
public class IT26102405Lab4Q2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		double examMark, labMark, examWeight, labWeight, finalMarks;
		
		System.out.print("Please enter exam marks (out of 100): ");
		examMark = input.nextInt();
		
		if ((examMark > 100.0) || (examMark < 0.0)) {
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		labMark = input.nextInt();
		
		if ((labMark > 100.0) || (labMark < 0.0)) {
			System.out.println("Invalid input for lab submission marks. Terminating program.");
			return;
		}
		
		
		System.out.print("Please enter the percentage given for the exam: ");
		examWeight = input.nextInt();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		labWeight = input.nextInt();
		
		if ((examWeight + labWeight) != 100.0) {
			System.out.println("The percentages must add up to 100. Terminating program.");
			return;
		}
		
		
		finalMarks = (examMark * examWeight / 100) + (labMark * labWeight / 100);
		System.out.println("Final Exam Mark is : " + finalMarks);
	
	
	}

}