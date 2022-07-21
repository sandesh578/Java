package stack;
import java.util.Scanner;

class Node{
	public int data;
	public Node next;
	Node(){
		
	}
	Node(int val){
		this.data=val;
		this.next=null;
	}
}

class Stack{
	Node top=null;
	
	public void push(int val) {
		Node newNode=new Node(val);
		if(top==null) {
			top=newNode;
		}else {
			newNode.next=top;
			top=newNode;
		}
	}
	
	public int pop() {
		if(top==null) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			int val=top.data;
			top=top.next;
			return val;
		}
	}
	
	public boolean isEmpty() {
		return top==null?true:false;
	}
	
	public int peek() {
		if(!isEmpty()) {
			return top.data;
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void display() {
		if(top==null) {
			System.out.println("Stack is Empty");
		}else {
			Node temp=top;
			System.out.println("Elements in the stack are:");
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
}
public class Stackimplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Stack ob=new Stack();
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.isEmpty");
			System.out.println("5.Peek");
			System.out.println("6.Exit");
			System.out.println("Enter a option:");
			int op=scan.nextInt();
			switch(op)
			{
			 case 1:
				 System.out.println("Enter the number of items to push:");
				 int n=scan.nextInt();
				 System.out.println("Enter "+n+" data to a stack:");
				 for(int i=0;i<n;i++)
				 {
					int data=scan.nextInt();
				    ob.push(data);
				 }
				 break;
			 case 2:
				 int item=ob.pop();
				 System.out.println(item+" is popped successfully");
				 break;
			 case 3:
				 ob.display();
				 break;
			 case 4:
				 if(ob.isEmpty())
				 {
				   System.out.println("Stack is empty");
				 }
				 else
				 {
					 System.out.println("Stack is not empty");
				 }
				 break;
			 case 5:
				 System.out.println("Last element of stack is:"+ob.peek());
				 break;
			 case 6:
				 System.exit(0);
			 default:
				 System.out.println("Invalid Input");
			}
		}

	}

}
