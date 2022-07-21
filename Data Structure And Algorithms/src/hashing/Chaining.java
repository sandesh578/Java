package hashing;
import java.util.Scanner;

class Node{
	public int data;
	public Node next;
	public Node() {
		
	}
	public Node(int val) {
		this.data=val;
		this.next=null;
	}
}

class Chain{
	public Node HT[];
	int n=10;
	public Chain() {
		HT=new Node[10];
		for(int i=0;i<10;i++) {
			HT[i]=null;
		}
	}
	
	public int hash(int val) {
		return val%10;
	}
	
	public void sortedInsert(int val) {
		int index=hash(val);
		Node head=HT[index];
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			Node p=null;
			while(temp!=null&&temp.data<val) {
				p=temp;
				temp=temp.next;
			}
			if(temp==head) {
				newNode.next=head;
				head=newNode;
			}else {
				newNode.next=temp.next;
				temp.next=newNode;
			}
			
		}
	}
	
	public void Delete(int key) {
		int index=hash(key);
		Node head=HT[index];
		if(head==null) {
			System.out.println("No element found to delete:");
		}else {
			while(head.data==key) {
				head=head.next;
			}
			Node temp=head;
			Node p=null;
			while(temp!=null) {
				p=temp;
				temp=temp.next;
				if(temp.data==key) {
					p.next=temp.next;
				}
			}
			
		}
	}
	
	public Boolean search(int key) {
		int index=hash(key);
		Node temp=HT[index];
		while(temp!=null) {
			if(temp.data==key) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	public void Display() {
		for(int i=0;i<n;i++) {
			Node temp=HT[i];
			System.out.print("Node "+i+" - ");
			while(temp!=null){
				System.out.print(temp.data+"->");
				temp=temp.next;
			};
			System.out.println();
		}
	}
}

public class Chaining {
    public static void main(String args[]) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the number ofitems to insert :");
    	int n=scan.nextInt();
    	Chain c=new Chain();
    	System.out.println("Enter "+n+" elements :");
    	for(int i=0;i<n;i++) {
    		c.sortedInsert(scan.nextInt());
    	}
    	c.Display();
    	System.out.println("Enter the element to search:");
    	int search=scan.nextInt();
    	Boolean check=c.search(search);
    	if(check) {
    		System.out.println("Element is found");
    	}else {
    		System.out.println("Element not found");
    	}
    	System.out.println("Enter the item to delete:");
    	int del=scan.nextInt();
    	c.Delete(del);
    	scan.close();
    }
}
