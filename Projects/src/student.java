//object for Registration
//project 2
public class student 
{//start class
	private String first,last,ID;
	private boolean tuition;
	//constructor
	public student()
	{
		first="";
		last="";
		ID="";
		tuition=true;
	}
	public student(String begin,String end, String acct, String amount)
	{
		first=begin;
		last=end;
		ID=acct;
		if(amount.equalsIgnoreCase("yes"))
		{
			tuition=true;
		}
		else
		{
			tuition=false;
		}
	}
	//setter
	public void setFirst(String begin)
	{
		first=begin;
	}
	public void setLast(String end)
	{
		last=end;
	}
	public void setID(String acct)
	{
		ID=acct;
	}
	public void setTuition(String amount)
	{
		if(amount.equalsIgnoreCase("yes"))
		{
			tuition=true;
		}
		else
		{
			tuition=false;
		}
	}
	//getter
	public String getFirst()
	{
		return first;
	}
	public String getLast()
	{
		return last;
	}
	public String getID()
	{
		return ID;
	}
	public boolean getTuition()
	{
		return tuition;
	}
	
	//toString
	public String toString()
	{
		String x="";
		x="Student is "+first+" "+last;
		if(tuition==true)
		{
			x+=", student ID is: "+ID+", student is enrolled";
		}
		else
		{
			x+=" student is not enrolled";
		}
		return x;
	}
}//end class
