package singleLinkedList;
import java.util.Scanner;

class Node{
	public int data;
	public Node next;
	Node(){
		
	}
	Node(int val){
		this.data=val;
		this.next=null;
	}
}

class LinkedList{
	public Node head=null;
	public void InsertAtFirst(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	public int ImproveLSearch(int val) {
		if(head==null) {
			System.out.println("LinkedList is empty");
			return -1;
		}else {
			Node q=null;
			Node p=head;
			while(p!=null) {
				if(p.data==val) {
					q.next=p.next;
					p.next=head;
					head=p;
					return 1;
				}else{
				  q=p;
				  p=p.next;
				}
			}
			return -1;
		}
		
	}
	
	public void InsertAtLast(int val) {
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
	public void InsertAtPos(int val,int pos) {
			Node newNode=new Node(val);
			int count=1;
			if(head==null) {
				System.out.println("LinkedList is empty");
			}else {
				Node temp=head;
				while(temp.next!=null&&count<pos-1) {
					temp=temp.next;
					count++;
				}
				Node inter=temp.next;
				temp.next=newNode;
				newNode.next=inter;
			}
	}

	public void DeleteAtFirst() {
		if(head==null) {
			System.out.println("LinkedList is empty");
		}else if(head.next==null){
			head=null;
		}else {
			head=head.next;
		}
	}
	
	public void DeleteAtLast() {
		if(head==null) {
			System.out.println("LinkedList is Empty");
		}else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
		}
	}
	
	public void DeleteAtPos(int pos) {
		int count=1;
		if(head==null) {
			System.out.println("LinkedList is empty");
		}else {
			Node temp=head;
			while(temp.next!=null&&count<pos-1) {
				count++;
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
	}
	
	public void Display() {
	  if(head==null) {
		  System.out.println("LinkedList is Empty");
	  }else {
		  Node temp=head;
		  while(temp!=null) {
			  System.out.print(temp.data+" -> ");
			  temp=temp.next;
		  }
		  System.out.println();
	  }
	}
	
	public int search(int val) {
		if(head==null) {
			return -1;
		}else {
			Node temp=head;
			int count=1;
			while(temp!=null) {
				if(temp.data==val) {
					return count;
				}
				temp=temp.next;
				count++;
			}
			return -1;
		}
	}
	
	public void reverse() {
		Node temp=null;
		Node prev=null;
		Node current=head;
		while(current!=null) {
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		head=prev;
		
	}
	
	public boolean checkPalindrome() {
		if(head==null) {
			System.out.printf("Linked list is empty");
			return false;
		}else {
			Node temp=head;
			StringBuilder sb1=new StringBuilder();
			while(temp!=null) {
				sb1.append(String.valueOf(temp.data));
				temp=temp.next;
			}
			String str=sb1.toString();
			sb1.reverse();
			return str.equals(sb1.toString());
		}
	}
	
	public void sortAscending() {
		if(head==null) {
			System.out.println("Linked List is empty");
		}else {
			Node temp=head;
			Node p=null;
			while(temp!=null) {
				p=temp.next;
				while(p!=null) {
					if(p.data<temp.data) {
						int val=p.data;
						p.data=temp.data;
						temp.data=val;
					}
					p=p.next;
				}
				temp=temp.next;
			}
		}
	}
	
	public void sortDescending() {
		if(head==null) {
			System.out.println("Linked List is empty");
		}else {
			Node temp=head;
			Node p=null;
			while(temp!=null) {
				p=temp.next;
				while(p!=null) {
					if(p.data>temp.data) {
						int val=p.data;
						p.data=temp.data;
						temp.data=val;
					}
					p=p.next;
				}
				temp=temp.next;
			}
		}
	}
	
}
public class SingleLinkedListImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int opt;
		LinkedList list=new LinkedList();
		while(true) {
			System.out.println("Choose the option:");
			System.out.println("1.Insert at first:");
			System.out.println("2.Insert at last:");
			System.out.println("3.Insert at pos:");
			System.out.println("4.Delete at first:");
			System.out.println("5.Delete at last:");
			System.out.println("6.Delete at pos:");
			System.out.println("7.Display");
			System.out.println("8.Search");
			System.out.println("9.Check For Palindrome");
			System.out.println("10.Reverse");
			System.out.println("11.Sort in Ascending Order");
			System.out.println("12.Sort in Descending Order");
			System.out.println("13.Exit");
			opt=scan.nextInt();
			switch(opt) {
			case 1:
				System.out.println("Enter the element to insert:");
				list.InsertAtFirst(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter the element to insert:");
				list.InsertAtLast(scan.nextInt());
				break;
			case 3:
				System.out.println("Enter the element to insert and its position:");
				int val=scan.nextInt();
				int pos=scan.nextInt();
				list.InsertAtPos(val,pos);
				break;
			case 4:
				list.DeleteAtFirst();
				break;
			case 5:
				list.DeleteAtLast();
				break;
			case 6:
				System.out.println("Enter the position to delete:");
				list.DeleteAtPos(scan.nextInt());
				break;
			case 7:
				System.out.println("Elements in the list are:");
				list.Display();
				break;
				
			case 8:
				System.out.println("Enter the element to search:");
//				int position=list.search(scan.nextInt());
				int position=list.ImproveLSearch(scan.nextInt());
				if(position==-1) {
					System.out.println("Element not found");
				}else {
					System.out.println("Element found at position "+position);
				}
				break;
				
			case 9:
				boolean p=list.checkPalindrome();
				if(p) {
					System.out.println("Linked list is palindrome");
				}else {
					System.out.println("Linked list is not palindrome");
				}
				break;
				
			case 10:
				list.reverse();
				break;
				
			case 11:
				list.sortAscending();
				break;
				
			case 12:
				list.sortDescending();
				break;
				
			case 13:
				System.out.println("Exiting ...");
				System.exit(0);
				break;
				
		  default:
			  System.out.println("Invald Option");
			  break;
			}
		}

	}

}
