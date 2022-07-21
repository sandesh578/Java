import java.util.Scanner;
class Node{
	public int data;
	public Node next;
	public Node(int val) {
		this.data=val;
		this.next=null;
	}
	public int getData() {
		return this.data;
	}
}

class LinkedList{
	public Node head=null;
	public void addElementAtLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}else {
			Node currNode=head;
			while(currNode.next!=null) {
				currNode=currNode.next;
			}
			currNode.next=newNode;
		}
	}
	
	public void addElementAtFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void display() {
		if(head==null) {
			System.out.println("Linked List is empty.");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.getData()+" -> ");
				temp=temp.next;
			}
		}
	}
	
	public String Number() {
		String str="";
		Node temp=head;
		while(temp!=null) {
			str+=temp.data;
			temp=temp.next;
		}
		return str;
	}
	
}

public class AddTwoNUmbers {
	
	public static String Reverse(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
	
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode prev = new ListNode(0);
//        ListNode head = prev;
//        int carry = 0;
//        while (l1 != null || l2 != null || carry != 0) {
//            ListNode cur = new ListNode(0);
//            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
//            cur.val = sum % 10;
//            carry = sum / 10;
//            prev.next = cur;
//            prev = cur;
//            
//            l1 = (l1 == null) ? l1 : l1.next;
//            l2 = (l2 == null) ? l2 : l2.next;
//        }
//        return head.next;
//    }
	
	public static LinkedList addTwoNumbers(LinkedList list1,LinkedList list2) {
		LinkedList dummyList=new LinkedList();
		
		String num=Reverse(String.valueOf(Integer.parseInt(Reverse(list1.Number()))+Integer.parseInt(Reverse(list2.Number()))));
		int n=Integer.parseInt(num);
		
		while(n!=0) {
			dummyList.addElementAtFirst(n%10);
			n=n/10;
		}
		
		return dummyList;
	}

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println((int)Math.pow(-2,31));
		LinkedList list1=new LinkedList();
		LinkedList list2=new LinkedList();
		LinkedList list3;
		int n1,n2;
		System.out.println("Enter the number of elements in linked list 1:");
		n1=scan.nextInt();
		System.out.println("Enter "+n1+" elements to an linked list 1");
		for(int i=0;i<n1;i++) {
			list1.addElementAtFirst(scan.nextInt());
		}
		System.out.println("Enter the number of elements in linked list 2:");
		n2=scan.nextInt();
		System.out.println("Enter "+n2+" elements to an linked list 1");
		for(int i=0;i<n1;i++) {
			list2.addElementAtFirst(scan.nextInt());
		}
		System.out.println("\nElements of linked list 1 are");
		list1.display();
		System.out.println("\nElements of linked list 2 are");
		list2.display();
		list3=addTwoNumbers(list1,list2);
		System.out.println("\nElements of linked list after addition are");
		list3.display();
		scan.close();

	}

}
