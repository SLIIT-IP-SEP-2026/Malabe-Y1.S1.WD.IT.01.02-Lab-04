import java.util.Scanner;
public class IT26102480Lab4Q2{
	public static void main(String[]args){

		Scanner value = new Scanner(System.in);

		System.out.print("Please enter the exam marks(out of 100):");
		double examMarks = value.nextDouble();

		if (examMarks <0 || examMarks >100){
			System.out.println("Invalid input for exam marks.Terminating program");
			return;
		}

		System.out.print("Please enter lab submission marks(out of 100) :");
		double labMarks = value.nextDouble();

		if (labMarks <0 || labMarks >100){
			System.out.println("Invalid input for exam marks.Terminating program");
			return;
		}



		System.out.print("Please enter the precentage given for the exam :");
		double examprecentage = value.nextDouble();

		System.out.print("Please enter the precentage given for the lab submission :");
		double labprecentage = value.nextDouble();


		if (examprecentage + labprecentage != 100){
			System.out.println("The precentages must add up to 100.Terminating program");
			return;
		}

		double finalMarks = ( examMarks*(examprecentage/100.0) + labMarks*(labprecentage/100.0));

		System.out.println("Final exam mark is :"+finalMarks);
	}



}
