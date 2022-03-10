import java.util.Scanner;

/*

Program: NumberSum.java          Last Date of this Revision: October 20, 2021

Purpose: Create a NumberSum application that prompts the user for a number the display the number 1. 
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class NumberSum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int number  = input.nextInt();
		int number1=0;
		int sum=0;
		input.close();
		do 
		{
			System.out.println(number1);
			number1+=1;
			sum+=number1;
		}
		while(number1<=number);
		{
			System.out.println(sum);
		}
		
		
		
	}

}
/* Screen Dump

Paste the output of your code here
 
 */