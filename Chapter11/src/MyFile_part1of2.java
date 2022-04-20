import java.io.File;

public class MyFile_part1of2 
{
	public static void main(String[] args) 
	{
		File textFile = new File("C:/Chapter11/test file.txt"); 
	
		if (textFile.exists()) 
		{
			System.out.println("File exists. ");
		}		
		else 
		{
			System.out.println("File does not exists. ");
		}
	}
}
