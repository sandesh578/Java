package singleLinkedList;

import java.util.Scanner;

class Concat{
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
	  }
	}
	
	
}

public class ConcatTwoLinkedList {
	
    public static void main(String []args) {
    	Scanner scan=new Scanner(System.in);
		Concat list1=new Concat();
		System.out.println("Enter the no of elements in list1:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" elements to linkedlist1:");
		for(int i=0;i<n;i++) {
			list1.Insert(scan.nextInt());
		}
		list1.Display();
		Concat list2=new Concat();
		System.out.println("Enter the no of elements in list2:");
		int n1=scan.nextInt();
		System.out.println("Enter "+n+" elements to linkedlist2:");
		for(int i=0;i<n1;i++) {
			list2.Insert(scan.nextInt());
		}
		list2.Display();
	    scan.close();
    }
}
