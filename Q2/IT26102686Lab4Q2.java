import java.util.Scanner;

	public class IT26102686Lab4Q2
	{
	
		public static void main(String[] args)
		{
		
		double finalMarks;
		
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
		
			System.out.print("Please enter exam marks(out of 100): ");
			double examMarks = input.nextDouble();
			
			System.out.print("Please enter lab submission marks(out of 100): ");
			double labMarks = input.nextDouble();
			
			if (examMarks < 0 || examMarks > 100 ||
			   labMarks < 0 || labMarks > 100)
			   
			   {
			   System.out.println("Invalid marks");
			   }
			
			
			else
			{
			System.out.print("Please enter the percentage given for exam: ");
			double examPercentage = input.nextDouble();
			
			System.out.print("Please enter the persantage given for lab submission: ");
			double labPercentage = input.nextDouble();
			
				if (examPercentage < 0 || examPercentage > 100 ||
				   labPercentage < 0 || labPercentage > 100 ||
				   examPercentage + labPercentage != 100)
				   
				   {
				   System.out.println("Invalid percentage");
				   }
				
				else
				{
				 finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
				 
				 System.out.println("Final Exam Mark is : "+ finalMarks);
				}
			}
		}
	}
}