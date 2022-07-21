package webTechExam;
import java.util.Scanner;
interface BankDetails{
	public void  readData();
	public void deposit();
	public void withdraw();
	public void display();
}
class Banks implements BankDetails{
	long Account_number;
	String Account_Holder_name;
	double balance_In_Account;
	long deposit;
	long withdraw;
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
	public void deposit()
	{
		System.out.println("Enter the balance to deposit:");
		deposit=sc.nextLong();
	    System.out.println("You deposited "+deposit+" into your account");
	    balance_In_Account+=deposit;
	    System.out.println("Balance in your account after deposit is:"+balance_In_Account);
	}
	public void withdraw() {
		System.out.println("Enter the balance to withdraw:");
		withdraw=sc.nextLong();
		System.out.println("You withdrew "+withdraw+" from your account");
	    balance_In_Account-=withdraw;
	    System.out.println("Balance in your account after withdrawl is:"+balance_In_Account);
	}
	public void display() {
		System.out.println("Customer details:");
		System.out.println("Account Holder Name:"+Account_Holder_name);
		System.out.println("Account Number:"+Account_number);
		System.out.println("Final Balance is:"+balance_In_Account);
	}
}
public class Bank {

	public static void main(String[] args) {
		Banks b=new Banks();
		b.readData();
		b.deposit();
		b.withdraw();
		b.display();

	}

}
