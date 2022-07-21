package singleLinkedList;
import java.util.Scanner;

class Duplicates{
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
	
	public void RemoveDuplicates() {
		if(head==null) {
			System.out.println("LinkedList is empty");
		}else {
			Node temp=head;
			Node p=null;
			while(temp!=null&&temp.next!=null) {
				p=temp;
				temp=temp.next;
				if(p.data==temp.data) {
					p.next=temp.next;
					temp=temp.next;
				}
			}
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
public class RemoveDuplicatesFromLinkedList {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Duplicates list=new Duplicates();
		System.out.println("Enter the no of elements:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" elements to linkedlist:");
		for(int i=0;i<n;i++) {
			list.Insert(scan.nextInt());
		}
	    list.RemoveDuplicates();
		list.Display();
	    scan.close();

	}

}
