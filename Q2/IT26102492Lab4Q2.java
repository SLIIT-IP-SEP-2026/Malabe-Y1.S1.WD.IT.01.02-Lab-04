import java.util.Scanner;

public class IT26102492Lab4Q2 {
    public static void main(String[] args) {
        double examMarks, labMarks;
        double examPercentage, labPercentage, finalMark;

        Scanner input = new Scanner(System.in);

        // Input and validate exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        // Input and validate lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        // Input percentages
        System.out.print("Please enter the percentage for exam marks: ");
        examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage for lab submission marks: ");
        labPercentage = input.nextDouble();

        // Validate percentages
        if (examPercentage < 0 || examPercentage > 100
                || labPercentage < 0 || labPercentage > 100
                || Math.abs((examPercentage + labPercentage) - 100) > 0.000001) {
            System.out.println("Invalid percentages. The percentages should add to 100.");
            return;
        }

        // Calculate and display the final mark
        finalMark = (examMarks * examPercentage / 100)
                  + (labMarks * labPercentage / 100);

        System.out.printf("Final mark: %.2f%n", finalMark);
    }
}