import java.util.Scanner; 

public class IT26101754Lab4Q2 {

    public static void main(String[] args) {
	
	
	    double examMarks , labMarks , examPercentage , labpercentage , finalMark;
		
		Scanner input = new Scanner(System.in);
		
		
	    System.out.print("please enter exam marks (out of 100): ");
		examMarks = input.nextDouble();
		if (examMarks < 0 || examMarks > 100) {
		    System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}

        
        System.out.print("please enter lab submission marks (out of 100): ");
        labMarks = input.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        System.out.print("please enter the percentage given for exam: ");
        examPercentage = input.nextDouble();

        System.out.print("please enter the percentage given for the lab submission: ");
        labpercentage = input.nextDouble();

        if (examPercentage + labpercentage != 100) {
            System.out.println("The percentage must add up to 100. Terminating program.");
            return;
        }

        finalMark = (examMarks * examPercentage / 100) + (labMarks * labpercentage / 100);

        System.out.println();
        System.out.println("Final Exam Mark is : " + finalMark);

    }

}	
			
			
		
		
		
		
	