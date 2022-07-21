import java.util.Scanner;
public class sumof_diagonal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int c=sc.nextInt();
		int sum=0;
		int[][] mat=new int[r][c];
		System.out.println("Enter "+(+(r*c))+" element to a matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;i++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;i++)
			{
				if(i==j)
				{
					sum=sum+mat[i][j];
				}
			}
		}
		System.out.println("Sum of diagonal element is:"+sum);
		sc.close();

	}

}
