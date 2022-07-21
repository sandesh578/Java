package comparator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;
@SuppressWarnings("serial")
class Account implements Serializable
{
	String AccName;
	String AccNo;
	double Balance;
	public Account() {}
	public Account(String a,String n,double b)
	{
		this.AccName=a;
		this.AccNo=n;
		this.Balance=b;
	}
	public String toString()
	{
		return "Account No:"+AccNo+"\nAccount Name:"+AccName+"\nBalance:"+Balance;
	}
}
public class AccountChallenge {

	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		
		String name,accno;
		double balance;
		Account acc=null;
		HashMap<String,Account> hm=new HashMap<>();
		
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Documents\\Data.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			int count=ois.readInt();
			for(int i=0;i<count;i++)
			{
				acc=(Account)ois.readObject();
				System.out.println(acc);
				hm.put(acc.AccNo,acc);
			}
			fis.close();
			ois.close();
		}
		catch(Exception e)
		{
			
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\KIIT\\Documents\\Data.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		int op;
		do {
			
			System.out.println("1.Create Account");
			System.out.println("2.Delete Account");
			System.out.println("3.View Account");
			System.out.println("4.View all Account");
			System.out.println("5.Save Accounts");
			System.out.println("6.Exit");
			System.out.println("Enter the option:");
			op=scan.nextInt();
			scan.skip("\n\r");
		switch(op)
		{
		 case 1:
			 System.out.println("Enter Account Details Account Name ,Number ,Balance:");
			 name=scan.nextLine();
			 accno=scan.nextLine();
			 balance=scan.nextDouble();
			 acc=new Account(name,accno,balance);
			 hm.put(accno,acc);
			 break;
		 case 2:
			 System.out.println("Enter Account NO:");
			 accno=scan.nextLine();
			 hm.remove(accno);
			 break;
		 case 3:
			 System.out.println("Enter Account NO:");
			 accno=scan.nextLine();
			 acc=hm.get(accno);
			 System.out.println(acc);
			 break;
		 case 4:
			 for(Account ac:hm.values())
			 {
				 System.out.println(ac);
			 }
			 break;
		 case 5:
		 case 6:
			 oos.writeInt(hm.size());
			 for(Account a:hm.values())
			 {
				 oos.writeObject(a);
			 }
			 break;
			 
		}
	  }while(op!=6);
	  oos.flush();
	  oos.close();
	  fos.close();
	  scan.close();

	}

}
