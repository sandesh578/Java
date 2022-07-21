package singleLinkedList;
import java.util.Scanner;

class SortedLinkedListOrNot{
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
	
	public Boolean IsSorted() {
		if(head==null) {
			System.out.println("Linkedlist is empty");
			return false;
		}else if(head.next==null) {
			return true;
		}
		else {
			Node temp=head;
			Node p=null;
			while(temp!=null&&temp.next!=null) {
				p=temp;
				temp=temp.next;
				if((temp.data-p.data)<0) {
					return false;
				}
			}
			return true;
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
public class CheckingIsLinkedListIsSorted {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		SortedLinkedListOrNot list=new SortedLinkedListOrNot();
		System.out.println("Enter the no of elements:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" elements to linkedlist:");
		for(int i=0;i<n;i++) {
			list.Insert(scan.nextInt());
		}
		Boolean check=list.IsSorted();
		if(check) {
			System.out.println("List is sorted");
		}else {
			System.out.println("List is not sorted");
		}
		list.Display();
	    scan.close();

	}

}
