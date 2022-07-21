package matrix;
import java.util.Scanner;

class LowerTriangular{
	public int n;
	public int mat[];
	LowerTriangular(int size){
		this.n=size;
		int totalNonZeroElements=(int)((n*(n+1))/2);
		mat=new int[totalNonZeroElements];
	}
	
	public void set(int i,int j,int x) {
		if(i>=j) {
			mat[((int)(i*(i-1))/2)+j-1]=x;
		}
	}
	
	public int get(int i,int j) {
		if(i>=j) {
			return mat[((int)(i*(i-1))/2)+j-1];
		}
		return 0;
	}
	
	public void display() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print(mat[((int)(i*(i-1))/2)+j-1]+" ");
				}else {
					System.out.print('0'+" ");
				}
			}
			System.out.println();
		}
	}
}

public class LowerTriangularMatrixRowMajor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the matrix:");
		int n=scan.nextInt();
		LowerTriangular lt=new LowerTriangular(n);
		System.out.println("Enter the elements of matrix row-wise:");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
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
