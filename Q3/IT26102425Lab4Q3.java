import java.util.Scanner;
public class IT26102425Lab4Q3{
public static void main (String[]args){

//Declare variables
int number;
String result;

//Creating a Scanner object called input
Scanner input = new Scanner(System.in);

//Prompt the user to enter a number
System.out.print("Enter a number: ");
//Storing the recieved input from the user in a variable
number = input.nextInt();

//Checking if the number is positive, negative or zero using the tertiary operator
result = (number>0)?"The number is : Positive":
(number<0)?"The number is :Negative":
"The number is : Zero";

//Displaying the result
System.out.println(result);

}
}