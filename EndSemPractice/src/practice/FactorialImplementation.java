package practice;

import java.util.Scanner;
class Number{
	int value;
	public Number(int value)
	{
		this.value=value;
	}
	public int find_factorial()
	{
		int fact=1;
		for(int i=value;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class FactorialImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		Number obj=new Number(num);
		System.out.println("Factorial of "+num+"is:"+obj.find_factorial());
		scan.close();

	}

}
