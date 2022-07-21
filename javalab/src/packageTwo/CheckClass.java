package packageTwo;
import java.util.Scanner;

import packageOne.Odd;
import packageOne.Prime;

class check implements Odd,Prime{
	private int n;
	public check(int n)
	{
		this.n=n;
	}
	public void prime()
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count=1;
			}
		}
		if(count==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
	public void odd()
	{
		if(n%2!=0)
		{
			System.out.println(n+" is a odd number");
		}
		else
		{
			System.out.println(n+" is a even number");	
		}
	}
}
class Designs extends check{
	public Designs(int n){
		super(n);
	}
}
public class CheckClass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter a number:");
		int n=scan.nextInt();
		Designs c=new Designs(n);
		c.prime();
		c.odd();
		scan.close();
	}

}
