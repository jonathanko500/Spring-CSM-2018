import java.util.Scanner;
//object for Registration
//project 2
public class Course 
{//start class
	private String className;
	private int max;
	private student[] roster = new student[0];
	//constructors
	public Course()
	{
		className="";
		max=0;
		student[] roster = new student[max];
	}
	public Course(String name,int numb)
	{
		className=name;
		max=numb;
		student[] roster = new student[max];
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
	public void setRoster(int num)
	{
		student[] roster = new student[num];
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
	public student[] getRoster()
	{
		return roster;
	}
	//toString
	public String toString()
	{
		String x;
		int y=0;
		for(int i=0;i<roster.length;i++)
		{
			if(roster[i]!=null)
			{//numb of enrolled students
				y++;
			}
		}
		x="Class is called "+className+", there are "+y+" students enrolled, "+max+" is the max number of students this class will take "+"\n";
		x+="The enrolled students are named:\n";
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
		boolean add = false;
		if(kid.getTuition()==true)
		{//check if tuition is true
			for(int i=0;i<roster.length;i++)
			{//look through roster
				if(roster[i]==null)
				{// (roster = null) = space for kid
					roster[i].equals(kid);
					i=roster.length;
					add=true;
				}
				
			}
		}
		else
		{
			System.out.println("Student can not be addded.");
		}
		return add;
	}
	public boolean dropStudent(student kid)
	{
		boolean drop=true;
		for(int i=0;i<roster.length;i++)
		{//start loop
			if(roster[i].equals(kid))
			{//check for name in roster
				roster[i]=null;
			}
			else
			{
				System.out.println("This student is not in the roster.");
				drop=false;
			}
		}
		return drop;
	}
	
}//end class
