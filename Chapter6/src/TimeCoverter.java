import java.util.Scanner;

/*

Program: TimeConverter.java          Last Date of this Revision: October 27, 2021

Purpose: Create a TimeConverter application that allows the user to choose among converting hours to minutes. 
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class TimeCoverter
{

	public static void hourstominutes() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of hours:");
		int hours = input.nextInt();
		int min =hours*60;
		
		input.close();
		System.out.println(min+" minutes in "+hours+" hours");
	}
	
	public static void daytohours() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of day:");
		int day = input.nextInt();
		int hours =day*24;
		
		input.close();
		System.out.println(hours+" hours in "+ day+" days  ");
	
	}
	
	public static void minutestohours() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of minutes:");
		int min = input.nextInt();
		int hours =min/60;
		
		input.close();
		System.out.println(hours+" hours in "+ min+" minutes  ");
	}
	
	public static void hourstodays() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of hours:");
		int hours = input.nextInt();
		int day =hours/24;
		
		input.close();
		System.out.println(day+" days in "+ hours+" hours  ");
	}
	public static void main(String[]arge) 
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter 1 for hours to minutes");
		System.out.println("Enter 2 for days to hours");
		System.out.println("Enter 3 for minutes to hours");
		System.out.println("Enter 4 for hours to days");
		int chose = input.nextInt();
		
		
		
		if ( chose==1) {hourstominutes();}
		else if ( chose==2) {daytohours();}
		else if ( chose==3) {minutestohours();}
		else {hourstodays() ;}
	
	}
	
}
/* Screen Dump

Paste the output of your code here
 
 */
