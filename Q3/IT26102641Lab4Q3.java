import java.util.Scanner;

public class IT26102641Lab4Q3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		double num = sc.nextDouble();
		
		String result = num > 0 ? "positive" : num < 0 ? "negative" : "zero";
		
		System.out.println("The number is:" + result);
	}
}