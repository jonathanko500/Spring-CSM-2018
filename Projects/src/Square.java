//project 3
public class Square extends Quadrilateral
{//start class
	//constructors
		public Square()
		{
			super();
		}
		public Square(int...sideLength)
		{
			super(sideLength);
		}
		//toString
		@Override
		public String toString()
		{
			String x=super.toString();
			x+="I am also a Square. ";
			return x;
		}
}//end class
