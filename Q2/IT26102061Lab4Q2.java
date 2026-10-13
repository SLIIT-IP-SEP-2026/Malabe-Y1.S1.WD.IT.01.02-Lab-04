import java.util.Scanner;
public class IT26102061Lab4Q2{
	public static void main(String[] args){
		double exam_marks,lab_marks,exam_percen,lab_percen,final_marks;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100) :");
		exam_marks=input.nextDouble();
		
		if (exam_marks<0 || exam_marks>100){
				System.out.println("Invalid input for exam marks (out of 100)");
				return;
		}
		
		System.out.print("Please enter lab submission marks (out of 100) :");
		lab_marks=input.nextDouble();
		
		if (lab_marks<0 || lab_marks>100){
				System.out.println("Invalid input for lab marks (out of 100)");
				return;
		}
		
		
		System.out.print("Please enter the percentage given for the exam :");
		exam_percen=input.nextDouble();
		
		if (exam_percen<0 || exam_percen>100){
				System.out.println("Invalid input for exam percentage (out of 100)");
				return;
		}
		
		System.out.print("Please enter the percentage given for the lab submission :");
		lab_percen=input.nextDouble();
		
		if (lab_percen<0 || lab_percen>100){
				System.out.println("Invalid input for lab percentage (out of 100)");
				return;
		}
		
		if(exam_percen+lab_percen!=100){
			System.out.println("The percentage must add up to 100.Terminating program.");
			return;
		}
		
		final_marks=(exam_marks*exam_percen/100)+(lab_marks*lab_percen/100);
		
		System.out.println("Final Exam Mark :"+final_marks);
	}
}
		
		
		