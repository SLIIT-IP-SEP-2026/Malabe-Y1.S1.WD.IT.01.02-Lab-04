import java.util.Scanner;
public class  IT26102395Lab4Q3{
	
	public static void main(String[] args) {
		
		 Scanner ok= new Scanner(System.in);
		 System.out.print("Enter a number:");
		 int num= ok.nextInt();
		 
		 System.out.print(" ");
		 
		 String result = (num >0)? "The number is:Possitive":(num<0)?"The number is :Negative" : "The number is :Zero";
		 
		 System.out.println(result);
		
	}
}	