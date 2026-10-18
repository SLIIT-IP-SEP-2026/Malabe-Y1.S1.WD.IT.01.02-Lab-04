import java.util.Scanner;

public class IT26102687Lab4Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        String result = (num > 0) ? "Positive Number"
                        : (num < 0) ? "Negative Number"
                        : "Number is Zero";

        System.out.println(result);

        input.close();
    }
}