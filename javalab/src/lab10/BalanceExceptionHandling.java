package lab10;
import java.util.Scanner;
@SuppressWarnings("serial")
class LessBalanceException extends Exception{
	@Override
	public String toString()
	{
		return "Balance is insufficient to withdraw.\nSorry for Inconvinience";
	}
}
class Account{
	double minBalance=500;
	double balance;
	double withdraw,deposit;
	public Account(double balance,double deposit,double withdraw)
	{
		this.balance=balance;
		this.withdraw=withdraw;
		this.deposit=deposit;
	}
	public void deposit()
	{
		balance=balance+deposit;
		System.out.println("Amount deposited Successfully.");
	}
	public void check() throws LessBalanceException
	{
		
		balance=balance-withdraw;
		if(balance<minBalance)
		{
			throw new LessBalanceException();
		}
		else
		{
			System.out.println("Balance withdrawn Successfully.");
			System.out.println("Remaining Balance is:"+balance);
		}
	}
}
public class BalanceExceptionHandling {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total Balance:");
		double balance=scan.nextDouble();
		System.out.println("Enter the amount to deposit:");
		double deposit=scan.nextDouble();
		System.out.println("Enter the amount to withdraw:");
		double withdraw=scan.nextDouble();
		try
		{
			Account a=new Account(balance,deposit,withdraw);
			a.deposit();
			a.check();
		}
        catch(LessBalanceException e)
		{
        	System.out.println(e);
		}
		scan.close();
	}

}
