package lab7;

abstract class Shape{
	double area;
	abstract public void showArea();
}
class Rectangle extends Shape{
	int b;
	int l;
	public Rectangle(int b,int l)
	{
		this.b=b;
		this.l=l;
	}
	public void calculate()
	{
	  area=l*b;
	}
	public void showArea()
	{
		System.out.println("Area of rectangle is:"+area);
	}
}
class Circle extends Shape{
	int r;
	public Circle(int r)
	{
		this.r=r;
	}
	public void calculate()
	{
	  area=3.14*r*r;
	}
	public void showArea()
	{
		System.out.println("Area of circle is:"+area);
	}
}
public class ques4 {

	public static void main(String[] args) {
		Circle c=new Circle(5);
		c.calculate();
		c.showArea();
		Rectangle t=new Rectangle(5,6);
		t.calculate();
		t.showArea();
	}

}

