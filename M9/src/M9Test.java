import java.io.*;
import java.util.*;
public class M9Test 
{//start main
	public static void main(String[] args)
	{//start main
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String name;
		boolean again = true;
		System.out.print("Enter username: ");
		name=input.nextLine();
		while(again==true)
		{
			checkUserName(name,list);
			System.out.print("Enter username: ");
			name=input.nextLine();
			if(name.equalsIgnoreCase("no"))
			{
				again=false;
			}
		}
	}//end main
	public static void checkUserName(String userName, ArrayList<String> existingNames)
	{//start class
		if(existingNames.contains(userName))
		{
			System.out.print("Name exists already.");
		}
		else
		{
			existingNames.add(userName);
		}
	}//end class
}//end class
