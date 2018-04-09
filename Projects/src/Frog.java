//class for P4B
public class Frog extends Animal implements Adoptable, Amphibian
{//start class
	//constructor
	public Frog()
	{
		super();
	}
	public Frog(String name)
	{
		super(name);
	}
	@Override
	public String toString()
	{
		String x=super.toString();
		if(getName().equalsIgnoreCase("No name"))
		{
			x+="I am a frog with no name. ";
		}
		else
		{
			x+="I am a frog. ";
		}
		return x;
	}
	@Override
	public String getHomeCareInstructions() {
		String x="Put the frog in a clean, clear and secure container. Keep the enviorment moist. Feed the frog";
		return x;
		
	}
	@Override
	public String LiveIn() {
		String x="I can live in both water and land.";
		return x;
	}
	@Override
	public boolean isWarmBlooded() {
		return false;
	}
}//end class