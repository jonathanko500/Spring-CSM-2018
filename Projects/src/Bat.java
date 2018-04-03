//class for P4B
public class Bat extends Animal
{//start class
	private double FlightSpeed;
	//constructor
	public Bat()
	{
		super();
		this.FlightSpeed=0;
	}
	public Bat(String name,double speed)
	{
		super(name);
		this.FlightSpeed=speed;
	}
	//setter
	public void setFlightSpeed(double speed)
	{
		this.FlightSpeed=speed;
	}
	//getter
	public double getFlightSpeed()
	{
		return FlightSpeed;
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
			x+="I am a bat with no name. ";
		}
		else
		{
			x+="I am a bat. ";
		}
		return x;
	}
	@Override
	public boolean canLiveOnLand() {
		return true;
	}
}//end class
