
public class M5Test
{
	public static void main(String[] args)
	{//start main
		Book theBook = new Book("The Greatest Book Ever","Kennedy Louie",1989);
		Atlas theAtlas = new Atlas("The Greatest Atlas Ever", "Kennedy Louie", 5,1);
		theBook.setAuthor("Jonathan Ko");
		theBook.setCopyrightYear(2018);
		theAtlas.setNumbMap(25);
		theAtlas.setCopyrightYear(2018);
		System.out.println(theBook.toString());
		System.out.println(theAtlas.toString());
	}//end main
}
