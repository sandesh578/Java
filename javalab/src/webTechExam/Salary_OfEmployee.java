package webTechExam;
import java.util.Scanner;
class Employees{
	String name;
	String deptName;
	double basicSal;
	int uid;
	int DA=125;
	int HRA=15;
	Scanner scan=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter Employee Name:");
		name=scan.nextLine();
		System.out.println("Enter Employee department:");
		deptName=scan.nextLine();
		System.out.println("Enter basic Salary:");
		basicSal=scan.nextDouble();
		System.out.println("Enter the employee id:");
		uid=scan.nextInt();
	}
	public void displayDetails()
	{
		double earnings=basicSal+((DA*basicSal)/100)+((HRA*basicSal)/100);
		double deduct=((12*basicSal)/100);
		double netSal=earnings-deduct;
		
		System.out.println("Name:"+name);
		System.out.println("Department:"+deptName);
		System.out.println("Basic Salary:"+basicSal);
		System.out.println("Employee id:"+uid);
		System.out.println("Earnings:"+earnings);
		System.out.println("Deductions:"+deduct);
		System.out.println("Net Salary:"+netSal);
	}
}
public class Salary_OfEmployee {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of employees:");
		int n=scan.nextInt();
		Employees emp=new Employees();
		for(int i=1;i<=n;i++)
		{
			System.out.println("\nEnter the details of Employee "+i);
			emp.getDetails();	
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println("\nDetails of Employee "+i+" is:");
			emp.displayDetails();
		}
        scan.close();
	}

}
