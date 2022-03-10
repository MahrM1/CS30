import java.util.Scanner;

public class StudentRoster 
{
	public static void main(String[] args) 
	{
		String [] name_student;
		
		int numstudnet;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many Student there?");
		numstudnet =input.nextInt();
	
		name_student = new String [numstudnet];
		
		
		//Get student names
		
		for (int i = 0; i  <name_student.length; i++) 
		{
			System.out.println("Enter the Students name ");
			name_student [i] = input.next();
			
		}
		
		for (int i = name_student.length-1; i>= 0 ; i--) 
		{
			System.out.println(name_student[i]);
		}
		
		
	}
	
}