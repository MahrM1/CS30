
import java.io.Serializable;

public class stuName implements Serializable 
{

	private String firstName,lastName;
	

	
	public stuName() 
	{
		super();
	}
	
	public stuName(String fn, String ln) 
	{
		this.firstName = fn;
		this.lastName = ln;
	}

	public String getFirstName()
	{
		return firstName;
	}
	
	 public String getLastName()
	 {
		return lastName;
	 }
	 
	public void setFirstName(String fn)
	{
		this.firstName = fn;
	}

	
	public void setLastName(String ln) 
	{
		this.lastName = ln;
	}
	
	public String toString() 
	{
		return (firstName+ " " + lastName);
	}
	
	
	
}
