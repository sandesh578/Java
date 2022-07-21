package matrix;
import java.util.Scanner;

class TriDiagonal{
	public int n;
	public int mat[];
	TriDiagonal(int size){
		this.n=size;
		int totalNonZeroElements=3*n-2;
		mat=new int[totalNonZeroElements];
	}
	
	public void set(int i,int j,int x) {
		if(i-j==0) {
			mat[n-1+i-1]=x;
		}else if(i-j==1) {
			mat[i-1]=x;
		}else if(i-j==-1) {
			mat[2*n-1+i-1]=x;
		}
	}
	
	public int get(int i,int j) {
		if(i-j==0) {
			return mat[n-1+i-1];
		}else if(i-j==1) {
			return mat[i-1];
		}else if(i-j==-1) {
			return mat[2*n-1+i-1];
		}else {
			return 0;
		}
	}
	
	public void display() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i-j==0) {
					System.out.print(mat[n-1+i-1]+" ");
				}else if(i-j==1) {
					System.out.print(mat[i-1]+" ");
				}else if(i-j==-1) {
					System.out.print(mat[2*n-1+i-1]+" ");
				}else {
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}
	}
}

public class TriDiagonalMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the matrix:");
		int n=scan.nextInt();
		TriDiagonal lt=new TriDiagonal(n);
		System.out.println("Enter the elements of matrix from lower to main to upper diagonal:");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i-j==0||i-j==1||i-j==-1) {
					lt.set(i,j,scan.nextInt());
				}
			}
		}
		System.out.println("Enter the row and column to access element:");
		System.out.print("Row: ");
		int r=scan.nextInt();
		System.out.print("Column: ");
		int c=scan.nextInt();
		System.out.println("Elements of matrix are:");
		lt.display();
		System.out.println("Element at row "+r+" column "+c+" is: "+lt.get(r,c));
		scan.close();

	}

}
