package webTechExam;
import java.util.Scanner;
class Number{
	int value;
	public Number(int n)
	{
		this.value=n;
	}
	public void find_factorial()
	{
		int fact=1;
		int i=value;
		while(i!=0)
		{
			fact*=i;
			i--;
		}
		System.out.println("Factorial of "+value+"  is:"+fact);
	}
}
public class FactorialOfa_Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		Number obj=new Number(n);
		obj.find_factorial();
		scan.close();

	}

}
