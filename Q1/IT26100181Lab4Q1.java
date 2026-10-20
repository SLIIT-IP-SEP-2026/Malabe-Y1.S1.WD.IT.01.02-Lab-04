import java.util.Scanner;
public class IT26100181Lab4Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Getting the inputs...
		System.out.print("\nEnter the number : ");
		int num = input.nextInt();
		
		// Checking the number negative/positive or zero...
		if (num > 0){
			System.out.println("The number is a Positive number...");
		}else if (num < 0 ){
			System.out.println("The number is a Negative number...");
		}else{
			System.out.println("The number is 0...");
		}
	}
}