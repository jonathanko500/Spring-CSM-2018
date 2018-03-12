import java.util.Collections;

public class M7Test
{//start class
	public static void main(String[] args)
	{//start main
		//#1
		Pet[] list = new Pet[5];
		//#2
		list[0]= new Cat("Kennedy",8,"Black");
		list[1]= new Bird("Momo",2,true);
		list[2]= new Bird("Jake",1,false);
		list[3]= new Cat("Tom",5,"Gray");
		list[4]= new Cat("Mimi",12,"Yellow");
		//#3
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i].toString());
			System.out.println("----------");
		}
		//#4
		int count=0;
		for(int i=0;i<list.length;i++)
		{//start loop
			Pet animal=list[i];
			if(animal instanceof Bird)
			{//check if obj is Bird
				//downcast
				Bird fly = (Bird) animal;
				if(fly.getSing()==true)
				{//check to see if bird can sing
					count++;
				}
			}
		}//end loop
		System.out.println("There are "+count+" birds that can sing.");
		//#5
		//Collections.sort(list);
	}//end  main
}//end class
