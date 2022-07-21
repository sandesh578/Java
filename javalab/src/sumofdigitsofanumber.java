import java.util.Scanner;
public class sumofdigitsofanumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();
		int rem;
		int sum=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digits of a number is:"+sum);
		scanner.close();

	}

}
