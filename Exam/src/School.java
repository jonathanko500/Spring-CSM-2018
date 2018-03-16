import java.util.Scanner;
//class midterm
public class School
{//start class
	private String name;
	private int numbStud;
	//constructors
	public School(String aName)
	{
		this.name=aName;
		this.numbStud=0;
	}
	public School(String aName,int numb)
	{
		this.name=aName;
		this.numbStud=numb;
	}
	//setter
	public void setName(String aName)
	{
		this.name=aName;
	}
	public void setNumbStud(int numb)
	{
		Scanner input= new Scanner(System.in);
		while(numb<0)
		{
			System.out.print("Enter value greater than 0: ");
			numb=Integer.parseInt(input.nextLine());
		}
		this.numbStud=numb;
	}
	//gettter
	public String getName()
	{
		return name;
	}
	public int getNumbStud()
	{
		return numbStud;
	}
	@Override
	public String toString()
	{
		String x;
		x="Name: "+name;
		x+="\nNumber of students: "+numbStud;
		return x;
	}
}//end class