//driver
public class M16Prac 
{//start
	public static void main(String[] args)
	{
		Movie[] list = new Movie[7];
		list[0]=new Movie("Frozen",2015);
		list[1]=new Documentary("World War 2",1942,"Histroy");
		list[2]=new Movie("Moana",2017);
		list[3]=new Documentary("Life of a Cell",2017,"Science");
		list[4]=new Movie("Cars 3",2017);
		list[5]=new Movie("Avengers: Infinity War",2018);
		list[6]=new Documentary("How To Aadd",2015,"Math");
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i].toString());
		}
		
	}
}//end