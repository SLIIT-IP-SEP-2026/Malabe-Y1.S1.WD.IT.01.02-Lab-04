import java.util.Scanner;
public class IT26102533Lab4Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//entering the number....
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		
		// checking the nubmber whether its 0, negative or positive..
		
		String result = (num < 0)? "The number is : negative number":
						(num > 0)? "The number is : positive number" : "The number is : 0";
						
		System.out.print(result);
		}
}