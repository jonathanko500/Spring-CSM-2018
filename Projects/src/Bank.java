//project 3
//code by Jonathan Ko and Kennedy Louie
public class Bank 
{//start class
	public static void main(String[] args)
	{//start main
		//examples that BankAcct works
		BankAcct acct1 = new BankAcct();
		System.out.println(acct1.toString());
		acct1.setName("Jonathan Ko");
		acct1.setID("9010");
		acct1.setAmt(127234.42);
		System.out.println(acct1.toString());
		System.out.println("");
		acct1.deposit(-85);
		System.out.println("");
		acct1.withdrawl(-342);
		System.out.println("");
		System.out.println(acct1.toString());
		System.out.println("");
		BankAcct acct2 = new BankAcct("Thomas Ko","0511",-41);
		System.out.println("");
		System.out.println(acct2.toString());
		System.out.println("");
		//examples that SaveAcct works
		SaveAcct acct3 = new SaveAcct();
		acct3.setName("Jonathan Ko");
		acct3.setID("6639");
		acct3.setAmt(395482.12);
		acct3.setRate(0.96);
		System.out.println(acct3.toString());
		System.out.println("");
		acct3.deposit(-500);
		System.out.println("");
		acct3.withdrawl(-999);
		System.out.println("");
		SaveAcct acct4 = new SaveAcct("Thonas Ko", "4698", -748314.38, -2.01);
		System.out.println(acct4.toString());
	}//end main
}//end class
