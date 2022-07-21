package stack;

import java.util.Scanner;

class Node
{
	public int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Stack{
	Node top=null;
	public void push(int data)
	{
	   Node newNode=new Node(data);
	   if(top==null)
	   {
		   top=newNode;
	   }
	   else
	   {
		   newNode.next=top;
		   top=newNode;
	   }
	}
	public int pop()
	{
		int item=0;
		if(top==null)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			item=top.data;
			top=top.next;
		}
		return item;
	}
	public int peek()
	{
		if(top==null)
		{
			System.out.println("Linked list is Empty");
		}
		return top.data;
	}
	public boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class StackImplementation {

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
				 System.out.println("Elements in the stack are:");
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
        //scan.close();
	}

}
