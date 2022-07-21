package webTechExam;
import java.util.Scanner;
class Circle{
	double radius;
	public void setRadius(double rad)
	{
		radius=rad;
	}
	public double getRadius()
	{
		return radius;
	}
}
public class AreaPerimeterOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		int r=sc.nextInt();
		Circle c=new Circle();
		c.setRadius(r);
		System.out.println("Area of circle is:"+(3.14*c.getRadius()*c.getRadius()));
		System.out.println("Perimeter of circle is:"+(2*3.14*c.getRadius()));
		sc.close();

	}

}
