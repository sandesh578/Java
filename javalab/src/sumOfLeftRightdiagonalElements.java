import java.util.Scanner;
public class sumOfLeftRightdiagonalElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row and column:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		System.out.println("Enter "+r*c+" elements to a matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
        int sum=0;
        int sum1=0;
        for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i<j)
				{
					sum+=mat[i][j];
				}
				if(i>j)
				{
					sum1+=mat[i][j];
				}
			}
		}
        System.out.println("Elements in matrix are:");
        for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(mat[i][j]);
			}
		}
        System.out.println("Sum of right elements of diagonal is:"+sum);
        System.out.println("Sum of left elements of diagonal is:"+sum1);
        sc.close();
	}

}
