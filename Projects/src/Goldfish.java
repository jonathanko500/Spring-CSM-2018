//class for P4B
public class Goldfish extends Fish
{//start class
	//constructors
	public Goldfish()
	{
		super();
	}
	public Goldfish(String name)
	{
		super(name);
	}
	@Override
	public String toString()
	{
		String x=super.toString();
		if(getName().equalsIgnoreCase("No name"))
		{
			x+="I am also a goldfish with no name. ";
		}
		else
		{
			x+="I am also a goldfish. ";
		}
		return x;
	}	
}//end class
