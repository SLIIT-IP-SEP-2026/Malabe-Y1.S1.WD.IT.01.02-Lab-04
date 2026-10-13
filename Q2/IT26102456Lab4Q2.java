import java.util.Scanner;
public class IT26102456Lab4Q2 {
	public static void main(String[] args) {
	
	double examMarks , LabMarks, exampercentage , labpercentage , finalMark;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter exam marks(out of 100):");
	examMarks = input.nextDouble();
	
	if(examMarks < 0 || examMarks> 100){
	    System.out.print("Invalid input for exam marks. Terminating program.");	
	    return;
	}
	
	System.out.print("Please enter Lab submission marks(out of 100):");
	LabMarks = input.nextDouble();
	
	if(LabMarks < 0 || LabMarks> 100){
	    System.out.print("Invalid input for Lab submission marks. Terminating program.");	
	    return;
	}
	
	System.out.print("Please enter the percentage given for the exam:");
	exampercentage = input.nextDouble();
	
	System.out.print("Please enter the percentage given for the Lab submission:");
	labpercentage = input.nextDouble();
	
	if (exampercentage + labpercentage != 100){
		System.out.print("The percentage must add up to 100. Terminating program.");
		return;
	}

	finalMark = (examMarks * exampercentage/ 100) + (LabMarks * labpercentage/ 100);
	
	System.out.println();
	System.out.println("Final Exam Mark is:" + finalMark);
	}
	
}