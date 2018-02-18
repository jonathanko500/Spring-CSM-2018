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
	public student(String begin,String end, String acct, double amount)
	{
		first=begin;
		last=end;
		ID=acct;
		if(amount>0)
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
	public void setTuition(double amount)
	{
		if(amount>0)
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
		x=first+" "+last+" "+ID+" "+tuition;
		return x;
	}
}//end class