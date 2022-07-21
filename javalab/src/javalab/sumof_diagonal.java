package javalab;

import java.util.Scanner;
public class sumof_diagonal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int c=sc.nextInt();
		int sum1=0,sum2=0;
		int[][] mat=new int[r][c];
		System.out.println("Enter "+(+(r*c))+" element to a matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("ELements in matrix are:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0,j=0;i<r&&j<c;j++,i++)
		{
			sum1+=mat[i][j];
		}
		for(int i=0,j=2;i<r&&j>=0;j--,i++)
		{
			sum2+=mat[i][j];
		}
		System.out.println("Sum of left diagonal element is:"+sum1);
		System.out.println("Sum of right diagonal element is:"+sum2);
		sc.close();

	}

}
