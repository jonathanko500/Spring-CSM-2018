import java.util.Random;

public class MIdterm
{//start class
	public static void main(String[] args)
	{
		School[] prison = new School[5];
		prison[0] =new School("Meadows",5);
		prison[1] =new HighSchool("Mills",500,true);
		prison[2] =new HighSchool("Burlingame",2,false);
		prison[3] =new School("CSM",9000);
		prison[4] =new HighSchool("Aargon",5,true);
		int x=0;
		for(int i=0;i<prison.length;i++)
		{//start loop
			System.out.println(prison[i].toString());
			System.out.println("-----------");
			//check for special high school
			School jail=prison[i];
			if(jail instanceof HighSchool)
			{//check for HighSchool
				HighSchool finals = (HighSchool) jail;
				if(finals.getSpecial()==true)
				{
					x++;
				}
			}
		}//end loop
		System.out.println("There are "+x+" special highschools.");
	}
	public static boolean isPositiveAndMultipleThree(int x)
	{//start method
		if(x>0)
		{//start
			if(x%3==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}//end
		else
		{
			return false;
		}
	}//end method
	public static boolean isPositiveAndMultipleThree(int x,int y)
	{//start method
		if(x>0 && y>0)
		{//start
			if(x%3==0 && y%3==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}//end
		else
		{//start 
			return false;
		}//end
	}//end method
	public static int countWordsThatContainChar(String[] list,char x)
	{//start 
		int y=0;
		for(int i=0;i<list.length;i++)
		{//start loop
			for(int j=0;j<list[i].length();j++)
			{//start loop
				if(list[i].charAt(j)==x)
				{
					y++;
				}
			}//end loop
		}//end loop
		return y;
	}//end .
	
}//end class