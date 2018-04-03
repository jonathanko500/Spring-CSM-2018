//class for P4B
public class HumpbackWhale extends Whale
{//start class
	//constructor
	public HumpbackWhale()
	{
		super();
	}
	public HumpbackWhale(String name)
	{
		super(name);
	}
	@Override
	public String toString()
	{
		String x=super.toString();
		if(getName().equalsIgnoreCase("No name"))
		{
			x+="I am also humpback whale with no name. ";
		}
		else
		{
			x+="I am also a humpback whale. ";
		}
		return x;
	}
}//end class
