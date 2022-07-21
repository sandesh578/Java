package singleLinkedList;
import java.util.Scanner;

class SingleLinkedList{
	public Node head=null;	
	public void Insert(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}else if(val<head.data){
			newNode.next=head;
			head=newNode;
		}
		else {
			Node temp=head;
			Node p=null;
			while(temp!=null&&temp.data<val) {
				p=temp;
				temp=temp.next;
			}
			p.next=newNode;
			newNode.next=temp;
		}
	}
	
	public void delete(int val) {
		if(head==null) {
			System.out.println("Linkedlist is empty");
		}
		else {
			Node temp=head;
			Node p=null;
			while(temp!=null&&temp.data!=val) {
				p=temp;
				temp=temp.next;
			}
			if(temp==head) {
			  head=head.next;
			}else {
				p.next=temp.next;
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
public class InsertInASortedLinkedList {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		SingleLinkedList list=new SingleLinkedList();
		System.out.println("Enter the no of elements:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" elements to linkedlist:");
		for(int i=0;i<n;i++) {
			list.Insert(scan.nextInt());
		}
		System.out.println("Enter the data to delete:");
		int dat=scan.nextInt();
		list.Display();
		list.delete(dat);
		list.Display();
	    scan.close();

	}

}
