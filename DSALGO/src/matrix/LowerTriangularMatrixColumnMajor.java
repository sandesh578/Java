package matrix;
import java.util.Scanner;

class LowerTriangularMat{
	public int n;
	public int mat[];
	LowerTriangularMat(int size){
		this.n=size;
		int totalNonZeroElements=(int)((n*(n+1))/2);
		mat=new int[totalNonZeroElements];
	}
	
	public void set(int i,int j,int x) {
		if(i>=j) {
			mat[(n*(j-1)-(int)(((j-2)*(j-1))/2))+i-j]=x;
		}
	}
	
	public int get(int i,int j) {
		if(i>=j) {
			return mat[(n*(j-1)-(int)(((j-2)*(j-1))/2))+i-j];
		}
		return 0;
	}
	
	public void display() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print(mat[(n*(j-1)-(int)(((j-2)*(j-1))/2))+i-j]+" ");
				}else {
					System.out.print('0'+" ");
				}
			}
			System.out.println();
		}
	}
}

public class LowerTriangularMatrixColumnMajor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the matrix:");
		int n=scan.nextInt();
		LowerTriangularMat lt=new LowerTriangularMat(n);
		System.out.println("Enter the elements of matrix column-wise:");
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
