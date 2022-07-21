package practice;

import java.util.Scanner;
abstract class Figure{
	int length;
	int breadth;
	abstract public void area();
}
class Rectangle extends Figure{
	
	public Rectangle(int length,int breadth)
    {
    	this.length=length;
    	this.breadth=breadth;
    }
	
	@Override
	public void area() {
		System.out.println("Area of rectangle is:"+(length*breadth));
	}
	
}
class Triangle extends Figure{
	int height;
    public Triangle(int length,int height)
    {
    	this.length=length;
    	this.height=height;
    }
	@Override
	public void area() {
		System.out.println("Area of triangle is:"+(length*height)/2);
	}
	
}
public class FigureImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length,breadth,height:");
		int length=scan.nextInt();
		int breadth=scan.nextInt();
		int height=scan.nextInt();
		Rectangle r=new Rectangle(length,breadth);
		r.area();
		Triangle t=new Triangle(length,height);
		t.area();
		scan.close();

	}

}
