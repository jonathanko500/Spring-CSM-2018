//class for final
public class House implements Comparable<House>
{//start
	private int numBedroom;
	private boolean sale;
	private final static boolean DEFAULT_SALE = false;
	private final static int DEFAULT_NUMB = 1;
	//constructors
	public House()
	{
		this.numBedroom=DEFAULT_NUMB;
		this.sale=DEFAULT_SALE;
	}
	public House(int numb,boolean cheap)
	{
		this.numBedroom=numb;
		this.sale=cheap;
	}
	//setter
	public void setNumBedroom(int numb)
	{
		if(numb<1)
		{
			this.numBedroom=DEFAULT_NUMB;
		}
		else
		{
			this.numBedroom=numb;
		}
		
	}
	public void setSale(boolean cheap)
	{
		this.sale=cheap;
	}
	//getter
	public int getNumBedroom()
	{
		return numBedroom;
	}
	public boolean getSale()
	{
		return sale;
	}
	//overrides
	@Override
	public String toString()
	{//start
		String x="";
		if(sale==true)
		{
			x+="This house is for sale and has "+numBedroom+" bed rooms.";
		}
		else
		{
			x+="This house is not for sale but has "+numBedroom+" bed rooms.";
		}
		return x;
	}//end
	@Override
	public boolean equals(Object x)
	{//start override
		if(x instanceof House)
		{//check to see if same obj
			House live = (House) x;
			boolean sameNumb,sameSale;
			if(getNumBedroom()==live.getNumBedroom())
			{//compare numb of bed room
				sameNumb=true;
			}
			else
			{//compare numb of bed room
				sameNumb=false;
			}
			if(getSale()==live.getSale())
			{//compare sale
				sameSale=true;
			}
			else
			{//compare sale
				sameSale=false;
			}
			return sameNumb&&sameSale;
		}
		else
		{//check to see if same obj
			return false;
		}
	}//end override
	@Override
	public int compareTo(House newHouse)
	{//start override
		if(numBedroom>newHouse.getNumBedroom())
		{//if the bed room number is greater
			return 1;
		}
		else if(numBedroom<newHouse.getNumBedroom())
		{//if the bed room number is less
			return -1;
		}
		else
		{//same numg of bed room
			if(sale==newHouse.getSale())
			{//compare sale
				return 1;
			}
			else 
			{
				return -1;
			}
		}
	}//end override
	
}//end
