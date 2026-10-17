import java.util.Scanner;

public class IT26102680Lab4Q1{
	public static vpid main(String[] args){
		Scanner scanner=new scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number=scanner.nextInt();
		
		if(number>0){
			System.out.println("The number is Positive");
		}else if (number<0){
			System.out.println("The number is Negative");
		}else{
			System.out.prntln("The number is Zero");
		}
		
		scanner.close():
	}
}