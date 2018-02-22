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
		boolean pass;
		int again=0;
		//make class
		Course class1= new Course();
		student child = new student();
		makeClass(class1);
		System.out.println("");
		System.out.print("Would you like to add (\"a\"), drop (\"d\"), or view class info (\"v\") or stop (\"s\"): ");
		options=input.nextLine().toLowerCase();
		System.out.println("");
		//options
		do
		{//start loop
			switch(options)
			{//start switch
			case "a":
				//add student
				child=makeKid();
				pass=class1.addStudent(child);
				add(pass,child,class1);
				System.out.println(class1.toString());
				break;
			case "d":
				//drop student
				break;
			case "v":
				//view class info
				System.out.println(class1.toString());
				break;
			case "s":
				//stop loop
				again++;
				break;
			default:
				//check for invalid data
				System.out.println("Invalid data.");
				System.out.println("");
				break;
			}//end switch
			if(again==0)
			{
				System.out.print("Would you like to add (\"a\"), drop (\"d\"), view class info (\"v\") or stop (\"s\"): ");
				options=input.nextLine().toLowerCase();
				System.out.println("");
			}
		}while(again==0);//end loop
		System.out.println("Code made by Jonathan Ko and Kennedy Louie");
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
		student kid1 = new student (begin,end,ID,choice);
		System.out.println(kid1.toString());
		System.out.println("");
		return kid1;
	}
	public static void add (boolean able,student kid,Course room)//count numb of enrolled students
	{
		student[] classRoom = new student[room.getMax()];
		classRoom=room.getRoster();
		int x=0;
		for(int i=0;i<classRoom.length;i++)
		{//count numb of enrooled student
			if(classRoom[i]==null)
			{
				x++;
			}
		}
		room.setNumbStud(x);
		System.out.println(room.getNumbStud());
	}
}//end class
