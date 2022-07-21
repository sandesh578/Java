package practice;

import java.util.Scanner;
class Calculator{
	int value;
	public Calculator(int value)
	{
		this.value=value;
	}
	public int find_square()
	{
		return value*value;
	}
}
class Application{
	public double evaluate(int n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			Calculator cal=new Calculator(i);
			sum+=(1/cal.find_square());
		}
		return sum;
	}
}
public class CalculatorImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		Calculator calc=new Calculator(n);
		System.out.println("Square of "+n+" is:"+calc.find_square());
		
		Application app=new Application();
		System.out.println("Sum is: "+app.evaluate(n));
		scan.close();

	}

}
