package lab8;
import java.util.Scanner;
interface Employee{
	public void Earnings();
	public void Deductions();
	public void Bonus();
}
abstract class Manager implements Employee{
	double earnings;
	double deduction;
	double bonus;
	double basicSal;
	int DA=80,HRA=15;
	public Manager(double basicSal)
	{
		this.basicSal=basicSal;
	}
	public void Earnings()
	{
		earnings=basicSal+((basicSal*DA)/100)+((basicSal*HRA)/100);
	}
	public void Deductions()
	{
		deduction=(12*basicSal);
	}
}
class SubStaff extends Manager{
	public SubStaff(double basicSal)
	{
		super(basicSal);
	}
	public void Bonus()
	{
		bonus=(50*basicSal)/100;
	}
	public void show()
	{
		System.out.println("\nFor SubStaff:");
		System.out.println("Earninng is:"+earnings);
		System.out.println("Deduction is:"+deduction);
		System.out.println("Bonus is:"+bonus);
	}
}
public class ManagerImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter SubStaff Basic Salary:");
		double sal1=scan.nextDouble();
		SubStaff o=new SubStaff(sal1);
		o.Earnings();
		o.Deductions();
		o.Bonus();
		o.show();
		scan.close();

	}

}
