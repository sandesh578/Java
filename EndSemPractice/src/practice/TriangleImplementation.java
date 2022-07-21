package practice;

import java.util.Scanner;
@SuppressWarnings("serial")
class NoTriangleFormedException extends Exception{
	public String toString()
	{
		return "No triangle formed";
	}
}
class Triangles{
	int a,b,c;
	public Triangles(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double find_area()
	{
		int s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	public int find_perimeter()
	{
		return a+b+c;
	}
}
public class TriangleImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter three sides of triangle:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		try
		{
			if((a+b)>c||(b+c)>a||(c+a)>b)
			{
				Triangles tri=new Triangles(a,b,c);
				System.out.println("Area of triangle is: "+tri.find_area());
				System.out.println("Perimeter of triangle is: "+tri.find_perimeter());
			}
			else
			{
				throw new NoTriangleFormedException();
			}
		}
		catch(NoTriangleFormedException e)
		{
			System.out.println(e);
		}
		scan.close();

	}

}
