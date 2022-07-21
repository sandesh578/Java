package singleLinkedList;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
	public Node()
	{
		//this.data=data;
		this.next=null;
	}
}
class LinkedList{
	Node head;
	public void insertAtLast(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(this.head==null)
		{
			this.head=node;
		}
		else
		{
			Node curr=this.head;
			while(curr!=null)
			{
				curr=curr.next;
			}
			curr.next=node;
		}
	}
	public void insertAtFirst(int data)
	{
		Node first=new Node();
		first.data=data;
		first.next=null;
		if(this.head==null)
		{
			this.head=first;
		}
		first.next=this.head;
		head=first;
	}
	public void show()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class SingleLinkedListDemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		Scanner scan=new Scanner(System.in);
		//System.out.println("Enter a option:");
		list.insertAtLast(5);
		list.insertAtLast(6);
		list.insertAtLast(7);
		list.insertAtLast(8);
		list.insertAtLast(9);
		list.show();
        scan.close();
	}

}
