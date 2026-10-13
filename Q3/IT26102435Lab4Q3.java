import java.util.Scanner;
public class IT26102435Lab4Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		double number = input.nextDouble();
		
		String results = (number > 0) ? "Positive"
		: (number < 0) ? "Negative"
		: "Zero ";
		
		System.out.println("The number is: " + results);
		
	
	input.close();
	}
}