package matrix;
import java.util.Scanner;

class Diagonal{
	public int n;
	public int mat[];
	Diagonal(int size){
		this.n=size;
		mat=new int[size];
	}
	
	public void set(int i,int j,int x) {
		if(i==j) {
			mat[i-1]=x;
		}
	}
	
	public int get(int i,int j) {
		if(i==j) {
			return mat[i-1];
		}
		return 0;
	}
	
	public void display() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print(mat[i-1]+" ");
				}else {
					System.out.print('0'+" ");
				}
			}
			System.out.println();
		}
	}
}

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the matrix:");
		int n=scan.nextInt();
		Diagonal d=new Diagonal(n);
		System.out.println("Enter the diagonal elements of matrix:");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					d.set(i,j,scan.nextInt());
				}
			}
		}
		System.out.println("Enter the row and column to access element:");
		System.out.print("Row: ");
		int r=scan.nextInt();
		System.out.print("Column: ");
		int c=scan.nextInt();
		System.out.println("Elements of matrix are:");
		d.display();
		System.out.println("\nElement at row "+r+" column "+c+" is: "+d.get(r,c));
		scan.close();

	}

}
