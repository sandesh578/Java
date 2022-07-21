package graph;
import java.util.ArrayList;
import java.util.Scanner;

class Graph{
	public void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);//undirected graph
	}
	
	public void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for(int i=0;i<adj.size();i++) {
			System.out.println("\nAdjancency list of vertex "+i);
			System.out.print("head");
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print(" -> "+adj.get(i).get(j));
			}
		}
	}
}

public class GraphAdjancencyListsImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Graph graph=new Graph();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		
		System.out.println("Enter the size of the graph:");
		int n=scan.nextInt();
		
		//Creating graph with 5 vertices
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		graph.addEdge(adj,0,1);
		graph.addEdge(adj,0,4);
		graph.addEdge(adj,1,4);
		graph.addEdge(adj,1,3);
		graph.addEdge(adj,1,2);
		graph.addEdge(adj,2,3);
		graph.addEdge(adj,3,4);
		
		graph.printGraph(adj);
		scan.close();

	}

}
