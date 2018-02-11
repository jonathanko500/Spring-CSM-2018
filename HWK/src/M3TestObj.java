
public class M3TestObj
{//start class
	private String title,author,ISBN;
	private int pubYear;
	public M3TestObj()
	{//start constructor
		title="";
		author="";
		ISBN="";
		pubYear=0;
	}//end constructor
	public M3TestObj(String newTitle, String person, String code, int year)
	{//start constructor
		title=newTitle;
		author=person;
		ISBN=code;
		pubYear=year;
	}//end constructor
	//setter
	public void setTitle(String name)
	{
	title=name;
	}
	public void setAuthor(String name)
	{
	author=name;
	}
	public void setISBN(String code)
	{
	ISBN=code;
	}
	public void setPubYear(int year)
	{
	pubYear=year;
	}
	//getter
	public String getTitle()
	{
	return title;
	}
	public String getAuthor()
	{
	return author;
	}
	public String getISBN()
	{
	return ISBN;
	}
	public int getPubYear()
	{
	return pubYear;
	}
}//end class
