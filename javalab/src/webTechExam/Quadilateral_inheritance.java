package webTechExam;
class Quadilateral{
	double area;
	int l;
	int b;
	int a;
	int h;
}
class Square extends Quadilateral{
	public Square(int m)
	{
		this.l=m;
	}
	public void area()
	{
		System.out.println("Area of square is:"+(l*l));
	}
}
class Rectangle extends Quadilateral{
	public Rectangle(int p,int q)
	{
		this.l=p;
		this.b=q;
	}
	public void area()
	{
		System.out.println("Area of rectangle is:"+(l*b));	
	}
}
class Parellogram extends Quadilateral{
	public Parellogram(int c,int d)
	{
		this.b=c;
		this.h=d;
	}
	public void area()
	{
		System.out.println("Area of parellogram is:"+(b*h));
	}
}
class Trapezoid extends Quadilateral{
	public Trapezoid(int x,int y,int z)
	{
		this.a=x;
		this.b=y;
		this.h=z;
	}
	public void area()
	{
		System.out.println("Area of trapezoid is:"+((a*b)/2)*h);
	}
}
public class Quadilateral_inheritance {

	public static void main(String[] args) {
		Square s=new Square(5);
		Rectangle r=new Rectangle(4,6);
        Parellogram p=new Parellogram(7,3);
        Trapezoid t=new Trapezoid(4,2,8);
        s.area();
        r.area();
        p.area();
        t.area();
	}

}
