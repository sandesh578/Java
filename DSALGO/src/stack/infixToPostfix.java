package stack;
import java.util.Scanner;

class Sk{
	char arr[];
	int top=-1,MAX=10;
	Sk(){
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
	//(((A+B)*C-(D-E))$(F+Z))
	//A/B-C+D*E-A*C
	//a+b*(c^d-e)^(f+g*h)-i
	
	public int prec(char ch) {
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default: 
			return 0;
		}
	}
	
	public String Evaluate(String str) {
		String st="";
		push('(');
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90||ch>=97&&ch<=122){
				st+=ch;
			}
			else if(ch==')') {
				while(!isEmpty()&&peek()!='(') {
					st+=pop();
				}
				pop();
			}
			else if(ch=='(') {
				push(ch);
			}else {
				while(!isEmpty()&&prec(ch)<=prec(peek())) {
					st+=pop();
				}
				push(ch);
			}

		}
		return st;
	}
}


public class infixToPostfix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Sk s=new Sk();
		System.out.println("Enter a string:");
		String str=scan.next();
		System.out.println("Postfix expression of infix expression "+str+" is: "+s.Evaluate(str));
		scan.close();

	}

}
