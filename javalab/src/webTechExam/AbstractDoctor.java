package webTechExam;
import java.util.Scanner;
abstract class Doctor{
	String name;
	String Address;
	public Doctor()
	{
		name="Sandesh Parajuli";
		Address="Kathmandu";
	}
	abstract void display();
}
class residentDoctor extends Doctor{
	String department;
	double salary;
	residentDoctor(String department,double salary)
	{
		this.department=department;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Details of Resident doctor:");
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+Address);
		System.out.println("Department is:"+department);
		System.out.println("Salary is:"+salary);
	}
}
class specialistDoctor extends Doctor{
	int numOfHours;
	double ratePerHour;
	public specialistDoctor(int numOfHours,double ratePerHour)
	{
		this.numOfHours=numOfHours;
		this.ratePerHour=ratePerHour;
	}
	public void display()
	{
		System.out.println("Details of Resident doctor:");
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+Address);
		System.out.println("Working hours per day is:"+numOfHours);
		System.out.println("Rate per hour is:"+ratePerHour);
		System.out.println("Salary is:"+ratePerHour*numOfHours*30);
	}
}
public class AbstractDoctor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Resident Doctor");
		System.out.println("2.Specialist Doctor");
		System.out.println("Enter a option:");
        int op=sc.nextInt();
        switch(op)
        {
        case 1:
        	residentDoctor r=new residentDoctor("Cardiology",1000000);
        	r.display();
        	break;
        case 2:
        	specialistDoctor s=new specialistDoctor(5,10000);
        	s.display();
        	break;
        	default:
        		System.out.println("Invalid ");
        }
        sc.close();
	}

}
