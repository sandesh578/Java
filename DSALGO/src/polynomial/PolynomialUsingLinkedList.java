package polynomial;
import java.util.Scanner;

class Node{
	int coeff;
	int exp;
	Node next;
	Node(){
	}
	Node(int coeff,int exp){
		this.coeff=coeff;
		this.exp=exp;
		this.next=null;
	}
}

class Polynomial{
	Node head=null;
	
	public void Insert(int coeff,int exp) {
		Node newNode=new Node(coeff,exp);
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			temp=newNode;
		}
	}
	
	public int Evaluate(int x) {
		if(head==null) {
			System.out.println("Polynomial is empty");
			return -1;
		}else {
			Node temp=head;
			int val=0;
			while(temp!=null) {
				val+=temp.coeff*Math.pow(x,temp.exp);
				temp=temp.next;
			}
			return val;
		}
	}
	
	public void display() {
		if(head==null) {
			System.out.println("Polynomial is empty");
		}else {
			Node temp=head;
			System.out.println("The polynomial is:");
			while(temp!=null) {
				System.out.print(temp.coeff+"x^"+temp.exp+"+");
				temp=temp.next;
			}
		}
	}
	
}

public class PolynomialUsingLinkedList {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=scan.nextInt();
		Polynomial p=new Polynomial();
		for(int i=0;i<n;i++) {
			System.out.print("Enter coefficient for exponent "+i+": ");
			p.Insert(scan.nextInt(),i);
		}
		p.display();
		System.out.println("Enter the value of x to evaluate:");
		int x=scan.nextInt();
		System.out.println("\nThe evaluate value of polynomial when x is "+x+" is: "+p.Evaluate(x));
		scan.close();

	}

}
