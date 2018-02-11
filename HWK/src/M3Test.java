
public class M3Test
{//start class

	public static void main(String[] args) 
	{//start main
		M3TestObj book1 = new M3TestObj();
		book1.setTitle("Comp Sci");
		book1.setAuthor("Jonathan");
		System.out.println(book1.getAuthor());
		System.out.println(book1.getTitle());
		M3TestObj book2 = new M3TestObj();
		System.out.println(book2.getISBN());
		System.out.println(book2.getPubYear());
		M3TestObj book3 = new M3TestObj("Caligraphy","Thomas","632-7871476345",1954);
		System.out.println(book3.getTitle()+" "+book3.getAuthor()+" "+book3.getISBN()+" "+book3.getPubYear()+" ");
		
	}//end main

}//end class
