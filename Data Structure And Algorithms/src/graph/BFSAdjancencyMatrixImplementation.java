package graph;
import java.util.Scanner;

class Queue{
	public int queue[],front=-1,rear=-1,max;
	public Queue(int max) {
		this.max=max;
		this.queue=new int[max];
	}
	
	public void enqueue(int data) {
		if(rear==max) {
			System.out.println("Queue is full");;
		}else if(rear==front){
			front=rear=0;
			queue[front]=data;
			queue[rear]=data;
		}else {
			queue[++rear]=data;
		}
	}
	
	public int dequeue() {
		if(front==-1) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			int data=queue[front];
			front=front+1;
			return data;
		}
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	
	public boolean isFull() {
		return rear==max;
	}
	
}

public class BFSAdjancencyMatrixImplementation {
	
	public static void BFS(int mat[][],int start,int n) {
		System.out.println("Elements in the graph are:-");
		int visited[]=new int[n];
		System.out.println(start);
		visited[start]=1;
		Queue queue=new Queue(n);
		queue.enqueue(start);
		while(!queue.isEmpty()) {
			int u=queue.dequeue();
			for(int v=0;v<n;v++) {
				if(mat[u][v]==1&&visited[v]==0) {
					System.out.println(v);
					visited[v]=1;
					queue.enqueue(v);
				}
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of vertices of graph:");
		int n=scan.nextInt();
		int mat[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=0;
			}
		}
		
		System.out.println("Enter the number of edges:");
		int edges=scan.nextInt();
		
		for(int i=0;i<edges;i++) {
			System.out.println("Enter the two vertex consisting of edges:");
			int a=scan.nextInt();
			int b=scan.nextInt();
			mat[a][b]=1;
			mat[b][a]=1;
		}
		
		System.out.println("Enter the starting node");
		int start=scan.nextInt();
		BFS(mat,start,n);
		scan.close();

	}

}
