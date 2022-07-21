import java.util.Scanner;
public class transpose_ofmatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and column:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter the "+r*c+" data to matrix:");
		int[][] mat=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Before Transpose matrix is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
        sc.close();
	}

}
