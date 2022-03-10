import java.util.Scanner;

public class Adder 
{
	
	public static int sumNum(int fN, int sN)
		{
			int sum = fN + sN;
			
			return sum;
		}

	public static void main(String[] args) 
	{
	 	
		int firstNum = (int)(10 * Math.random() + 1);
		
		int secndtNum = (int)(10 * Math.random() + 1);
		
		
		Scanner input = new Scanner(System.in);
		
		
	System.out.println(sumNum(firstNum, secndtNum));
		
	int firstNum1 = input.nextInt();
	int secndNum1 = input.nextInt();	
		
	System.out.println(firstNum1 + " + " + secndNum1+ " = " + sumNum(10, 3) );
	
	if (firstNum1+secndNum1 == sumNum(10, 3)) 
	{
		System.out.println("right");
	}
	else 
	{
		System.out.println("Wrong answer");

	}
	}
	
	
	
	
}
