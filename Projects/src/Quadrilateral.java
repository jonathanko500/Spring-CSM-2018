//project 3
public class Quadrilateral extends PolyShape
{//start class
	public Quadrilateral () {
		super ();
	}
	public Quadrilateral (int ... sideLength) {
		super (sideLength);
	}
	@Override
	public String toString () {
		String x = super.toString();
		x+="I am also a Quadrilateral. ";
		return x;
	}
}//end class