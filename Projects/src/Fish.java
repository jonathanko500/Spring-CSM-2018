//class for P4B
public class Fish extends Animal implements Adoptable, WaterLiveable
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
	@Override
	public String getHomeCareInstructions() {
		String x="Put the fish in a clean fishbowl. Feed the fish. Keep the water clean.";
		return x;
	}
	@Override
	public boolean canLiveOnLand() {
		return false;
	}
	@Override
	public boolean isWarmBlooded() {
		return false;
	}
}//end class