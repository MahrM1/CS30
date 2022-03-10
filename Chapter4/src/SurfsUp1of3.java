import java.util.Scanner;
/*

Program: SurfsUp1of3.java          Last Date of this Revision: October 4, 2021

Purpose: Create a SurfsUp application that prompts the user for wave height and then display "Great day for surfing!"When the waves are 6 feet and over.

Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/


public class SurfsUp1of3 
{

	public static void main(String[] args)
	{ 
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter wave height");
		int height = input.nextInt();
		input.close();
		if(height >= 6) 	
		{
		System.out.println("Greate day for surfing");
		}

		
	}
	}
/* Screen Dump

Paste the output of your code here
 
 */