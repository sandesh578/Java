package general;

public class Employee {
 protected int empid;
 private String ename;
 double basic;
 int da,hra;
 public Employee(String ename,int empid,double basic1,int da,int hra)
 {
	this.ename=ename;
	this.empid=empid;
	this.basic=basic1;
	this.da=da;
	this.hra=hra;
 }
 public String getName()
 {
	 return ename;
 }
 public double earnings()
 {
	 double totalEarnings=basic+((da*basic)/100)+((hra*basic)/100);
	 return totalEarnings;
 }
}
