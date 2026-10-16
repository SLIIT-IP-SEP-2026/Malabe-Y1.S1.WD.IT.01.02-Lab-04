import java.util.Scanner;
public class IT26102557Lab4Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number =input.nextInt();
		if (number<0)
		{
			System.out.println("Your number is Negative");
		}
		else if (number>0)
		{
			System.out.println("Your number is Possitive");
		}
		else
		{
			System.out.println("Your number is Zero");
		}
	}
}