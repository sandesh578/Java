package heap;
import java.util.Scanner;

class Heap{
	int heap[];
	int n;
	public Heap(int n) {
		this.n=n;
		heap=new int[n];
	}
		
	public void Insert(int val) {
		heap[n-1]=val;
		int temp=val,i=1;
		while(i>1&&temp<heap[i/2]) {
			heap[i]=heap[i/2];
			i=i/2;
		}
		heap[i]=temp;
	}
	
	public void Display() {
		System.out.println("\nElements in the heap are:");
		for(int i=1;i<heap.length;i++) {
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}
}

public class Heapify {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements to enter:");
		int n=scan.nextInt();
		Heap h=new Heap(n);
		System.out.println("Enter "+n+" elements to a heap:");
		for(int i=1;i<n;i++) {
			h.Insert(scan.nextInt());
		}
		h.Display();
		scan.close();

	}

}
