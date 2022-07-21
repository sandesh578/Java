import java.util.Scanner;
public class palindromeornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int rem,rev=0;
		int n=a;
		while(a!=0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(rev==n)
		{
			System.out.println(n+" is a palindrome number");
		}
		else
		{
			System.out.println(n+" is not a palindrome number");
		}
		sc.close();

	}

}
