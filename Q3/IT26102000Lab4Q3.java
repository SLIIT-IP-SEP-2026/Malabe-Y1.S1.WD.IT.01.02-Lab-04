import java.util.Scanner;

 public class IT26102000Lab4Q3{
 
 public static void main(String[] args){
 
 int number;
 String message;
  
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter a number = ");
  number = sc.nextInt();
  
  message = (number > 0 ) ? "The number is: Positive " :
            (number < 0 ) ? "The number is: Negative" :
			"The number is Zero" ;
  
 System.out.print(message);  
			
 }
 }