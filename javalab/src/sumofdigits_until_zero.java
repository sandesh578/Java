import java.util.Scanner;
public class sumofdigits_until_zero {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();
		int sum=0;
		int rem=0;
		int num=n;
		while(n!=0||sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digit of "+num+" and their digit is:"+sum);
        scanner.close();
	}

}
