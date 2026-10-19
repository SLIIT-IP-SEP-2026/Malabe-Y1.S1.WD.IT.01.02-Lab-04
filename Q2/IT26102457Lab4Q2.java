import java.util.Scanner;
public class IT26102457Lab4Q2
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Please enter exam the marks(out of 100):");
        double exammark=input.nextDouble();
		
		if (exammark<0 || exammark>100)
		{System.out.print("invaild input for the exam marks. Terminating programe.");
		 return;}
		 
		 System.out.println("Please enter the lab submisssion marks(out of 100):");
		 double labmarks=input.nextDouble();
		 
		 if (labmarks<0 || labmarks>100)
		 {System.out.println("Invaild input for lab marks. Terminating programe.");
		 return;};
		 
		 
		 System.out.println("Please enter the percentage given for the exam :");
		 double exammarkpercentage=input.nextDouble();
		 
		 
		 System.out.println("Please enter the percentage given for the lab submisssion :");
		 double labmarkpercentage=input.nextDouble();
		 
		 if ((exammarkpercentage+labmarkpercentage)!=100)
		 {System.out.print("The percentage must add up to 100. Terminating program");
	       return;}
		 
		 double finalmarks=((exammarkpercentage/100)*exammark)+((labmarkpercentage/100)*labmarks);
		 
		 System.out.println();
		 System.out.println("Final Exam mark is :"+finalmarks);
			 
		 
		 
		
		
		
	}
}