//project 4 part A
public class Payment 
{//start class
	private double amount;
	private String date;
	//constructor
	public Payment()
	{
		this.amount=0;
		this.date="No date";
	}
	public Payment(double num, String aDate)
	{
		this.amount=num;
		this.date=aDate;
	}
	//setter
	public void setAmount(double num)
	{
		if(num<0)
		{
			this.amount=0;
		}
		else
		{
			this.amount=num;
		}
	}
	public void setDate(String aDate)
	{
		this.date=aDate;
	}
	//getter
	
}//end class