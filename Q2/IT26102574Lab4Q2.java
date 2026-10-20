import java.util.Scanner;

public class IT26102574Lab4Q2{
	public static void main(String[args]){
	Scanner input= new Scanner(System.in);
	
	double examMarks, labMarks;
	double examPercentage, labPercentage;
	doublefinalMarks;
	
	System.out.print("Enter the exam marks:");
	examMarks= input.nextDouble();
	
	System.out.print("Enter the lab submission marks:");
	labMarks= input.nextDouble();
	
	if(examMarks< 0|| examMarks> 100|| labMarks<0 || labMarks> 100){
	
	System.out.println("Invalid marks!Marks must be between 0 and 100.");
	}else{
	
	System.out.print("Enter the exam percentage:");
	examPercentage= input.nextDouble();
	
	System.out.print("Enter lab percentage:");
	labPercentage= inpiut.nextDouble();
	
	if(examPercentage<0 || labPercentage <0 ||
		examMarks> 100 || labPercentage>100||
		examPercentage + labPercentage != 100) {
		
		System.out.println("Invalid percentages!They must add upto 100.");
	}else{
	finalMarks= (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
	
	System.out.printf("Fiunsl marks: %2f%n", finalMarks);
	}
	
	}
	input.close();
	}



}