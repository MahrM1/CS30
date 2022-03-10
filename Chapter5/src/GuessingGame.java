import java.util.Scanner;



/*

Program: DigitsSum.java          Last Date of this Revision: October 22, 2021

Purpose:  The GuessingGame application created in chapter 4 Exercise.
Author: Mahr Mohammad.  
School: CHHS
Course: Computer Programming 20
 

*/
public class GuessingGame 
{


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number between 1 and 20:");
		int guess = input.nextInt();
		
		int G = 15; 
		input.close();
		 if (G==guess) 
		 {
			 System.out.println("you won!");
		 }
		 else 
		 {
			 System.out.println("try again."); 
		 }
	}

		
	
}
/* Screen Dump

Paste the output of your code here
 
 */