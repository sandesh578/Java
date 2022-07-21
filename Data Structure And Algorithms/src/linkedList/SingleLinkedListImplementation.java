package linkedList;

import java.util.Scanner;

class Node
{
	public int data;
	public Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	public void displayNodeData()
	{
		System.out.println(this.data);
	}
}
class LinkedList{
	public Node head=null;
	public void addNodeToFirst(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=this.head;
			head=newNode;
		}
	}
	public void addNodeToLast(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			this.head=newNode;
		}
		else
		{
			Node currNode=head;
			while(currNode.next!=null)
			{
				currNode=currNode.next;
			}
			currNode.next=newNode;
			
		}
	}
	public void addNodeToPos(Node after,int data)
	{
		Node currNode=head;
		Node temp=head;
		while(temp.data!=after.data)
		{
			temp=currNode;
			currNode=currNode.next;
		}
		Node newNode=new Node(data);
		newNode.next=currNode;
	}
	public int deleteFirstNode()
	{
		int item;
		if(head==null)
		{
			System.out.println("Linked List is Empty,NO item to delete");
			return 0;
		}
		else
		{
		  item=head.data;
		  head=head.next;
		}
		return item;
	}
	public int deleteLastNode()
	{
		int item;
		if(head==null)
		{
			System.out.println("Linked List is Empty,No item to delete");
			return 0;
		}
		else
		{
		  Node currNode=head;
		  Node temp=head;
		  while(currNode.next!=null)
		  {
			  temp=currNode;
			  currNode=currNode.next;
		  }
		  currNode=temp;
		  item=currNode.data;
		  currNode.next=null;
		  
		}
		return item;
	}
	public int deleteSpecifiedNode(Node after)
	{
		int item;
		if(head==null)
		{
			System.out.println("Linked List is Empty,NO item to delete");
			return 0;
		}
		else
		{
		  Node currNode=head;
		  while(currNode.data!=after.data)
		  {
			  currNode=currNode.next;
		  }
		  item=currNode.next.data;
		  currNode.next=currNode.next.next;
		  
		}
		return item;
	}
	public int CountNodes()
	{
		int count=1;
		Node temp=head;
		while(temp!=null)
		{
			count++;
		}
		return count;
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("Linked List is Empty");
			return;
		}
		else
		{
			Node temp=head;
			while(temp!=null);
			{
				temp.displayNodeData();
				temp=temp.next;
			}
		}
	}
}
public class SingleLinkedListImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int data,item,pos;
		LinkedList list=new LinkedList();
		while(true)
		{
		System.out.println("Menu");
		System.out.println("1.Insert at First");
		System.out.println("2.Insert at Last");
		System.out.println("3.Insert at specified Position");
		System.out.println("4.Remove First Node");
		System.out.println("5.Remove Last Node");
		System.out.println("6.Remove Node at specified Position");
		System.out.println("7.Count No of Nodes");
		System.out.println("8.Display");
		System.out.println("9.Exit");
		System.out.println("Enter a option:");
		int op=scan.nextInt();
		switch(op)
		{
		 case 1:
			  System.out.println("Enter data to a node:");
		      data=scan.nextInt();
			  list.addNodeToFirst(data);
			  break;
		 case 2:
				System.out.println("Enter data to a node:");
				data=scan.nextInt();
				list.addNodeToLast(data);
				break;
		 case 3:
			    System.out.println("Enter the position to insert:");
			    pos=scan.nextInt();
			    System.out.println("Enter data to a node:");
				data=scan.nextInt();
				System.out.println("Enter after which node you want to insert:");
				item=scan.nextInt();
				Node node=new Node(item);
				list.addNodeToPos(node,data);
				break;
		 case 4:
			    item=list.deleteFirstNode();
			    System.out.println("First Node with value "+item+" deleted successfully");
			    break;
		 case 5:
			   item=list.deleteLastNode();
			   System.out.println("First Node with value "+item+" deleted successfully");
			   break;
		 case 6:
			   System.out.println("Enter after which node you want to insert:");
			   item=scan.nextInt();
				Node after=new Node(item);
			   item=list.deleteSpecifiedNode(after);
			   System.out.println("First Node with value "+item+" deleted successfully");
			   break;
		 case 7:
			   int count=list.CountNodes();
			   System.out.println("No of Nodes are:"+count);
			   break;
		 case 8:
			   System.out.println("Elements in the linked List are:");
			   list.display();
			   break;
		 case 9:
			   System.exit(0);
		 default:
			   System.out.println("Invalid Input,Please Try Again");
		}
	  }

  }
}
