import java.util.Scanner;
public class one23_triangle2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=sc.nextInt();
		System.out.println("The pattern is:");
		sc.close();
		int i,j;
		for(i=0;i<n;i++)
		{
			int k=1;
			for(j=1;j<=n;j++)
			{
				if(j>=n+1-i)
				{
					System.out.print(k);
					k++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
