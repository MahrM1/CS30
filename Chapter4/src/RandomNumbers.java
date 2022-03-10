import java.util.Random;
import java.util.Scanner;

/*

Program: RandomNumbers.java          Last Date of this Revision: October 13, 2021

Purpose: Create a RandomNum application that prompts the use for tow number.
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class RandomNumbers 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Random r=new Random(1);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter minimunm number:");
		int min = input.nextInt();
		System.out.println("Enter maximimum number:");
		int max = input.nextInt();
		input.close();
		
		System.out.println("Number is: "+r.nextInt(max-min+1)+min);
		
		
		
		
		
		
		
	}

}
/* Screen Dump

Paste the output of your code here
 
 */