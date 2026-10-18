import java.util.Scanner;
 
public class IT26102589Lab4Q3 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
 
        String result = (num >= 0) ? "Positive" : "Negative";
        result = (num == 0) ? "Zero" : result;
 
        System.out.println("Number is " + result);
    }
}
 