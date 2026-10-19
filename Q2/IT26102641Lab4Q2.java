import java.util.Scanner;

public class IT26102641Lab4Q2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the exam marks(out of 100): ");
		double exam = sc.nextDouble();
		if (exam < 0 || exam > 100){
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		System.out.print("Enter the lab submission marks(out of 100): ");
		double labmarks = sc.nextDouble();
		if (labmarks < 0 || labmarks  > 100){
			System.out.println("Invalid input for labmarks marks. Terminating program.");
			return;
		}
		System.out.print("Enter the percentage given for the exam: ");
		double exampercentage = sc.nextDouble();
		
		System.out.print("Enter the percentage given for the lab submission: ");
		double labpercentage = sc.nextDouble();
		
		if (exampercentage + labpercentage != 100){
			System.out.println("The percentages must add up to 100. Terminating program.");
			return;
		}
		
		double finalmark = exam * exampercentage/100 + labmarks * labpercentage/100;
		System.out.println("Final Exam Mark is:" + finalmark);
	}
}