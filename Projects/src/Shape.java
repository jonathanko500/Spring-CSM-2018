//project 3
//code by Jonathan Ko and Kennedy Louie
public class Shape 
{//start class

	public static void main(String[] args)
	{//start main
		int[] list = new int[]{1,2,3,4,5,6};
		/*
		PolyShape shape = new PolyShape(list);
		System.out.println(shape.toString());//polygon
		PolyShape shape3 = new Rectangle(list);
		System.out.println(shape3.toString());//Rec
		PolyShape shape4 = new Square(list);
		System.out.println(shape4.toString());//Squa
		*/
		PolyShape shape2 = new Quadrilateral(list);
		System.out.println(shape2.toString());//quad
		for(int i =0;i<shape2.getSideLengths().length;i++)
		{
			System.out.println(shape2.getSideLengths()[i]);
		}
	}//end main
}//end class