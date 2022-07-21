import java.util.Scanner;
public class matrix_multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and column:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat3[][]=new int[r][c];
		System.out.println("Enter the "+r*c+" data to matrix1:");
		int[][] mat1=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the "+r*c+" data to matrix2:");
		int[][] mat2=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat3[i][j]=0;
				for(int k=0;k<r;k++)
				{
					mat3[i][j]+=mat1[i][j]*mat2[i][j];
				}
			}
		}
		System.out.println("Matrix after multiplication is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
        sc.close();
	}

}
