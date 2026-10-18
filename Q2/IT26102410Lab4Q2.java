import java.util.Scanner;
public class IT26102410Lab4Q2{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("please enter exam marks (out of 100):");
int exam_marks = input.nextInt();

System.out.println("please enter lab submission marks (out of 100):");
int lab_marks = input.nextInt();

if(exam_marks < 0 || exam_marks > 100) {
System.out.println("Invalid input for exam marks.Terminating program.");
return;
}

if(lab_marks < 0 || lab_marks > 100) {
System.out.println("Invalid input for lab marks.Terminating program.");
return;
}

System.out.println("please enter the percentage given for exam:");
int exam_percentage = input.nextInt();

System.out.println("please enter the percentage given for lab:");
int lab_percentage = input.nextInt();

if((exam_percentage + lab_percentage)!= 100) {
System.out.println("The percentages must add upto 100. Terminating program.");
return;
}

int final_marks;
final_marks = ((exam_marks * exam_percentage)/100 + (lab_marks * lab_percentage)/100);
System.out.println("Final exam mark is: " + final_marks);
}

}


