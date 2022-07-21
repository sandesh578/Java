import java.util.Scanner;
class AreaOverload{
	int area(int l)
	{
		return l*l;
	}
	int area(int l,int b)
	{
		return l*b;
	}
	int area(int l,int b,int h)
	{
		return 2*((l*b)+(b*h)+(h*l));
	}
}
public class overload_area {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length,breadth,height of cuboid:");
		int l=scanner.nextInt();
		int b=scanner.nextInt();
		int h=scanner.nextInt();
		System.out.println("Enter length of square:");
		int l2=scanner.nextInt();
		System.out.println("Enter length,breadth of rectangle:");
		int l3=scanner.nextInt();
		int h2=scanner.nextInt();
		
		AreaOverload obj=new AreaOverload();
		System.out.println("Area of square is:"+obj.area(l2));
		System.out.println("Area of rectangle is:"+obj.area(l3,h2));
		System.out.println("Area of cuboid is:"+obj.area(l,b,h));
        scanner.close();
	}

}
