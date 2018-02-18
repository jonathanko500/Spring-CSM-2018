import java.util.ArrayList;

//M4Test
public class Customer 
{
	private String name;
	private ArrayList<Invoice> invoiceList;
	
	public static void main(String[] args)
	{//start main
		// TODO Auto-generated method stub
		
	}//end main
	public Customer(String name) 
	{//start constructor
		this.name = name;
		invoiceList = new ArrayList<Invoice>();
	}//end constructor
	public Customer(String name, ArrayList<Invoice> arr)
	{
		this.name=name;
		invoiceList = new ArrayList<Invoice>();
	}
	//setter
	public void setName(String newName)
	{
		name=newName;
	}
	public void setInvoice(ArrayList<Invoice> arr)
	{
		invoiceList=arr;
	}
	//getter
	public String getName()
	{
		return name;
	}
	public ArrayList getInvoice()
	{
		return invoiceList;
	}
	public String toString()
	{
		String x = null;
		for(int i=0;i<invoiceList.size();i++)
		{
			x=name+" "+invoiceList.get(i);
			System.out.println(x);
		}
		return x;
	}
	public void addInvoice(Invoice amount)
	{
		invoiceList.add(amount);
	}
	int custNumb=0;
	public Customer()
	{
		custNumb++;
	}
	public int getcustNumb()
	{
		return custNumb;
	}
	enum Status {PAID, DUE, PAST_DUE};
}
