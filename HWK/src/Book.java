//class for M5Test
public class Book
{//start class
	private String title, author;
	private int copyrightYear;
	public Book(String title, String author, int copyrightYear)
	{
		this.title = title;
		this.author = author;
		this.copyrightYear = copyrightYear;
	}
	//getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getCopyrightYear() {
		return copyrightYear;
	}
	//setter
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCopyrightYear(int copyrightYear)
	{
		if(copyrightYear > 0) {
			this.copyrightYear = copyrightYear;
		}
	}
	@Override
	public String toString() 
	{
		return title + " by " + author + " (" + copyrightYear + ")";
	}
	public boolean equal(Object obj)
	{//start
		 if(obj instanceof Book){//start if
			 Book otherBook = (Book) obj;
			 boolean sameTitle,sameAuthor,sameYear;
			 if(title.equalsIgnoreCase(otherBook.title)){//start if for title
				 sameTitle=true;
			 }else{//start else for title
				 return false;
			 }
			 if(author.equalsIgnoreCase(otherBook.author)){//start if for author
				 sameAuthor=true;
			 }else{//start else for author
				 return false;
			 }
			 if(copyrightYear==otherBook.copyrightYear){//start if for year
				 sameYear=true;
			 }else{//start else for year
				 sameYear=false;
			 }
			 return sameTitle && sameAuthor && sameYear;
		}//end if

		else
		{
			return false;
		}
	}//end 
}//end class