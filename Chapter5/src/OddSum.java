import java.util.Scanner;

/*

Program: OddSum.java          Last Date of this Revision: October 20, 2021

Purpose: Create a NumberSum application that prompts the user for a number and the sums the odd numbers from 1 to the number entered. 
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class OddSum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter a number:");
		int number = input.nextInt();
		int odd=0;
		int co=1;
		input.close();
		do 
		{
			co+=2;
			odd+=co;
		}
		while(co<number);
		{
			System.out.println("Odd numbers sum is "+odd);
		}
	}

}
/* Screen Dump

Paste the output of your code here
 
 */