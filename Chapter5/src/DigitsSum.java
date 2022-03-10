import java.util.Scanner;

/*

Program: DigitsSum.java          Last Date of this Revision: October 22, 2021

Purpose:  Create a DigitsSum application that prompts the user for a non-negative integer.
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class DigitsSum 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a pasitive integer:");
		int number = input.nextInt();
		System.out.println("The sum of the cubes of the digits is:"+sumDigits(number));
	
		input.close();
	}

	private static int sumDigits(int number) 
	{
		// TODO Auto-generated method stub
		int result = 0;
		while (number>0) 
		{
			result+= number % 10;
			number/=10;
		}
		
		
		return result;
		
		
		
		
	}

}
/* Screen Dump

Paste the output of your code here
 
 */