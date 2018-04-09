//class for P4B
public class Cat extends Animal implements Adoptable
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
	public boolean isWarmBlooded() {
		return true;
	}
	@Override
	public String getHomeCareInstructions() {
		String x="Feed the cat. Give a cat a bed, scratch post and a box with cat litter.";
		return x;
	}
}//end class