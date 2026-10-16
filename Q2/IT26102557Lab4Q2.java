import java.util.Scanner;
public class IT26102557Lab4Q2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter the Exam Marks");
		double emarks =input.nextDouble();
		
		if (emarks < 0 || emarks > 100)
		{
			System.out.println("Invalid input for exam marks.Terminate the program");
			return;
			}
		
		System.out.println("Please Enter the LAB Submission marks Marks");
		double lmarks =input.nextDouble();
		
		if (lmarks < 0 || lmarks > 100)
		{
			System.out.println("Invalid input for lab marks.Terminate program");
			return;
			}
		
		System.out.println("Please Enter the percentage given for the exam ");
		double epercentage =input.nextDouble();
		
		System.out.println("Please Enter the percentage given for the Lab Exams ");
		double lpercentage =input.nextDouble();
		
		if (epercentage + lpercentage != 100)
			
		{
			System.out.println("Both percentages must add upto 100 so Terminating the program");
			return;
			}
		
		double percexam = emarks*epercentage/100;
		double percelab = lmarks*lpercentage/100;
		double Totalmarks = percelab+percexam;
		
		System.out.println("The Final marks "+Totalmarks);
		
	}
}
