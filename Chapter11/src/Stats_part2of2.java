import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Stats_part2of2 
{
	
	public static void main(String[] args) 
	{
		
		File textFile = new File("C:\\Users\\1100015963\\git\\CS30\\Chapter11");
		
		Scanner input = new Scanner(System.in);
		FileReader in;
		BufferedReader readFile;
		String name;
		double score;
		
		try 
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			
			
			for (int = i;  i < 5; i++ ) 
			{
				System.out.print("Enter students name: ");
				name = input.nextLine();
				
				System.out.print("Enter studen name: ");
				score = input.nextDouble();
				
				readFile.write(name);
				readFile.newline();
				readFile.write(String.valueOf(score));
				readFile.newLine();
			}
			
			readFile.close();
			in.close();
			
			System.out.println();

			
			
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("problem readingfile.");
			System.err.println("IOException: " + e.getMessage());
		}

	}
}
