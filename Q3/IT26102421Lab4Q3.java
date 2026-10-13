import java.util.Scanner;
public class IT26102421Lab4Q3{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number: ");
	int number = sc.nextInt();
	
	String result = (number>0)?"The number is: positive":
	                (number<0)?"The number is: negative":
					"The number is: zero";

	System.out.println(result);
}
}