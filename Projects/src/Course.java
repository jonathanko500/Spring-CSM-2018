import java.util.Scanner;

//object for Registration
//project 2
public class Course 
{//start class
	private String className;
	private int max;
	private String[] roster = new String[max];
	//constructors
	public Course()
	{
		className="";
		max=0;
	}
	public Course(String name,int numb)
	{
		className=name;
		max=numb;
	}
	//setter
	public void setClassName(String name)
	{
		className=name;
	}
	public void setMax(int numb)
	{
		//check for valid data
		Scanner input = new Scanner(System.in);
		if(numb>0)
		{
			max=numb;
		}
		else
		{
			while(numb<=0)
			{
				System.out.print("Enter valid number: ");
				numb=Integer.parseInt(input.nextLine());
			}
			max=numb;
		}
		
	}
	//getter
	public String getClassName()
	{
		return className;
	}
	public int getMax()
	{
		return max;
	}
	public int getRosterNumb()
	{
		return roster.length;
	}
	//toString
	public String toString()
	{
		String x;
		int y=0;//counter for enrolled students
		for(int i=0;i<roster.length;i++)
		{//numb of enrolled students
			if(roster[i]!=null)
			{
				y++;
			}
		}
		x=className+" "+y+" "+max+" "+"\n";
		for(int i=0;i<roster.length;i++)
		{//prints enrolled students
			if(roster[i]!=null)
			{
				x+=roster[i]+"\n";
			}
		}
		return x;
	}
	//other methods
	public boolean addStudent(student kid)
	{
		int x=0;
		boolean add = true;
		for(int i=0;i<roster.length;i++)
		{//start loop
			if(kid.getTuition()==true)
			{//student paid or not
				if(roster[i]==null)
				{//check for room
					//add name to roster
					roster[x]=kid.getFirst()+" "+kid.getLast();
					add=true;
				}
				else
				{
					add=false;
				}
			}
			x++;
		}//end loop
		return add;
	}
	public boolean dropStudent(student kid)
	{
		boolean drop=true;
		for(int i=0;i<roster.length;i++)
		{//start loop
			if(roster[i]==kid.getFirst()+" "+kid.getLast())
			{//check for name in roster
				roster[i]=null;
			}
			else
			{
				drop=false;
			}
		}
		return drop;
	}
}//end class
