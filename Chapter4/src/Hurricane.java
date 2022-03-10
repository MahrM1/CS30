import java.util.Scanner;

/*

Program: Hurricane.java          Last Date of this Revision: October 13, 2021

Purpose: The SafirSimpson Hurricane Scale provides a rating ( a category) depending on the current intensity of a hurricane. 
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/
public class Hurricane
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the category the hurricane:");
		int category = input.nextInt();
		input.close();
		 switch(category) 
		 {
		 case 1: System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr");
		 case 2: System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr");
		 case 3: System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr");
		 case 4: System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr");
		 case 5: System.out.println("Category 5: greater than 155 mph or 135 kt or 249 km/hr");
		 }

		
	}

}
/* Screen Dump

Paste the output of your code here
 
 */