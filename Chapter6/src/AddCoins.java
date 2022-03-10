import java.text.NumberFormat;
import java.util.Scanner;
/*

Program: TimeConverter.java          Last Date of this Revision: November 2, 2021

Purpose: Create a AddCoins 
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class AddCoins {

	public static void main(String[] args)
			{
		
		System.out.println("Enter your coins:");
		int NQ = AddCoins.getInput("Quarters");
		int ND = AddCoins.getInput("Dimes");
		int NN = AddCoins.getInput("Nickels");
		int NP = AddCoins.getInput("pennis");
		
		System.out.println("Total: "+ getDollarAmount(NQ,ND,NN,NP));
	}
	private static int getInput(String string)
	{
		int UN;
		Scanner input =new Scanner(System.in);
		System.out.println(string);
		
		do {
			while (! input.hasNextInt()) 
			{
				input.next();
				System.out.println("I SAID NUMBER");
			}
		UN = input.nextInt();
		if (UN < 0)
			System.out.println("\t want to tell me how you have a nigative number of coins again:");
		}
		while (UN <0);
	
		return UN;
	}

	
	private static String getDollarAmount(int nQ, int nD, int nN, int nP)
	{
		NumberFormat nf = NumberFormat.getCompactNumberInstance();
		double D = (.25*nQ)+(.10*nD)+(0.05*nN)+(.01*nP);
		String A = nf.format(D);
		return A;
	}

	
}
/* Screen Dump

Paste the output of your code here
 
 */