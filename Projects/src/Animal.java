//class for P4B
public abstract class Animal implements Mammal
{//stat class
	private String name;
	//constructors
	public Animal()
	{
		this.name="no name";
	}
	public Animal(String aName)
	{
		this.name=aName;
	}
	//setter
	public void setName(String aName)
	{
		this.name=aName;
	}
	//getter
	public String getName()
	{
		return name;
	}
	@Override
	public String toString()
	{
		String x;
		if(name.equalsIgnoreCase("no name"))
		{
			x="I have no name. ";
		}
		else
		{
			x="I am an animal with a name of "+name+". ";
		}
		return x;
	}
	
}//end class