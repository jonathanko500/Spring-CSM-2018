//class for Midterm
public class HighSchool extends School implements Comparable <HighSchool>
{//start class
	private boolean special;
	//constructors
	public HighSchool(String aName,boolean diff) {
		super(aName);
		this.special=diff;
	}
	public HighSchool(String aName,int num,boolean diff)
	{
		super(aName,num);
		this.special=diff;
	}
	//setter
	public void setSpecial(boolean diff)
	{
		this.special=diff;
	}
	//getter
	public boolean getSpecial()
	{
		return special;
	}
	@Override
	public String toString()
	{
		String x=super.toString();
		x+="\nSpecialized: "+special;
		return x;
	}
	@Override
	public boolean equals(Object obj)
	{//start method
		if(obj instanceof HighSchool)
		{//start
			HighSchool prison = (HighSchool)obj;
			boolean sameName,sameNum,sameSpec;
			//compare name
			if(getName().equalsIgnoreCase(prison.getName()))
			{
				sameName=true;
			}
			else
			{
				sameName=false;
			}
			//compare num
			if(getNumbStud()==prison.getNumbStud())
			{
				sameNum=true;
			}
			else
			{
				sameNum=false;
			}
			//compare spec
			if(getSpecial()==prison.getSpecial())
			{
				sameSpec=true;
			}
			else
			{
				sameSpec=false;
			}
			return sameName&&sameNum&&sameSpec;
		}//end
		else
		{
			return false;
		}
	}//end method
	@Override
	public int compareTo(HighSchool jail)
	{//start
		if(getName().equalsIgnoreCase(jail.getName()))
		{//name is same
			if(getNumbStud()>jail.getNumbStud())
			{//first > second
				return 1;
			}
			else if(getNumbStud()<jail.getNumbStud())
			{//first < second
				return -1;
			}
			else
			{//first == second
				return 0;
			}
		}
		else
		{
			return getName().compareTo(jail.getName());
		}
	}//end
}//end class
