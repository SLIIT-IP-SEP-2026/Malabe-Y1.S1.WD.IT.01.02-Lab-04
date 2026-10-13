import java.util.Scanner;
public class IT26102405Lab4Q1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your integer: ");
		int userInt = input.nextInt();
		
		if (userInt > 0) {
			System.out.println("Positive");
		}
		else if (userInt < 0) {
			System.out.println("Negative");
		}
		else if (userInt == 0) {
			System.out.println("Zero");
		}
	
	}

}