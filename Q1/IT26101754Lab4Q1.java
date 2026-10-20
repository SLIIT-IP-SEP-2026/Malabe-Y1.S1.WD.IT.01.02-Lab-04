import java.util.Scanner; 

public class IT26101754Lab4Q1 {

    public static void main(String[] args) {
	
	    double number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		
		if (number > 0) {
		    System.out.println("The number is: positive");
		} else if (number < 0) {
            System.out.println("The number is: Negative");
        } else {
            System.out.println("The number is zero");
        }

        input.close();

    }
}