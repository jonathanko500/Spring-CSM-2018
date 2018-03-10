import java.util.Arrays;
//project 3
public class Quadrilateral extends PolyShape
{//start class
	private int limitSide=4;
	private int[] limit = new int[4];
	public Quadrilateral () {
		super ();
	}
	public Quadrilateral (int ... sideLength) {
		super (sideLength);
	}
	@Override
	public String toString () {
		String s = "I am a shape with " + limitSide + " sides of length: ";
		for(int length : getSideLengths()) 
			s += length + " ";
		s += "\nI am a polygon. I am also a Quadrilateral. ";
		return s;
	}
}//end class