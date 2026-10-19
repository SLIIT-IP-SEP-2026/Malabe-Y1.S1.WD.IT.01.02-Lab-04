import java.util.Scanner;

public class IT26102541Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();

        // Range validation for exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();

        // Range validation for lab marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = scanner.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = scanner.nextDouble();

        // Percentage addition validation
        if ((examPercentage + labPercentage) != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        // Calculate final mark
        double finalMark = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
        System.out.println("Final Exam Mark is " + finalMark);

        
    }
}