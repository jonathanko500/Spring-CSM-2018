//project 3
//code by Jonathan Ko and Kennedy Louie
public class Shape 
{//start class

	public static void main(String[] args)
	{//start main
		int[] list = new int[]{2,2,2,2,5,6};
		int[] list2 = new int[]{3,2,3,2,5,6};
		Square shape = new Square(list);
		System.out.println(shape.trueSquare());
		System.out.println(shape.getArea());
		System.out.println(shape.getPerimeter());
		System.out.println(shape.toString());
		System.out.println("---------------");
		Rectangle shape2 = new Rectangle(list2);
		System.out.println(shape2.trueRec());
		System.out.println(shape2.getArea());
		System.out.println(shape2.getPerimeter());
		System.out.println(shape2.toString());
		System.out.println("---------------");
		Triangle shape3 = new Triangle(list2);
		System.out.println(shape3.isIsosceles());
		System.out.println(shape3.getPerimeter());
		System.out.println(shape3.toString());
		System.out.println("---------------");
		Triangle shape4 = new Triangle(list);
		System.out.println(shape4.isEqualiteral());
		System.out.println(shape4.getPerimeter());
		System.out.println(shape4.toString());
		System.out.println("---------------");
		Quadrilateral shape5 = new Quadrilateral(list2);
		System.out.println(shape5.getPerimeter());
		System.out.println(shape5.toString());
		System.out.println("---------------");
		PolyShape shape6 = new PolyShape(list);
		System.out.println(shape6.getPerimeter());
		System.out.println(shape6.toString());
		System.out.println("---------------");
	}//end main
}//end class