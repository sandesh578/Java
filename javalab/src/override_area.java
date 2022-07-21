import java.util.Scanner;
class AreaOverride1{
	int area(int l,int b)
	{
		return l*b;
	}
}
class AreaOverride2{
	int area(int l,int b)
	{
		return l*b;
	}
}
public class override_area {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length,breadth of rectangle1:");
		int l=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("Enter length,breadth of rectangle2:");
		int l2=scanner.nextInt();
		int b2=scanner.nextInt();
		
		AreaOverride1 obj1=new AreaOverride1();
		AreaOverride2 obj2=new AreaOverride2();
	
		System.out.println("Area of rectangle1 is:"+obj1.area(l,b));
		System.out.println("Area of rectangle2 is:"+obj2.area(l2,b2));
        scanner.close();
	}

}
