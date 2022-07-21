package stack;
import java.util.Scanner;

class Stak{
	char arr[];
	int top=-1,MAX=10;
	Stak(){
		arr=new char[MAX];
	}
	
	public void push(char val) {
		if(top==MAX) {
			System.out.println("Stack is empty");
		}else {
			top=top+1;
			arr[top]=val;
		}
	}
	
	public char pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return 0;
		}else {
			//System.out.println(arr[top]+" is popped out.");
			char val=arr[top];
			top=top-1;
			return val;
		}
	}
	
	public Boolean isEmpty() {
		return top==-1?true:false;
	}
	
	public Boolean isFull() {
		return top==MAX?true:false;
	}
	
	public char peek() {
		if(top==-1){
			System.out.println("Stack is empty");
			return 0;
		}else{
				return arr[top];
		}
	}
	
	public String reverse(String str) {
		String st="";
		for(int i=0;i<str.length();i++) {
			push(str.charAt(i));
		}
		while(!isEmpty()) {
			st+=pop();
		}
		return st;
	}
}


public class ReverseAString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Stak s=new Stak();
		System.out.println("Enter a string:");
		String str=scan.next();
		System.out.println("Reverse of string "+str+" is: "+s.reverse(str));
		scan.close();

	}

}
