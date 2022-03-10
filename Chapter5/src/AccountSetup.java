import java.util.Scanner;

/*

Program: AccountSetup.java          Last Date of this Revision: October 20, 2021

Purpose:  Create an AccountSetup application that prompts the user for a user name and a password.
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class AccountSetup 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a user name:");
		String user = input.next();
		System.out.println("Enter a password that is at least 8 character:");
		String password = input.next();
		int password1 = password.length();
		input.close();
		while (password1<8) 
		{
			System.out.println("Enter a password that is at least 8 character:");
			password = input.next();
			password1 = password.length();	
		}
		
		System.out.println("Your user name is "+user.toLowerCase()+" and your password is "+password.toLowerCase());
		
	}

}
/* Screen Dump

Paste the output of your code here
 
 */