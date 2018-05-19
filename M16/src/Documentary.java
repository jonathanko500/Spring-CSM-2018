//Documentary class
public class Documentary extends Movie
{//start class
	private String sub;
	private final static String DEFAULT_SUB = "N/A";
	//constructor
	public Documentary()
	{	
		super();
		sub=DEFAULT_SUB;
	}
	public Documentary(String name, int year, String topic)
	{
		super(name,year);
		sub=topic;
	}
	//setter
	public void setSubject(String title)
	{
		this.sub=title;
	}
	//getter
	public String getSub()
	{		
		return sub;
	}
	//overrides
	@Override
	public String toString()
	{//start
		String x=super.toString();
		if(sub.equalsIgnoreCase(DEFAULT_SUB))
		{
			x+=" This movie is not a documentary";
		}
		else
		{
			x+=" This movie is a documentary about "+sub+".";
		}
		return x;
	}//end
	@Override
	public boolean equals(Object obj)
	{//start
		if(obj instanceof Documentary)
		{//compare if obj is same
			Documentary show=(Documentary) obj;
			boolean sameSub;
			super.equals(show);
			if(sub.equalsIgnoreCase(show.getSub()))
			{
				sameSub=true;
			}
			else
			{
				sameSub=false;
			}
			return sameSub;
		}
		else
		{
			return false;
		}
	}//end
	@Override
	public int compareTo(Object x) 
	{//start
		if(x instanceof Documentary)
		{//check if obj==movie
			Documentary newMovie=(Documentary) x;
			super.compareTo(newMovie);
			if(sub.equalsIgnoreCase(newMovie.getSub()))
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else
		{//check
			return -1;
		}
	}//end
}//end class
