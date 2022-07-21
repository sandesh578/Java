package practice;

import java.util.Scanner;
interface Numbers{
	public int process(int x,int y);
}
class Sum implements Numbers{
	public int process(int x,int y)
	{
		return x+y;
	}
}
class Average implements Numbers{
	public int process(int x,int y)
	{
		return (x+y)/2;
	}
}
public class NumbersImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x=scan.nextInt();
		int y=scan.nextInt();
		Average avg=new Average();
		System.out.println("Average of "+x+" and "+y+" is: "+avg.process(x,y));
		
		Sum sum=new Sum();
		System.out.println("Sum of "+x+" and "+y+" is: "+sum.process(x,y));
		scan.close();

	}

}
