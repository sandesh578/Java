package lab7;
import java.util.Scanner;
class Account{
    long acc_no;
	double balance;
	public Account(long acc_no,double balance)
	{
		this.acc_no=acc_no;
		this.balance=balance;
	}
	public void display()
	{
		System.out.println("Account no is:"+acc_no);
		System.out.println("Balance is:"+balance);
	}
}
class Person extends Account{
	String name;
	long aadhar_no;
	public Person(long acc_no,double balance,String name,long aadhar_no)
	{
		super(acc_no,balance);
		this.name=name;
		this.aadhar_no=aadhar_no;
		
	}
	public void display()
	{
		System.out.println("Name is:"+name);
		System.out.println("Account no is:"+acc_no);
		System.out.println("Balance is:"+balance);
		System.out.println("Aadhar no is:"+aadhar_no);
	}
}
public class ques5 {
   public static void main(String[] args)
   {
	   Scanner scan=new Scanner(System.in);
	   String name;
	   long aadhar_no;
	   long acc_no;
	   double balance;
	   Person p[]=new Person[5];
	   for(int i=1;i<=2;i++) {
		   System.out.println("Enter name,accno,aadharno,balance of person "+i+":");
		   name=scan.nextLine();
		   acc_no=scan.nextLong();
		   aadhar_no=scan.nextLong();
		   balance=scan.nextDouble();
		   p[i]=new Person(acc_no,balance,name,aadhar_no);
	   }
	   for(int i=1;i<=2;i++)
	   {
		   System.out.println("Detail of person "+i+":");
		   p[i].display();
	   }
	   scan.close();
   }
}
