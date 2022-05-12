
import java.io.*;

import java.util.ArrayList;

import java.util.Scanner;



public class Roster

{



	public static void main(String[] args)
	
	    {
	
			Scanner scanner = new Scanner(System.in);
			String fileName = null;
			File file = null;
			FileOutputStream out = null;
			ObjectOutputStream writeStu = null;
			FileInputStream in = null;
			ObjectInputStream readStu = null;
			int numberStudents;
			String firstName;
			String lastName;
			stuName[] writeStudents = null;
			stuName[] readStudents = null;
		
			System.out.print("Enter file name: ");
			fileName = scanner.nextLine();
			file = new File(fileName);
		
			System.out.print("Enter number of students: ");
			numberStudents = scanner.nextInt();
			
			scanner.nextLine();
	
		
	
	
		try 
		{
	
			out = new FileOutputStream(file);
			writeStu = new ObjectOutputStream(out);
			
			for (int i = 1; i <= numberStudents; i++)
			{
	      
				System.out.print("\nEnter first name of student " + i + ": ");
				firstName = scanner.nextLine();
				
				System.out.print("Enter last name of student " + i + ": ");
				lastName = scanner.nextLine();
	
				writeStu.writeObject(new stuName(firstName, lastName));
	
			}
	
			writeStu.close();
	
			System.out.println("Data has been written to the file");

			in = new FileInputStream(file);
			readStu = new ObjectInputStream(in);
			
			for (int i = 1; i <= numberStudents; i++) 
			{
				 System.out.println((stuName)readStu.readObject());
			}
			readStu.close();
			
		} 
		catch (FileNotFoundException e) 
		{               
			System.out.println("File not found.");
		} 
		catch (IOException e)
		{
			System.out.println("Problem with input/output.");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class could not be found to cast object.");
		}

		
		
		
		}
	
	

}

