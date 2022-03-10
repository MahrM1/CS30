
public class Reverse 
{

	public static void main(String[] args) 
	{
		final int num_ele = 10;
		int [] num = new int [num_ele];
		
		for(int q = 0; q < num_ele; q++)
			
		{
			num[q] = q;
		}
		
		System.out.println("countdown ");
		
		for(int q = num_ele - 1; q>= 0; q--) 
		{
			System.out.println(num[q]);
		}
		
		
	}

}
