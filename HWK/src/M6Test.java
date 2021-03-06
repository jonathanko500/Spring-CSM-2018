import java.util.Scanner;

public class M6Test {

	public static void main(String[] args)
	{//start class
		int count=0;
		//make array
		Person[] list = new Person[5];
		//fill array
		list[0]=new Person("Andy");
		list[1]=new Instructor("Max","Chemistry");
		list[2]=new Person("Thomas");
		list[3]=new Instructor("Kennedy","Math");
		list[4]=new Instructor("Andy","Math");
		//print array
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i].toString());
			System.out.println("");
		}
		//count for math
		for(int i=0;i<list.length;i++)
		{//start loop
			Person people =list[i];
			if(people instanceof Instructor)
			{//see if object is an instructor
				//downcast
				Instructor teach = (Instructor) people;
				if(teach.getSubject().equalsIgnoreCase("math"))
				{
					count++;
				}
			}
		}//end loop
		System.out.println("There are "+count+" math teachers.");
	}//end class
}
