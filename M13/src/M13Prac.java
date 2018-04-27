
public class M13Prac {

	public static void main(String[] args)
	{
		int [] array = new int[]{4, 9, 0, 3, 6, 2, 12,6} ;

		int a=3;
		System.out.println(recMethod1(array,a));
		
	}

	public static int recMethod1(int[] array, int a)
	{ 

		return recMethodHelper(array, a, 0);

	}

	public static int recMethodHelper(int[] array, int a, int b)
	{

		if(b < array.length) 
		{

			if(array[b] % a ==0) 
			{
				return 1 + recMethodHelper(array, a, b+1);
			} 
			else
			{

				return 0 + recMethodHelper(array, a, b+1);

			}
		}

		return 0;

	}

	}

