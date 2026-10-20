import java.util.Scanner;
public class IT26102736Lab4Q1
{
	public static void main(String[]args) {
	
	// Create Scanner object to get input
	Scanner input = new Scanner(System.in);
	
	//Get a number
	System.out.print("Enter a number: ");
	int number=input.nextInt();
	
	//checking if the number obtained is positive 
	if (number>0){
		System.out.println("The number is: Positivde.");
	}
	//checking if the number obtained is negative
	else if (number<0){
		System.out.println("The number is: Negative.");
	}
	
	else{
		System.out.println("The number is Zero");
		}
		
	//Close Scanner
	input.close();
	}
}