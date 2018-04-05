//class for P4B
public class Whale extends Animal implements WaterLiveable
{
	//constructor
	public Whale()
	{
		super();
	}
	public Whale(String name)
	{
		super(name);
	}
	@Override
	public String toString()
	{
		String x=super.toString();
		if(getName().equalsIgnoreCase("No name"))
		{
			x+="I am a whale with no name. ";
		}
		else
		{
			x+="I am a whale. ";
		}
		return x;
	}
	@Override
	public boolean isWarmBlooded() {
		return true;
	}
	@Override
	public boolean canLiveOnLand() {
		return false;
	}
}//end class
