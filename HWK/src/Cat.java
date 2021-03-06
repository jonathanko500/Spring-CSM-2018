//M7 test
public class Cat extends Pet{
	private String color;
	public Cat(String name,int age,String color){
		super(name,age);
		this.color=color;
	}
	//setter
	public void setColor(String color)
	{
		this.color=color;
	}
	//getter
	public String getColor()
	{
		return color;
	}
	@Override
	public String toString()
	{
		String x=super.toString();
		x+="\nColor: " + color;
		x+="\nAnimal is a cat.";
		return x;
	}	
	@Override
	public boolean equals(Object obj)
	{//start equals
		if(obj instanceof Cat)
		{//check if obj is Cat obj
			Cat meow=(Cat) obj;
			boolean sameName,sameColor,sameAge;
			//compare 
			if(getName().equalsIgnoreCase(meow.getName()))
			{//compare name
				sameName=true;
			}
			else
			{
				sameName=false;
			}
			if(color.equalsIgnoreCase(getColor()))
			{//compare color
				sameColor=true;
			}
			else
			{
				sameColor=false;
			}
			if(getAge()==meow.getAge())
			{
				sameAge=true;
			}
			else
			{
				sameAge=false;
			}
			return sameName&&sameAge&&sameColor;
		}
		else
		{//check if obj is Cat obj
			return false;
		}
	}//end equals
	@Override
	public void printVetAppointmentReminder() {
		System.out.println("You have an appointment with a vet today.");
		
	}
}
