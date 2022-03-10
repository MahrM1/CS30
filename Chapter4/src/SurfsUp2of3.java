import java.util.Scanner;
/*

Program: SurfsUp2of3.java          Last Date of this Revision: October 4, 2021

Purpose: Modify the SurfsUp application to display" Great day for surfing!" when the waves are 6 feet or over and " Go body boarding!" when the waves are less then 6 feet. 

Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class SurfsUp2of3 {

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
		else
		{
		System.out.println("Go body boarding");
		}
		
	
		
	}

}
/* Screen Dump

Paste the output of your code here
 
 */