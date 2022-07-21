package singleLinkedList;
import java.util.Scanner;

class ReverseList{
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
	
	public void Reverse() {
		if(head==null) {
			System.out.println("LinkedList is empty");
		}else {
			Node temp=null;
			Node p=null;
			Node curr=head;
			while(curr!=null) {
				temp=p;
				p=curr;
				curr=curr.next;
				p.next=temp;
			}
			head=p;
		}
	}
	
	public void ReverseUsingArray() {
		if(head==null) {
			System.out.println("LinkedList is empty");
		}else {
			int n=0,i=0;
			Node temp=head;
			while(temp!=null) {
				n++;
				temp=temp.next;
			}
			int arr[]=new int[n];
			temp=head;
			while(temp!=null) {
				arr[i++]=temp.data;
				temp=temp.next;
			}
			temp=head;
			while(temp!=null) {
				temp.data=arr[--n];
				temp=temp.next;
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
public class ReverseALinkedList {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ReverseList list=new ReverseList();
		System.out.println("Enter the no of elements:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" elements to linkedlist:");
		for(int i=0;i<n;i++) {
			list.Insert(scan.nextInt());
		}
	    list.ReverseUsingArray();
	    list.Reverse();
		list.Display();
	    scan.close();

	}

}
