import java.util.Scanner;
public class IT26102395Lab4Q2{
	
	public static void main(String[] args) {
		
	 Scanner ok= new Scanner(System.in);
	 
	 System.out.println("Please enter exam marks out of 100 :");
	 double exam_marks= ok.nextDouble();
	 
	 
	 
	 if(exam_marks < 0 || exam_marks > 100  ){
		 
		System.out.println("Erorr marks");
		
		return;
	 }
	  System.out.println("Please enter Lab marks out of 100 :");
	  double Lab_marks= ok.nextDouble();
	  
	 if(Lab_marks<0 || Lab_marks>100){
		 
	 System.out.println("Erorr marks");
	 return;
		 

	 }
	 
	 System.out.println("Pleae Enter the percentage given for the exam :");
	 double exam_percentage= ok.nextDouble();
	 
	 System.out.println("Pleae Enter the percentage given for the lab :");
	 double lab_percentage= ok.nextDouble();
	 
	 
	 if ( exam_percentage+lab_percentage != 100){
		 
		 System.out.println("Invalid percentages");
		 
		 return;
	 }
	 
		double Final_marks= (exam_marks * exam_percentage/100)+ (Lab_marks * lab_percentage/100);
		
		
		System.out.println("Final Exam Marks is :"+Final_marks);

	 
		
		
			
		 	
			
		
	}
		
	
}