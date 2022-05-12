import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Stats_part1of2 
{

	public static void main(String[] args) 
	{
		File textFile;
		String fileName;
		Scanner input = new Scanner(System.in);
		FileReader in;
		BufferedReader readFile;
		
		String scores;
		double avrScores;
		double total = 0;
		int numScores = 0;
		
		System.out.print("Enter the name of the test file: ");
		fileName = input.nextLine();
		
		textFile = new File(fileName);
		
		try 
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while ((scores = readFile.readLine()) != null) 
			{
				numScores +=1;
				System.out.println(scores);
				total += Double.parseDouble(scores);
			}
			
			avrScores = total / numScores;
			System.out.println("Averge: " + avrScores);
			readFile.close();
    		in.close();
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
