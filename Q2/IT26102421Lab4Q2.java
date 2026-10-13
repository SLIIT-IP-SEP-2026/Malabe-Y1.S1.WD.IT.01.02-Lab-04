import java.util.Scanner;
public class IT26102421Lab4Q2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the exam mark: ");
	double exammark = sc.nextDouble();
	
	System.out.print("Enter the lab mark: ");
	double labmark = sc.nextDouble();
	
	if(exammark<0 || exammark>100){
	System.out.println("Invalid input for the exammark. Terminating program.");
	return;
	}
	if(labmark<0 || labmark>100){
	System.out.println("Invalid input for the labmark. Terminating program.");
	return;
	}
	
	System.out.print("Enter the percentage given for the exam: ");
	double exampercentage = sc.nextDouble();
	
	System.out.print("Enter the percentage given for the lab submission: ");
	double labpercentage = sc.nextDouble();
	
	if(exampercentage + labpercentage != 100){
	System.out.println("The percentages must add up to 100. Terminating program.");
	return;
	}
	
	double finalmark = (exammark*exampercentage/100) + (labmark*labpercentage/100);
	System.out.print("The final mark is: " + finalmark);
	
}
}
	
	
	