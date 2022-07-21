import java.util.Scanner;

class Node{
	public int data;
	public Node left;
	public Node right;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class BinaryTree{
	public Node root=null;
	
	public Node insert(Node node,int val) {
		if(node==null) {
			return new Node(val);
		}
		if(val<node.data) {
		   node.left=insert(node.left,val);
		}else if(val>node.data) {
			node.right=insert(node.right,val);
		}else {
			return node;
		}
		
		return node;
	}
	
    public void transverseInOrder(Node root) {
		if(root!=null) {
			transverseInOrder(root.left);
			System.out.println(root.data);
			transverseInOrder(root.right);
		}
	}
}

public class Tree {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BinaryTree bt=new BinaryTree();
		Node root=new Node(5);
		bt.insert(root,7);
		bt.insert(root,8);
		bt.insert(root,2);
		bt.insert(root,6);
		bt.insert(root,1);
		bt.insert(root,9);
		bt.transverseInOrder(root);
		scan.close();

	}

}
