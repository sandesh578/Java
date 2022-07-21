package sortingAlgo;

import java.util.Scanner;
class Salary{
	double basic;
	int TA;
	int DA;
	int HRA;
	double totalSalary;
	public Salary(double basic,int TA,int DA,int HRA)
	{
		this.basic=basic;
		this.TA=TA;
		this.DA=DA;
		this.HRA=HRA;
	}
    public void calculate()
    {
    	totalSalary=basic+((TA*basic)/100)+((DA*basic)/100)+((HRA*basic)/100);
    }
	public void display()
	{
     System.out.println("Basic Salary is:"+basic);
     System.out.println("Total Salary is:"+totalSalary);
	}
}
public class SalaryCal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter basic Salary:");
		double basic=scan.nextDouble();
		System.out.println("Enter the TA:");
		int TA=scan.nextInt();
		System.out.println("Enter the DA:");
		int DA=scan.nextInt();
		System.out.println("Enter the HRA:");
		int HRA=scan.nextInt();
		Salary sal=new Salary(basic,TA,DA,HRA);
		sal.calculate();
		sal.display();
        scan.close();
	}

}
