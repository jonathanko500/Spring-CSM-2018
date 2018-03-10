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
	
}//end class
