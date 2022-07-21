package heap;
import java.util.Scanner;

class MaxHp{
	int heap[];
	public MaxHp() {
		heap=new int[10];
		for(int i=0;i<10;i++) {
			heap[i]=0;
		}
	}
	
	public void insert(int val) {
		int i=1;
		while(heap[i]!=0) {
			i++;
		}
		heap[i]=val;
		
		int temp=val;
		while(i>1&&temp>heap[i/2]) {
			heap[i]=heap[i/2];
			i=i/2;
		}
		heap[i]=temp;
	}
	
	public void delete() {
		int i=1;
		while(heap[i]!=0) {
			i++;
		}
		int p=i;
		int temp=heap[i-1];
		i=1;
		int j=2*i;
		while(j<p+1) {
			if(heap[j+1]>heap[j]) {
				j=j+1;
			}
			if(heap[j]>heap[i]) {
				int x=heap[j];
				heap[j]=heap[i];
				heap[i]=x;
				
				i=j;
				j=2*j;
			}else {
				break;
			}
		}
		heap[p]=temp;
	}
	
	public void display() {
		System.out.println("Elements in an heap are:");
		for(int i=1;i<heap.length;i++) {
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}
}

public class MaxHeap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements to insert:");
		int n=scan.nextInt();
		MaxHp mh =new MaxHp();
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++) {
			mh.insert(scan.nextInt());
		}
		mh.display();
		mh.delete();
		mh.delete();
		mh.display();
		scan.close();

	}

}
