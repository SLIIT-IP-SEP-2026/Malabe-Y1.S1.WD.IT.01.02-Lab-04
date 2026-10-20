import java.util.Scanner;

public class IT26102483Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();

        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();

        
        System.out.print("Enter exam percentage: ");
        double examPercentage = scanner.nextDouble();

        System.out.print("Enter lab submission percentage: ");
        double labPercentage = scanner.nextDouble();

        
        if (examPercentage + labPercentage == 100) {
            double finalMark = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
            System.out.println("Final Mark: " + finalMark);
        } else {
            System.out.println("Error: Percentages must add up to 100.");
        }

        scanner.close();
    }
}