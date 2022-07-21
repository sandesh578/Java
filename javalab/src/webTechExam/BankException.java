package webTechExam;
import java.util.Scanner;
class Banking {
	long Account_number;
	String Account_Holder_name;
	double balance_In_Account;
	long withdraw;
	long minBalance=1000;
	Scanner sc=new Scanner(System.in);
	public void  readData()
	{
		System.out.println("Enter the Account Holder Name:");
		Account_Holder_name=sc.nextLine();
		System.out.println("Enter the Account Number:");
		Account_number=sc.nextLong();
		System.out.println("Enter the balance in account:");
		balance_In_Account=sc.nextDouble();
	}
	public void withdraw() {
		System.out.println("Enter the balance to withdraw:");
		withdraw=sc.nextLong();
	    balance_In_Account-=withdraw;
	    if(balance_In_Account>=minBalance)
	    {
	    	System.out.println("You withdrew "+withdraw+" from your account");
	    	System.out.println("Balance in your account after withdrawl is:"+balance_In_Account);
	    }
	    else
	    {
	    	System.out.println("You cant withdraw ,Balance is less than 1000");
	    }
	    
	}
	public void display() {
		System.out.println("Customer details:");
		System.out.println("Account Holder Name:"+Account_Holder_name);
		System.out.println("Account Number:"+Account_number);
	}
}
public class BankException {

	public static void main(String[] args) {
		Banking b=new Banking();
		b.readData();
		b.withdraw();
		b.display();
	}

}
