import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile_part2of2
{

	public static void main(String[] args) 
	{
		File file;
		
		String name; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		name = input.nextLine();
		file = new File(name);
		
		if (file.exists())
		{
			System.out.println("File exists. ");
		}		
		else 
		{
			System.out.println("File does not exists. ");
		}
		try 
		{
			file.createNewFile();
			System.out.println("New file created");
		}catch (IOException e) 
		{
			System.out.println("File could not be created.");
			System.out.println("IOException: " + e.getMessage());
		}
		
		
	}

}
