package javalab;
import java.util.Scanner;
class Rectangle{
	int l;
	int b;
	int area,perimeter;
	Scanner scan=new Scanner(System.in);
	public void getInput()
	{
	 System.out.println("Enter the length and breadth of rectangle:");
	 l=scan.nextInt();
	 b=scan.nextInt();
	}
	public void calculate()
	{
		area=l*b;
		perimeter=2*(l+b);
	}
	public void display()
	{
		System.out.println("Area of rectangle is:"+area);
		System.out.println("Perimeter of rectangle is:"+perimeter);	
	}
}
public class RectangleAreaPerimeter {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.getInput();
		r.calculate();
		r.display();

	}

}
