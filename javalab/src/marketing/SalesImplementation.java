package marketing;
import java.util.Scanner;

import general.Employee;
class Sales extends Employee {
	double allowence;
	double totalEarnings;
    String ename;
   public Sales(String ename,int empid,double basic,int da,int hra)
   {
	   super(ename,empid,basic,da,hra);
	   this.totalEarnings=super.earnings();
	   this.ename=super.getName();
   }
   public void tAllowence()
   {
	   allowence=(8*totalEarnings)/100;
   }
   public void display()
   {
	   System.out.println("Name is:"+ename);
	   System.out.println("Employee id is:"+empid);
	   System.out.println("Total Earning is:"+totalEarnings);
	   System.out.println("Travelling allowence is:"+allowence);
   }
}
public class SalesImplementation{
	public static void main(String[] args)
	   {
		   Scanner  scan=new Scanner(System.in);
		   System.out.println("Enter a name:");
		   String name=scan.nextLine();
		   System.out.println("Enter emp id:");
		   int id=scan.nextInt();
		   System.out.println("Enter basic Salary:");
		   double basic=scan.nextDouble();
		   System.out.println("Enter HRA:");
		   int hra=scan.nextInt();
		   System.out.println("Enter DA:");
		   int da=scan.nextInt();
		   Sales s=new Sales(name,id,basic,da,hra);
		   s.earnings();
		   s.tAllowence();
		   s.display();
		   scan.close();
	   }
}
