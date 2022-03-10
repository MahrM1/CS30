
public class MySavingsTest {

	public static void main(String[] args)
	{
		MySavings bank = new MySavings();
		
		System.out.println("Show total in bank. ");
		
		System.out.println("Add a penny. " + bank.addPenny(5));
		
		System.out.println("Add a nickel. " + bank.addNickle(9) );
		
		System.out.println("Add a dime. " + bank.addDime(4) );
		
		System.out.println("Add a quarter. " + bank.addQuarter(3) );
		
		System.out.println("Enter 0 to quit " );
		
		System.out.println("Enter you choice: " + bank.youChoice() );
	}

}
