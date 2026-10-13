import java.util.Scanner;
public class IT26102460Lab4Q2{
	public static void main(String[] args){
		double examMarks, labMarks, examPercentage, labPercentage, FinalMarks;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the exam marks given out of 100: ");
		examMarks = input.nextDouble();
		
		
		if(examMarks >=0 && examMarks <=100){
			System.out.println("Marks are Valid.");
		}
		else{
			System.out.print("Marks are invalid! Terminating the program.");
			return;
		}
		
		
		System.out.print("Enter the lab marks given out of 100: ");
		labMarks = input.nextDouble();
		
		if(labMarks >=0 && labMarks <=100){
			System.out.println("Marks are Valid.");
		}
		else{
			System.out.print("Marks are invalid! Terminating the program.");
			return;
		}
		
		
		
		System.out.print("Enter the percentage taken from exam: ");
		examPercentage = input.nextDouble();
		
		System.out.print("Enter the percentage taken from lab submissions: ");
		labPercentage = input.nextDouble();
		
		if(examPercentage + labPercentage != 100){
			System.out.println("The percentages don't add up to 100. Terminating the program.");
			return;
		}
		
		FinalMarks = examMarks * (examPercentage/100) + labMarks * (labPercentage/100);	
		
		System.out.print("Final Exam Marks: " + FinalMarks);
		
	}
}