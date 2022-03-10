import java.util.Scanner;

/*

Program: Printing.java          Last Date of this Revision: October 13, 2021

Purpose: Printing prices are typically based on the number of copies to be printed.
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class Printing 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of copies to be printed:");
		int  Nu=input.nextInt();
		
		input.close();
		 
		
		 if (Nu>=0 && Nu<100)
		 {
			 System.out.println("Price per copy is:$0.30 \n"+"Total cost is:"+0.30*Nu );
		 }
		 else if (Nu>=100 && Nu<500)
		 {
			 System.out.println("Price per copy is:$0.28\n"+"Total cost is:"+0.28*Nu);
		 }
		 else if(Nu>=500 &&Nu<750)
		 {
			 System.out.println("Price per copy is:$0.27\n"+"Total cost is:"+0.27*Nu);
		 }
		 else if (Nu>=750 && Nu<1000)
		 {
			 System.out.println("Price per copy is:$0.26\n"+"Total cost is:"+0.26*Nu);
		 }
		 else if (Nu>=1000)
		 {
			 System.out.println("Price per copy is:$0.25\n"+"Total cost is:"+ 0.25*Nu);
		 }
		 
		
		 
		 
	}

}
	
/* Screen Dump

Paste the output of your code here
 
 */
