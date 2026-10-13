import java.util.Scanner;
public class IT26102061Lab4Q1{
	public static void main(String[] args){
		double number ;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		number=input.nextDouble();
		
		if(number>0){
			System.out.print("The number is : Positive");
			return;
		}
			
		else if(number<0){
			System.out.print("The number is : Negative");
			return;
		}
		else{
			System.out.print("The number is Zero");
		}
	}
}
			
		
			
		
		