import java.util.Scanner;
public class IT26102049Lab4Q1{
	public static void main (String[]args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter a number :");
	int number = input.nextInt();
	
	if (number >=0)
    {System.out.print("the number is positive");
	return;
	}
	
	else {
	System.out.print("the number is negative");
	return;
	}	
		
		
	}   
}