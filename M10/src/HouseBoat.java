//class for final
public class HouseBoat extends House
{//start
	private String name;
	//constructors
	public  HouseBoat(int numb,boolean sale,String aName)
	{
		super(numb,sale);
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
	//overrides
	@Override
	public String toString()
	{
		String x=super.toString();
		x+="The name is "+name;
		return x;
	}
}//end
