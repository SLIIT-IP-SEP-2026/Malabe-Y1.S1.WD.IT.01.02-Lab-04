import java.util.Scanner;

public class IT26101493Lab4Q2 {
	
	public static void main (String[]args){
		double exam_marks,lab_marks,exam_percentage,lab_percentage,percentage,final_marks;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		exam_marks = input.nextDouble();
		
		if (exam_marks > 0 && exam_marks < 100) {
			
		} else {
			System.out.println("Invalid input for exam marks. Terminating program");
			return;
		}
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		lab_marks = input.nextDouble();
		
		if (lab_marks > 0 && lab_marks < 100) {
			
			
		} else {
			System.out.println("Invalid input for exam marks. Terminating program");
			return;
		}
		
		
		System.out.print("Please enter the percentage given for the exam: ");
		exam_percentage = input.nextDouble();
		
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		lab_percentage = input.nextDouble();
		
		percentage = exam_percentage + lab_percentage;
		
		if (percentage > 0 && percentage <= 100) {
			
		} else {
			System.out.println("The percentage must add up to 100. Terminating program");
			return;
		}
		
		final_marks=(exam_marks*exam_percentage/100)+(lab_marks*lab_percentage/100);
		System.out.print("Final Exam Marks is : " + final_marks);
		
	}
}