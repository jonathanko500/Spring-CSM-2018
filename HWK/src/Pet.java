//M7Test
public abstract class Pet implements Comparable <Pet>
{//start class
	private String name;
	private int age;
	//constructors
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
	//getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		String s = "Name: " + name ;
		s += "\nAge: " + age;
		return s;
	}
	public abstract void printVetAppointmentReminder();
	@Override
	public int compareTo(Pet newPet)
	{//start override
		if(name.equalsIgnoreCase(newPet.name))
		{
			if(age<newPet.age)
			{
				return -1;
			}
			else if(age>newPet.age)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return name.compareToIgnoreCase(newPet.name);
		}
	}//end override
}//end class