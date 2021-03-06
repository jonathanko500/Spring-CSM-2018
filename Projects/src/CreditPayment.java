//project 4 part A
public class CreditPayment extends Payment
{//start class
	private String name;
	private String CreditNum;
	//constructors
	public CreditPayment()
	{
		super();
		this.name="N/A";
		this.CreditNum="0000000000000000";
	}
	public CreditPayment(Double num, String aDate, String aName, String ID)
	{
		super(num,aDate);
		this.name=aName;
		this.CreditNum=ID;
	}
	//setter
	public void setName(String aName)
	{
		this.name=aName;
	}
	public void setCreditNum(String aID)
	{
		if(aID.length()!=16)
		{
			this.CreditNum="0000000000000000";
		}
		else
		{
			this.CreditNum=aID;
		}
		
	}
	//getter
	public String getName()
	{
		return name;
	}
	public String getCreditNum()
	{
		return CreditNum;
	}
	@Override
	public String toString()
	{
		String x;
		if(getDate().equalsIgnoreCase("No date"))
		{
			x=super.toString();
			x+="There is no owner of this card.";
		}
		else
		{
			x=super.toString();
			x+=" The onwer of this card is "+name+". The credit card number is "+CreditNum;
		}
		return x;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof CreditPayment)
		{
			CreditPayment card = (CreditPayment) obj;
			boolean sameAmount,sameDate,sameName,sameCreditNum;
			//compare amount
			if(getAmount()==card.getAmount())
			{
				sameAmount=true;
			}
			else
			{
				sameAmount=false;
			}
			//compare date
			if(getDate().equalsIgnoreCase(card.getDate()))
			{
				sameDate=true;
			}
			else
			{
				sameDate=false;
			}
			//compare name
			if(getName().equalsIgnoreCase(card.getName()))
			{
				sameName=true;
			}
			else
			{
				sameName=false;
			}
			//compare CreditNum
			if(getCreditNum().equalsIgnoreCase(card.getCreditNum()))
			{
				sameCreditNum=true;
			}
			else
			{
				sameCreditNum=false;
			}
			return sameAmount&&sameDate&&sameName&&sameCreditNum;
		}
		else
		{
			return false;
		}
		
	}
}//end class
