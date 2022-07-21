package stack;
import java.util.Scanner;

class Stk{
	char arr[];
	int top=-1,MAX=10;
	Stk(){
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
	
	public Boolean checkForBalancedParenthesis(String str) {
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='('||c=='{'||c=='[') {
				push(c);
			}
			if(c==')'||c=='}'||c==']') {
				char val=peek();
				if(val=='('&&c==')'||val=='{'&&c=='}'||val=='['&&c==']') {
					pop();
				}else {
					push(c);
				}
			}
		}
		return isEmpty()?true:false;
	}
}


public class BalanceParenthesis {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Stk s=new Stk();
		System.out.println("Enter a string:");
		String str=scan.next();
		Boolean test=s.checkForBalancedParenthesis(str);
		if(test) {
			System.out.println("Parenthesis are balanced");
		}else {
			System.out.println("Parenthesis are not balanced");
		}
		System.out.println("Reverse of string "+str+" is: "+s.reverse(str));
		scan.close();

	}

}
