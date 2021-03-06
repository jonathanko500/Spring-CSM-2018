//project 3
public class Rectangle extends Quadrilateral
{//start class
	//constructors
	public Rectangle()
	{
		super();
	}
	public Rectangle(int...sideLength)
	{
		super(sideLength);
	}
	//toString
	@Override
	public String toString()
	{
		String x=super.toString();
		x+="I am also a Rectangle. ";
		return x;
	}
	//methods
	public boolean trueRec()//check to see if it is a real rectangle
	{
		if(getSideLengths()[0]==getSideLengths()[2]&&getSideLengths()[1]==getSideLengths()[3])
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int getArea()
	{
		int x=1,y;
		for(int i=0;i<2;i++)
		{
			y=getSideLengths()[i];
			x*=y;
		}
		return x;
	}
}//end class
