import java.util.Scanner;

public class IT26102687Lab4Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Exam Marks: ");
        double examMarks = input.nextDouble();

        System.out.print("Enter Lab Marks: ");
        double labMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100 ||
            labMarks < 0 || labMarks > 100) {

            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            return;
        }

        System.out.print("Enter Exam Percentage: ");
        double examPercentage = input.nextDouble();

        System.out.print("Enter Lab Percentage: ");
        double labPercentage = input.nextDouble();

        if ((examPercentage + labPercentage) != 100) {
            System.out.println("Invalid percentages! Total should be 100.");
            return;
        }

        double finalMark =
                (examMarks * examPercentage / 100) +
                (labMarks * labPercentage / 100);

        System.out.println("Final Mark = " + finalMark);

        input.close();
    }
}