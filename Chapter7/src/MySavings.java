
public class MySavings
{

	private int penny;
	private int nickel;
	private int dime;
	private int quarter;
	
	public MySavings()
	{

	}

	public double addPenny(int NP) 
	{
		return penny = penny +NP;
	}
	public double addNickle(int NN) 
	{
		return nickel =nickel+NN;
	}
	public double addDime(int ND) 
	{
		return dime =dime + ND;
	}
	public double addQuarter(int NQ) 
	{
		return quarter = quarter + NQ;
	}
	
	public double youChoice() 
	{
		double yourCh = 0.0;
		yourCh = penny * 0.01 + nickel *0.05 +dime *0.10+ quarter *0.25;
		
		return yourCh;
	}
	
	
	
	
	
}
