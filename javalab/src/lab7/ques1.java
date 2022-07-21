package lab7;
import java.util.Scanner;
class TwoDSheet{
	int l,b;
	int costPerSquareFeet=40;
	public TwoDSheet(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void displayCost1()
	{
		double TotalCost=(l*b)*costPerSquareFeet;
		System.out.println("Total cost of 2DSheet is:"+TotalCost);
	}
}
class ThreeDBox extends TwoDSheet{
	int l,b,h;
	int costPerCubicFeet=60;
	public ThreeDBox(int l,int b,int h)
	{
		super(l,b);
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void displayCost2()
	{
		double TotalCost3D=(l*b*h)*costPerCubicFeet;
		System.out.println("Total cost of 3DBox is:"+TotalCost3D);
	}
}
public class ques1 {
   public static void main(String[] args)
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter length,breadth,height:");
	   int l=scan.nextInt();
	   int b=scan.nextInt();
	   int h=scan.nextInt();
	   ThreeDBox obj=new ThreeDBox(l,b,h);
	   obj.displayCost1();
	   obj.displayCost2();
	   scan.close();
   }
}
