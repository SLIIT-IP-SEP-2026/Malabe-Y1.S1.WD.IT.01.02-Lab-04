import java.util.Scanner;
public class IT26102362Lab4Q2{
	public static void main(String[]args){
		float examMarks,labSubmissionMarks,finalMarks,examPercentage,labPercentage;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextFloat();
		
		if (examMarks>=0 && examMarks<=100){
			
			System.out.print("Please enter lab submission marks (out of 100): ");
			labSubmissionMarks= input.nextFloat();
			
			if (labSubmissionMarks>=0 && labSubmissionMarks<=100){
				
				System.out.print("Please enter the percentage given for the exam: ");
				examPercentage = input.nextFloat();
				
				System.out.print("Please enter the percentage given for the lab submission: ");
				labPercentage = input.nextFloat();
				
				if ((labPercentage+examPercentage)==100){
			
					finalMarks = (examMarks/100*examPercentage)+(labSubmissionMarks/100*labPercentage);
					System.out.println("\nFinal Exam Mark is: " + finalMarks);
				}
				
				else{
					System.out.print("The percentage must add up to 100");
					return;
				}
			}	
			else{
				System.out.println("Invalid input for lab submission marks.");
				return;
			}
		}	
		else{
			System.out.println("Invalid input for exam marks.");
			return;
		}		
	}
}
