package queue;

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
class Queue{
	Node front=null;
	Node rear=null;
	public void enqueue(int data)
	{
	   Node newNode=new Node(data);
	   if(rear==null)
	   {
		   front=rear=newNode;
	   }
	   else
	   {
		   rear.next=newNode;
		   rear=newNode;
	   }
	}
	public int dequeue()
	{
		int item;
		if(front==null)
		{
			rear=null;
			System.out.println("No element available to dequeue");
		}
		Node currNode=front;
		item=currNode.data;
		front=front.next;
		return item;
	}
	public int peek()
	{
		if(front==null)
		{
			System.out.println("Linked list is Empty");
		}
		return front.data;
	}
	public boolean isEmpty()
	{
		if(front==null)
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
		Node temp=front;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class QueueImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Queue ob=new Queue();
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.isEmpty");
			System.out.println("5.Peek");
			System.out.println("6.Exit");
			System.out.println("Enter a option:");
			int op=scan.nextInt();
			switch(op)
			{
			 case 1:
				 System.out.println("Enter the number of items to enqueue:");
				 int n=scan.nextInt();
				 System.out.println("Enter "+n+" data to a queue:");
				 for(int i=0;i<n;i++)
				 {
					int data=scan.nextInt();
				    ob.enqueue(data);
				 }
				 break;
			 case 2:
				 int item=ob.dequeue();
				 System.out.println(item+" is dequed successfully");
				 break;
			 case 3:
				 System.out.println("Elements in the queues are:");
				 ob.display();
				 break;
			 case 4:
				 if(ob.isEmpty())
				 {
				   System.out.println("Queue is empty");
				 }
				 else
				 {
					 System.out.println("Queue is not empty");
				 }
				 break;
			 case 5:
				 System.out.println("First element of queue is:"+ob.peek());
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
