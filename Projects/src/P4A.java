
public class P4A 
{//start class
	public static void main(String[] args)
	{//start main
		Payment pay = new Payment(53.41,"1/31/1954");
		System.out.println(pay.toString());
		pay.setAmount(53.2);
		pay.setDate("March 30, 2018");
		System.out.println(pay.toString());
		CashPayment pay2 = new CashPayment(99.99,"9/25/2034");
		System.out.println(pay2.toString());
		System.out.println(pay2.getAmount());
		System.out.println(pay2.getDate());
		CreditPayment pay3 = new CreditPayment(453.71,"9/18/1993","Thomas Ko","1534741543854597");
		System.out.println(pay3.toString());
		CreditPayment pay4 = new CreditPayment(453.71,"9/18/1993","Thomas Ko","1534741543854597");
		System.out.println(pay4.equals(pay3));
	}//end main
}//end class
