package graph;
import java.util.Scanner;

public class DFSAdjancencyMatrixImplementation {
	public static int visited[]=new int[7];
	
	public static void DFS(int mat[][],int u,int n) {
		if(visited[u]==0) {
			System.out.println(u);
			visited[u]=1;
		
			for(int v=0;v<n;v++) {
				if(mat[u][v]==1&&visited[u]!=0) {
					DFS(mat,v,n);

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
		System.out.println("Elements in the graph are:-");
		DFS(mat,start,n);
		scan.close();

	}

}
