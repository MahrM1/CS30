import java.util.Scanner;

public class FindName 
{

	public static void main(String[] args) 
	{
		
		final int Max_Names = 10;
		
		String [] nameArray  = new String[Max_Names];
		
		Scanner input =new Scanner(System.in);
		
		String nameToFind;
		
		int location;
		
		for (int i=0; i<nameArray.length;i++ ) 
		{
			
			System.out.println("Enter a name: ");
			nameArray[i] = input.nextLine();
		}
		
		System.out.println("Enter a name to search for: ");
		nameToFind = input.nextLine();
		
		location = search.linear(nameArray, nameToFind);
		
		if (location == -1) 
		{
			System.out.println("Sorry, name not found in array");
		}
		else 
		{
			System.out.println("First occurence is element " + location);
		}
	}

}
