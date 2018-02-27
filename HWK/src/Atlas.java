//class for M5Test
public class Atlas extends Book
{
	private int numbMap;
	//constructor
	public Atlas(String author, String title, int copyrightYear, int mapPGs) 
	{
		super(title,author,copyrightYear);
		this.numbMap=mapPGs;
	}
	//setter
	public void setNumbMap(int mapPGs)
	{
		numbMap=mapPGs;
	}
	//getter
	public int getNumbMap()
	{
		return numbMap;
	}
	@Override
	public String toString() 
	{
		return getTitle()+" by "+ getAuthor()+ " (" + getCopyrightYear() + "). This atlas contains "+numbMap+" maps.";
	}
	
}