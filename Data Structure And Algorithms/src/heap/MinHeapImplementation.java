package heap;
import java.util.Scanner;

class MinHeap{
	int heap[];
	int n;
	public MinHeap(int n) {
		this.n=n+1;
		heap=new int[n+1];
	}
	
	public void delete() {
		int temp=heap[1];
		heap[1]=heap[n];
		int i=1;
		int j=2*i;
		while(j<n-1) {
			if(heap[j+1]<heap[j]) {
				j=j+1;
			}
			if(heap[j]<heap[i]) {
				int x=heap[i];
				heap[i]=heap[j];
				heap[j]=x;
				i=j;
				j=2*j;
			}else {
				break;
			}
		}
		heap[n]=temp;
	}
	
	public void Insert(int val) {
		int i=1;
		while(heap[i]!=0) {
			i++;
		}
		heap[i]=val;
		int temp=val;
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

public class MinHeapImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements to enter:");
		int n=scan.nextInt();
		MinHeap h=new MinHeap(n);
		System.out.println("Enter "+n+" elements to a heap:");
		for(int i=0;i<n;i++) {
			h.Insert(scan.nextInt());
		}
		h.Display();
		//Heapsort
		for(int i=0;i<n;i++) {
			h.delete();
		}
		h.Display();
		scan.close();

	}

}
