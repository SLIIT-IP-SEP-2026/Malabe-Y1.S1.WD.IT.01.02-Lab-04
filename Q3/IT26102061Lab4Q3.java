import java.util.Scanner;
public class  IT26102061Lab4Q3{
	public static void main(String[] args){
		//Declare the variables
		double number;
		
		//Create a scanner object to read input
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		number=input.nextDouble();
		
		//Determine whether the number is positive or negative (Ternary operator)
		String result= (number>0) ? "The number is : Positive":
						(number<0) ? "The number is : Negative":
						"The number is : Zero";
						
		System.out.print(result);
	}
}
		
		
		
		

