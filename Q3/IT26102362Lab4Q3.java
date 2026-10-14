import java.util.Scanner;
public class  IT26102362Lab4Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int number;
		String message;
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		message = (number==0) ? "The number is: Zero":
		          (number>0) ? "The number is: Positive":
							"The number is: Negative";
		
		System.out.println(message);
	}
}