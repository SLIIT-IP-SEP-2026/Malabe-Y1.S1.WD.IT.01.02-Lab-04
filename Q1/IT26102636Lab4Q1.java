import java.util.Scanner;

public class IT26102636Lab4Q1{
	
	public static void main(String[]args ){
		
	Scanner input= new Scanner (System.in);

    System.out.println(" Enter a number: ");
    int number = input.nextInt();

    if (number>0){
		 System.out.println("POSITIVE");
	} else if (number<0){
		System.out.println("NEGATIVE");
	}else {
		System.out.println("ZERO");
	}	
	}
}