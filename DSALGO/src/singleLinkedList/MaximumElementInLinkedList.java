package singleLinkedList;
import java.util.Scanner;

class SingleList{
	public Node head=null;	
	public void Insert(int val) {
		Node newNode=new Node(val);
		Node temp=head;
		if(head==null) {
			head=newNode;
		}else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	public int Maximum() {
		if(head==null) {
			  System.out.println("LinkedList is Empty");
			  return -1;
		  }else {
			  Node temp=head;
              int max=Integer.MIN_VALUE;
			  while(temp!=null) {
				  if(temp.data>max) {
					  max=temp.data;
				  }
				  temp=temp.next;
			  }
			  return max;
		  }
	}
	
	public void Display() {
	  if(head==null) {
		  System.out.println("LinkedList is Empty");
	  }else {
		  Node temp=head;
		  System.out.println("Elements in the linked list are:");
		  while(temp!=null) {
			  System.out.print(temp.data+" -> ");
			  temp=temp.next;
		  }
		  System.out.println();
		  System.out.println("Elements in the list are:");
		  RDisplay(head);
	  }
	}
	
	public Node RDisplay(Node temp) {
		if(temp==null) {
			return null;
		}else {
			//System.out.println(temp.data);
			RDisplay(temp.next);
			System.out.println(temp.data);//prints in reverse
		}
		return null;
	}
	
}
public class MaximumElementInLinkedList {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		SingleList list=new SingleList();
		System.out.println("Enter the no of elements:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" elements to linkedlist:");
		for(int i=0;i<n;i++) {
			list.Insert(scan.nextInt());
		}
		list.Display();
		System.out.println("Maximum elements in linkedList is:- "+list.Maximum());
	    scan.close();

	}

}
