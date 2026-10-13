import java.util.Scanner;
   public class IT26102385Lab4Q2 {
	 public static void main (String[]args){
		 Scanner sc = new Scanner(System.in);
		 
		 System .out.print("Please enter exam marks(out of 100):");
		 double examMarks=sc.nextDouble();
		 
		 if (examMarks<0|| examMarks>100) {
			 System.out.print("Invalid input for exam marks.Terminating programme.");
			 return;
		 }
		 System .out.print("Please enter lab submission marks(out of 100):");
		 double labMarks=sc.nextDouble();
		 
		 if (labMarks<0|| labMarks>100) {
			 System.out.print("Invalid input for lab submission marks.Terminating programme.");
			 return;
		 }
		  System .out.print("Please enter the persentage given for the exam:");
		 double examPersentage=sc.nextDouble();
		 
		 System .out.print("Please enter the persentage given for the lab submission:");
		 double labPersentage=sc.nextDouble();
		 
		 if (examPersentage+labPersentage!=100) {
			 System.out.print("Invalid persentage.Persentages should add to 100.Terminating programme.");
			 return;
		 }
		 double finalmarks=(examMarks*examPersentage/100)+(labMarks*labPersentage/100);
		 System.out.println("\nFinal Exam Marks is:"+finalmarks);
		 
	 }
 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 