import java.util.Scanner;
class Rectangle{
	private int length;
	private int breadth;
	public int area;
	public int perimeter;
	public void getinput()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle:");
		length=scanner.nextInt();
		breadth=scanner.nextInt();
		scanner.close();
	}
	public void calculate()
	{
		area=length*breadth;
		perimeter=2*(length+breadth);
	}
	public void display()
	{
		System.out.println("Area  of rectangle is:"+area);
		System.out.println("Perimeter  of rectangle is:"+perimeter);
	}
}
public class Rectangle_operations {

	public static void main(String[] args) {
		
      Rectangle obj=new Rectangle();
      obj.getinput();
      obj.calculate();
      obj.display();
	}

}
