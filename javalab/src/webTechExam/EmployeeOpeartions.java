package webTechExam;
import java.util.Scanner;
abstract class Employee{
	String name;
	String Address;
	public Employee()
	{
		name="Sandesh Parajuli";
		Address="Kathmandu";
	}
	abstract void display();
}
class RegularEmployee extends Employee{
	String department;
	double salary;
	RegularEmployee(String department,double salary)
	{
		this.department=department;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Details of Regular Employee:");
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+Address);
		System.out.println("Department is:"+department);
		System.out.println("Salary is:"+salary);
	}
}
class CasualEmployee extends Employee{
	int numOfHours;
	double ratePerHour;
	public CasualEmployee(int numOfHours,double ratePerHour)
	{
		this.numOfHours=numOfHours;
		this.ratePerHour=ratePerHour;
	}
	public void display()
	{
		System.out.println("Details of Casual Employee:");
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+Address);
		System.out.println("Working hours per day is:"+numOfHours);
		System.out.println("Rate per hour is:"+ratePerHour);
		System.out.println("Salary is:"+ratePerHour*numOfHours*30);
	}
}
public class EmployeeOpeartions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Regular Employee");
		System.out.println("2.Casual Employee");
		System.out.println("Enter a option:");
        int op=sc.nextInt();
        switch(op)
        {
        case 1:
        	RegularEmployee r=new RegularEmployee("Meterology",1000000);
        	r.display();
        	break;
        case 2:
        	CasualEmployee s=new CasualEmployee(5,10000);
        	s.display();
        	break;
        	default:
        		System.out.println("Invalid ");
        }
        sc.close();
	}

}
