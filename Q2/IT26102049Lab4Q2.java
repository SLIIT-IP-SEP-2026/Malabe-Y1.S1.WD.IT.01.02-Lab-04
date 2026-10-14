import java.util.Scanner;
public class IT26102049Lab4Q2{
	public static void main (String[]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Plese enter Exam marks :");
	double marks = input.nextDouble();
	
	System.out.print("Plese enter lab submission marks :");
	double lab_marks = input.nextDouble();
	
	
	
	if (marks >100 || marks <0) {
	System.out.print ("invalid exam marks ");
	return;
	}
	if (lab_marks >100 || marks <0) {
	System.out.print ("invalid lab submission marks ");
	return;
	}
	
	System.out.print("Plese enter the percentage given for the exam :");
	double marks_percentage = input.nextDouble();
	
	System.out.print("Plese enter the percentage given for the lab submission  :");
	double lab_percentage = input.nextInt();
	
	if (marks_percentage+ lab_percentage != 100) ;
	System.out.println("the percentages must add up to 100. terminating programe");
		
	double finalmark = (marks * marks_percentage/ 100) + (lab_marks * lab_percentage/ 100);
	
	System.out.println("Your final exam marks is :" + finalmark);
		
	}
}