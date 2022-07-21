package practice;

import java.util.Scanner;
class Circle{
	double radius;
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
}
class Demo extends Circle{
    Circle circle=new Circle();
	public void perimeter()
	{
		System.out.println("Perimeter of circle is:"+(2*Math.PI*circle.getRadius()));
	}
	public void area()
	{
		System.out.println("Area of circle is:"+(Math.PI*circle.getRadius()*circle.getRadius()));
	}
}
public class GeometryImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double radius=scan.nextDouble();
		Circle circle=new Circle();
		circle.setRadius(radius);
		Demo d=new Demo();
		d.perimeter();
		d.area();
		scan.close();

	}

}
