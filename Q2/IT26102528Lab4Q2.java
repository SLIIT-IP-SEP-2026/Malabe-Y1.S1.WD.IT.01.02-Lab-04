import java.util.Scanner;

public class IT26102528Lab4Q2 {
    public static void main(String[] args) {

        // Create a Scanner object to get keyboard input
        Scanner input = new Scanner(System.in);

        // Input the exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();

        // Validate the exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println(
                "Invalid input for exam marks. Terminating program."
            );
            input.close();
            return;
        }

        // Input the lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();

        // Validate the lab submission marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println(
                "Invalid input for lab submission marks. Terminating program."
            );
            input.close();
            return;
        }

        // Input the percentage given for the exam
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();

        // Input the percentage given for the lab submission
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();

        // Check whether both percentages add up to 100
        if (examPercentage + labPercentage != 100) {
            System.out.println(
                "The percentages must add up to 100. Terminating program."
            );
            input.close();
            return;
        }

        // Calculate the final mark using the given percentages
        double finalMark =
            (examMarks * examPercentage / 100)
            + (labMarks * labPercentage / 100);

        // Display the final exam mark
        System.out.println("Final Exam Mark is : " + finalMark);

        // Close the Scanner
        input.close();
    }
}