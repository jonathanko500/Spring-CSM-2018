import java.util.Scanner;
//project 3
//class for project 3 
public class SaveAcct extends BankAcct
{//start class
	private double rate;
	//constructors
	public SaveAcct()
	{
		super();
		rate=0.0;
	}
	public SaveAcct(String aName,String numb,double money,double per)
	{
		super(aName,numb,money);
		Scanner input = new Scanner(System.in);
		while(per<=0)
		{
			System.out.print("Enter amount greater than 0: ");
			per=Double.parseDouble(input.nextLine());
		}
		rate=per;
		this.rate=per;
	}
	//setter
	public void setRate(double per)
	{
		Scanner input = new Scanner(System.in);
		while(per<=0)
		{
			System.out.print("Enter amount greater than 0: ");
			per=Double.parseDouble(input.nextLine());
		}
		rate=per;
	}
	//getter
	public double getRate()
	{
		return rate;
	}
	@Override
	public String toString()
	{
		String x="";
		x+=super.toString()+" the intrest rate is "+rate+"%";
		return x;
	}
}//end class
