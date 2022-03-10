import java.util.Scanner;
/*

Program: SurfsUp3of3.java          Last Date of this Revision: October 5, 2021

Purpose: Modify the SurfsUp application to display" Great day for surfing!" when the waves are 6 feet or over," Go body boarding!" when the waves are between 3 and 6, "Go to swim". 

Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/

public class SurfsUp3of3 {

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
		
		else if (height <6 && height>=3)
		{
		System.out.println("Go body boarding");
		}
		
		else if (height <3&& height>=0) 
		{
		System.out.println("Go for a swim");
		}
		else 
		{
		System.out.println("whoa! what kind of surf is that");	
		}
	
	}

}
/* Screen Dump

Paste the output of your code here
 
 */