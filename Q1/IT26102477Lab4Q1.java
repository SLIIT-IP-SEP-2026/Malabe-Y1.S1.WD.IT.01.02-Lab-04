import java.util.Scanner;
public class IT26102477Lab4Q1 {
    public static void main(String [] args) {
	
    int number;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	number = input.nextInt();
	
if (number > 0) {
	System.out.println("The number is: positive");
	return;
}

if (number < 0) {
	System.out.println("The number is: Negative");
	return;
}
	
else  {
	System.out.println("The number is: Zero");
	
}
	}
	}