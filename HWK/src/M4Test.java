
public class M4Test
{//start class
	public static void main (String[]args)
	{//start main
		M4Test test = new M4Test();
		double b;
		int x=5,y=7,z=1,a=4;
		b=test.Avg(x, y);
		System.out.println(b);
		b=test.Avg(x, y, z);
		System.out.println(b);
		b=test.Avg(x, y, z, a);
		System.out.println(b);
	}//end main
	public static double Avg(int x, int y)
	{
		double num=(x+y)/2.0;
		return num;
	}
	public static double Avg(int x,int y, int z)
	{
		double num=(x+y+z)/3.0;
		return num;
	}
	public static double Avg(int x,int y, int z, int a)
	{
		double num=(x+y+z+a)/4.0;
		return num;
	}
}//end class
