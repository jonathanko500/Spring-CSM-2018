import java.util.Scanner;
//project 3
//class for Bank
public class BankAcct
{//start class
	private String name,ID;
	double amt;
	//constructors
	public BankAcct()
	{
		this.name="N/A";
		this.ID="N/A";	
		this.amt=0.0;
	}
	public BankAcct(String aName,String numb,double money)
	{
		this.name=aName;
		this.ID=numb;
		Scanner input = new Scanner(System.in);
		while(money<=0)
		{
			System.out.print("Enter amount greater than 0: ");
			money=Double.parseDouble(input.nextLine());
		}
		this.amt=money;
	}
	//setter
	public void setName(String aName)
	{
		name=aName;
	}
	public void setID(String numb)
	{
		ID=numb;
	}
	public void setAmt(double money)
	{
		Scanner input = new Scanner(System.in);
		while(money<=0)
		{
			System.out.print("Enter amount greater than 0: ");
			money=Double.parseDouble(input.nextLine());
		}
		amt=money;
	}
	//getter
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return ID;
	}
	public double getAmt()
	{
		return amt;
	}
	@Override
	public String toString()
	{
		String x="";
		x="The owner of this account is "+name+", ID is "+ID+", there is $"+amt;
		return x;
	}
	//methods
	public void deposit(double money)
	{
		Scanner input = new Scanner(System.in);
		while(money<=0)
		{
			System.out.print("Enter amount greater than 0: ");
			money=Double.parseDouble(input.nextLine());
		}
		amt+=money;
		System.out.println("Money has deposited. There is now $"+amt);
	}
	public void withdrawl(double money)
	{
		Scanner input = new Scanner(System.in);
		while(money<=0)
		{
			System.out.print("Enter amount greater than 0: ");
			money=Double.parseDouble(input.nextLine());
		}
		amt-=money;
		if(amt<0)
		{
			while(amt<0)
			{
			amt+=money;
			System.out.print("Too much money has been withdrawn. Re-enter amount to withdraw: ");
			money=Double.parseDouble(input.nextLine());
			amt-=money;
			}
		}
		System.out.println("Money has been withdrawn. There is now $"+amt);
		
	}
}//end class
