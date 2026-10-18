import java.util.Scanner;

public class IT26102589Lab4Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter exam marks: ");
        int exam = sc.nextInt();

        System.out.print("Enter lab marks: ");
        int lab = sc.nextInt();

        if (exam < 0 || exam > 100) {
            System.out.println("Exam marks are invalid");
        } else if (lab < 0 || lab > 100) {
            System.out.println("Lab marks are invalid");
        } else {
            System.out.print("Enter exam percentage: ");
            int examPer = sc.nextInt();

            System.out.print("Enter lab percentage: ");
            int labPer = sc.nextInt();

            if (examPer + labPer != 100) {
                System.out.println("Percentages should add up to 100");
            } else {
                double finalMarks = exam * examPer / 100.0 + lab * labPer / 100.0;
                System.out.println("Final marks: " + finalMarks);
            }
        }
    }
}