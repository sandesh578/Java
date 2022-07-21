import java.util.Scanner;
class OverloadSubstract{
	public Integer substract(int a,int b)
	{
		return a-b;
	}
	public Integer substract(int a,int b,int c)
	{
		return a-b-c;
	}
}
public class overload_subtract {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		OverloadSubstract obj=new OverloadSubstract();
		System.out.println("Difference of "+a+" and "+b+" is:"+obj.substract(a,b));
		System.out.println("Difference of "+a+","+b+" and "+c+" is:"+obj.substract(a,b,c));
		scanner.close();

	}

}
