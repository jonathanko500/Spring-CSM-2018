import java.util.Random;
import java.util.Scanner;
//Jonathan Ko and Kennedy Louie
//project 2
public class Registration
{//start class
	public static void main(String[] args)
	{//start main
		//declare variables/scanner
		Scanner input = new Scanner(System.in);
		String options;
		//make class
		Course class1= new Course();
		student child = new student();
		makeClass(class1);
		System.out.println("");
		System.out.print("Would you like to add (\"a\"), drop (\"d\"), or view class info (\"v\"): ");
		options=input.nextLine().toLowerCase();
		//options
		switch(options)
		{//start switch
		case "a":
			child=makeKid();
			addKid(class1,child);
			break;
		case "d":
			break;
		case "v":
			System.out.println(class1.toString());
			break;
		default:
		}//end switch
		
	}//end main
	public static void makeClass(Course classroom)
	{
		Scanner input = new Scanner(System.in);
		String className;
		int max;
		System.out.print("Enter class name: ");
		className=input.nextLine();
		System.out.print("Enter max number of students to have in class: ");
		max=Integer.parseInt(input.nextLine());
		classroom.setClassName(className);
		classroom.setMax(max);
	}
	public static student makeKid()
	{
		//variables
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		student kid = new student();
		int x,y;
		x=rand.nextInt(999);
		y=rand.nextInt(9999);
		String begin,end,ID,choice;
		boolean tuition;
		//set variables
		System.out.print("What is the student's first name: ");
		begin=input.nextLine();
		System.out.print("What is the student's last name: ");
		end=input.nextLine();
		ID=x+"-"+y;
		System.out.print("Was the tuition paid? (yes or no): ");
		choice=input.nextLine();
		kid.setFirst(begin);
		kid.setLast(end);
		kid.setID(ID);
		kid.setTuition(choice);
		System.out.println(kid.toString());
		System.out.println("");
		return kid;
	}
	public static void addKid(Course room, student kid)
	{
		
		if(kid.getTuition()==true)
		{
			room.addStudent(kid);
			String[] list = room.getRoster();
			for(int i=0;i<list.length;i++)
			{
				if(list[i]==null)
				{
					System.out.println(list[i]);
				}
			}
		}
		else
		{
			System.out.println("This student will not be added until tuition is paid.");
		}
	}
}//end class
