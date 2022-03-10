import java.util.Scanner;

/*

Program: Grade.java          Last Date of this Revision: October 19, 2021

Purpose: Create a Grade application that prompts the user for the percentage earned on other graded work and then displays the corresponding letter grade.
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class Grade 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the percentage:");
		int  Nu=input.nextInt();
		
		input.close();
		 
		
		 if (Nu>=90 && Nu<=100)
		 {
			 System.out.println("The corresponding letter grade is: A");
		 }
		 else if (Nu>=80 && Nu<90)
		 {
			 System.out.println("The corresponding letter grade is: B");
		 }
		 else if(Nu>=70 &&Nu<80)
		 {
			 System.out.println("The corresponding letter grade is: C");
		 }
		 else if (Nu>=60 && Nu<70)
		 {
			 System.out.println("The corresponding letter grade is: D");
		 }
		 else if (Nu<60)
		 {
			 System.out.println("The corresponding letter grade is: F");
		 }
	}

}
/* Screen Dump

Paste the output of your code here
 
 */