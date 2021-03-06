//M7Test
public class Bird extends Pet
{//start class
	private boolean sing;
	//constructor
	public Bird(String name, int age, boolean sing) {
		super(name, age);
		this.sing=sing;
	}
	//setter
	public void setSing(boolean sing)
	{
		this.sing=sing;
	}
	//getter
	public boolean getSing()
	{
		return sing;
	}
	@Override
	public void printVetAppointmentReminder() {
		System.out.println("You have an appointment with a vet today.");
	}
	@Override
	public String toString()
	{
		String x=super.toString();
		if(sing==true)
		{
			x+="\n"+getName()+" can sing.";
		}
		else
		{
			x+="\n"+getName()+" can't sing.";
		}
		x+="\nAnimal is a bird.";
		return x;
	}
}//end classs