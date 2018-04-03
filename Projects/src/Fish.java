//class for P4B
public class Fish extends Animal
{//start class
	//constructors
	public Fish()
	{
		super();
	}
	public Fish(String name)
	{
		super(name);
	}
	//override abstract method
	@Override
	public boolean isWarmBlooded() {
		return false;
	}
	@Override
	public boolean canLiveOnLand() {
		return false;
	}
	@Override
	public String toString()
	{
		String x=super.toString();
		if(getName().equalsIgnoreCase("No name"))
		{
			x+="I am a fish with no name. ";
		}
		else
		{
			x+="I am a fish. ";
		}
		return x;
	}
}//end class
