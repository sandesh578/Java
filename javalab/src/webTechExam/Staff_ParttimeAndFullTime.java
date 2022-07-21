package webTechExam;
import java.util.Scanner;
abstract class Staff{
	String name;
	String Address;
	public Staff()
	{
		name="Sandesh Parajuli";
		Address="Kathmandu";
	}
	abstract void display();
}
class RegularStaff extends Staff{
	String department;
	double salary;
	RegularStaff(String department,double salary)
	{
		this.department=department;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Details of Regular Staff:");
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+Address);
		System.out.println("Department is:"+department);
		System.out.println("Salary is:"+salary);
	}
}
class PartTimeStaff extends Staff{
	int numOfHours;
	double ratePerHour;
	public PartTimeStaff(int numOfHours,double ratePerHour)
	{
		this.numOfHours=numOfHours;
		this.ratePerHour=ratePerHour;
	}
	public void display()
	{
		System.out.println("Details of PartTime Staff:");
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+Address);
		System.out.println("Working hours per day is:"+numOfHours);
		System.out.println("Rate per hour is:"+ratePerHour);
		System.out.println("Salary is:"+ratePerHour*numOfHours*30);
	}
}
public class Staff_ParttimeAndFullTime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Regular Staff");
		System.out.println("2.PartTime Staff");
		System.out.println("Enter a option:");
        int op=sc.nextInt();
        switch(op)
        {
        case 1:
        	RegularStaff r=new RegularStaff("Meterology",1000000);
        	r.display();
        	break;
        case 2:
        	PartTimeStaff s=new PartTimeStaff(5,10000);
        	s.display();
        	break;
        	default:
        		System.out.println("Invalid ");
        }
        sc.close();
	}

}
