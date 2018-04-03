
public class P4B 
{

	public static void main(String[] args)
	{
		Animal[] animals = new Animal[5];
		animals[0] = new Cat("Mr. Meowerson");
		animals[1] = new HumpbackWhale("Blubber");
		animals[2] = new Bat("Dracky", 15);
		animals[3] = new Goldfish("Nemo");
		animals[4] = new Frog("Prince");
		for(int i=0;i<animals.length;i++)
		{
			System.out.println(animals[i].toString());
			System.out.println("--------------");
		}
	}

}
