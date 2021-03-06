import java.util.Arrays;

public class Triangle extends PolyShape {
	public Triangle () {
		super ();
	}
	
	public Triangle ( int ... sideLength) {
		super (Arrays.copyOf(sideLength, 3));
	}
	//methods
	public boolean isEqualiteral () 
	{//start method
		if (getSideLengths()[0] == getSideLengths()[1]&&getSideLengths()[0]==getSideLengths()[2])
		{
			return true;
		}
		else
		{
			return false;
		}
	}//end method
	public boolean isIsosceles ()
	{//start method
		if (getSideLengths()[0] == getSideLengths()[1]||getSideLengths()[0]==getSideLengths()[2])
		{
			return true;
		}
		else
		{
			return false;
		}
	}//end method
	@Override
	public String toString()
	{
		String x=super.toString();
		x+="I am also a Triangle. ";
		return x;
	}
}