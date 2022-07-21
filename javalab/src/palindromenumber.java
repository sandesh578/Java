import java.util.Scanner;
public class palindromenumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=scanner.nextInt();
		int[] num=new int[n+2];
		num[0]=1;
		num[1]=1;
		for(int i=2;i<n;i++)
		{
			num[i]=num[i-1]+num[i-2];
		}
		System.out.println("Fibonacci series is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(num[i]);
		}
		scanner.close();

	}

}
