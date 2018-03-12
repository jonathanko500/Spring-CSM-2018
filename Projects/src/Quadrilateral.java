import java.util.Arrays;
//project 3
public class Quadrilateral extends PolyShape
{//start class
	public Quadrilateral () {
		super ();
	}
	public Quadrilateral (int ... sideLength) {
		super (Arrays.copyOf(sideLength, 4));
	}
	@Override
	public String toString () {
		String x=super.toString();
		x+="I am also a Quadrilateral. ";
		return x;
	}
}//end class