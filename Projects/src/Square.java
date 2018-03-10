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
		//method
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
		public boolean trueSquare()
		{
			int x=0;
			boolean pass=true;
			for(int i=0;i<getSideLengths().length;i++)
			{
				if(getSideLengths()[x]==getSideLengths()[i])
				{
					pass=true;
				}
				else
				{
					pass= false;
				}
			}
			return pass;
		}
}//end class
