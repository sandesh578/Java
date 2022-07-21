import java.util.Scanner;
public class factorial_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=sc.nextInt();
		System.out.println("Factorial pattern is:");
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			{
				System.out.print(i+"!");
			}
			else
			{
				System.out.print(i+"!+");
			}
		}
		sc.close();

	}

}
