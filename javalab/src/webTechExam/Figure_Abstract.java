package webTechExam;
import java.util.Scanner;
abstract class Figure{
	abstract public void area();
	public int length;
	public int breadth;
	Scanner scan=new Scanner(System.in);
}
class Triangle extends Figure{
	public void area()
	{
		System.out.println("Enter the base and height of triangle:");
		length=scan.nextInt();
		breadth=scan.nextInt();
		System.out.println("Area of triangle is:"+((length*breadth)/2));
	}
}
class Rectangles extends Figure{
	public void area()
	{
		System.out.println("\nEnter the length and breadth of rectangle:");
		length=scan.nextInt();
		breadth=scan.nextInt();
		System.out.println("Area of rectangle is:"+(length*breadth));
	}
}
public class Figure_Abstract {

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.area();
		Rectangles r=new Rectangles();
		r.area();

	}

}
