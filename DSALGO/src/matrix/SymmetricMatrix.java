package matrix;
import java.util.Scanner;

class SymmetrixMat{
	public int n;
	public int mat[];
	SymmetrixMat(int size){
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
		}else {
			return mat[((int)(j*(j-1))/2)+i-1];
		}
	}
	
	public void display() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print(mat[((int)(i*(i-1))/2)+j-1]+" ");
				}else {
					System.out.print(mat[(int)((j*(j-1))/2)+i-1]+" ");
				}
			}
			System.out.println();
		}
	}
}

public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the matrix:");
		int n=scan.nextInt();
		SymmetrixMat lt=new SymmetrixMat(n);
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
