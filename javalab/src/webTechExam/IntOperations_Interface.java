package webTechExam;
import java.util.Scanner;
interface IntOperations{
	public void evenOrOdd();
	public void positiveOrNegative();
	public void primeOrNot();
	public void factorial();
	public void sumOfDogits();
}
class MyNumbers implements IntOperations{
	private int n;
    public MyNumbers()
    {
    	n=0;
    }
    public MyNumbers(int num)
    {
    	this.n=num;
    }
	public void evenOrOdd() {
		if(n%2!=0)
		{
			System.out.println(n+" is a odd number");
		}
		else
		{
			System.out.println(n+" is a even number");	
		}
	}
	public void positiveOrNegative()
	{
		if(n>=1)
		{
			System.out.println(n+" is a positive number");
		}
		else
		{
			System.out.println(n+" is a negative number");	
		}
	}
	public void primeOrNot()
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
	public void factorial()
	{
		int fact=0;
		int i=n;
		while(i>0)
		{
			fact+=fact*i;
			i--;
		}
	}
	public void sumOfDogits()
	{
		int sum=0;
		int p=n;
		sum=sum+n%10;
		n=n/10;
		System.out.println("Sum of digits of "+p+" is:"+sum);
	}
}

public class IntOperations_Interface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		MyNumbers c=new MyNumbers(n);
		
		System.out.println("1.Check Even Or Odd");
		System.out.println("2.Check Positive Or Negative");
		System.out.println("3.Check prime Or not");
		System.out.println("4.Find factorial of a number");
		System.out.println("5.Find sum of digits of a number");
		System.out.println("Enter a option:");
		int op=sc.nextInt();
		switch(op)
		{
		 case 1:
			 c.evenOrOdd();
			 break;
		 case 2:
			 c.positiveOrNegative();
			 break;
		 case 3:
			 c.primeOrNot();
			 break;
		 case 4:
			 c.factorial();
			 break;
		 case 5:
			 c.sumOfDogits();
			 break;
		default:
			System.out.println("Invalid Input");
		}
		sc.close();

	}

}
