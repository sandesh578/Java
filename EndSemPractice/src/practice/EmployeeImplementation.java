package practice;

import java.util.Scanner;
class Employee{
	String name;
	String deptName;
	double basicSalary;
	int UID;
	public void getDetails(String name,String deptName,double basicSalary,int UID)
	{
		this.name=name;
		this.deptName=deptName;
		this.basicSalary=basicSalary;
		this.UID=UID;
	}
	public void displayDetails()
	{
		double earnings=basicSalary+(125*basicSalary)/100+(15*basicSalary)/100;
		double deduct=(12*basicSalary)/100;
		double netSalary=earnings-deduct;
		
		System.out.println("Employee Name is:"+name);
		System.out.println("Employee department is:"+deptName);
		System.out.println("Earnings is: "+earnings);
		System.out.println("Deduction is: "+deduct);
		System.out.println("Net Salary is: "+netSalary);
	}
}
public class EmployeeImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter employeee Name:");
		String name=scan.nextLine();
		System.out.println("Enter employeee department:");
		String deptName=scan.nextLine();
		System.out.println("Enter employeee basic Salary:");
		double basic=scan.nextDouble();
		System.out.println("Enter employeee ID:");
		int id=scan.nextInt();
		
		Employee emp=new Employee();
		emp.getDetails(name,deptName,basic,id);
		emp.displayDetails();
		scan.close();

	}

}
