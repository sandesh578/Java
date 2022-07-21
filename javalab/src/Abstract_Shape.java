abstract class Shape{
	abstract void perimeter();
	abstract void area();
}
class circle extends Shape{
	int r;
	circle(int r)
	{
		this.r=r;
	}
	void perimeter()
	{
		System.out.println("Perimeter of circle is:"+(2*3.14*r));
	}
	void area()
	{
		System.out.println("Perimeter of circle is:"+(2*Math.PI*r*r));
	}
}
class rectangle extends Shape{
	int l,b;
	rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
    void perimeter()
	{
		System.out.println("Area of rectangle is:"+(2*(l+b)));
	}
	void area()
	{
		System.out.println("Area of rectangle is:"+(l*b));
	}
}
public class Abstract_Shape {

	public static void main(String[] args) {
		Shape s=new circle(5);//references
		s.perimeter();
		s.area();
		Shape sh=new rectangle(4,6);//references of abstract class shape
		sh.perimeter();
		sh.area();
	}

}
