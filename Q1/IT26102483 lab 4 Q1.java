import java.util.Scanner;
public class IT26102483Lab4Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//entering the number....
		System.out.print("Enter the number : ");
		int num = input.nextInt();

		// checking the nubmber whether its 0, negative or positive..

		if( num > 0){
			System.out.print("The number is : positive ");

		}else if(num < 0){
			System.out.print("The number is : negative");

		}else{
			System.out.print("The number is : 0");
		}

		}
}