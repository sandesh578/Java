package binarySearchTree;
import java.util.Scanner;

class Node{
	public int data;
	public Node left;
	public Node right;
	Node(){
		
	}
	Node(int val){
		this.data=val;
		this.left=null;
		this.right=null;
	}
}

class BinarySearchTree{
	public void Insert(Node root,int val) {
		if(root==null) {
			Node newNode=new Node(val);
			root=newNode;
			return;
		}
		if(val<root.data) {
			Insert(root.left,val);
		}else {
			Insert(root.right,val);
		}
		
	}
	
	public void InOrder(Node root) {
		if(root!=null) {
			InOrder(root.left);
			System.out.print(root.data+" ");
			InOrder(root.right);
		}
	}
}

public class BinarySearchTreeImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Node root=null;
		BinarySearchTree bst=new BinarySearchTree();
		bst.Insert(root,7);
		bst.Insert(root,1);
		bst.Insert(root,6);
		bst.Insert(root,4);
		bst.Insert(root,9);
		
		System.out.println("Elements in the binary search tree are:");
		bst.InOrder(root);
		System.out.println();
		scan.close();

	}

}
