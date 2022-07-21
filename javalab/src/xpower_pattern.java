import java.util.Scanner;
public class xpower_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=sc.nextInt();
		System.out.println("Power pattern is:");
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			{
				System.out.print("X^"+i);
			}
			else
			{
				System.out.print("X^"+i+"+");
			}
		}
		sc.close();

	}

}
