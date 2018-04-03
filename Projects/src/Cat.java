//class for P4B
public class Cat extends Animal
{//start class
	//constructor
	public Cat()
	{
		super();
	}
	public Cat(String name)
	{
		super(name);
	}
	@Override
	public boolean isWarmBlooded() {
		return true;
	}
	@Override
	public String toString()
	{
		String x=super.toString();
		if(getName().equalsIgnoreCase("No name"))
		{
			x+="I am a cat with no name. ";
		}
		else
		{
			x+="I am a cat. ";
		}
		return x;
	}
	@Override
	public boolean canLiveOnLand() {
		return true;
	}
}//end class
