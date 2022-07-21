package stack;
import java.util.Scanner;

class St{
    int arr[];
	int top=-1,MAX=10;
	St(){
		arr=new int[MAX];
	}
	
	public void push(int val) {
		if(top==MAX) {
			System.out.println("Stack is empty");
		}else {
			top=top+1;
			arr[top]=val;
		}
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return 0;
		}else {
			//System.out.println(arr[top]+" is popped out.");
			int val=arr[top];
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
	
	public int peek() {
		if(top==-1){
			System.out.println("Stack is empty");
			return 0;
		}else{
				return arr[top];
		}
	}
	
	public void operate(char ch) {
		int p=pop();
		int q=pop();
		int val=0;
		if(ch=='+') {
			val=p+q;
			push(val);
		}else if(ch=='-') {
			val=q-p;
			push(val);
		}else if(ch=='/') {
			val=q/p;
			push(val);
		}else if(ch=='*') {
			val=q*p;
			push(val);
		}else if(ch=='%') {
			val=q%p;
			push(val);
		}
	}
	
	public int Evaluate(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=48&&ch<=57) {
				push(Character.getNumericValue(ch));
			}
			if(ch=='+'||ch=='-'||ch=='/'||ch=='*'||ch=='%') {
				operate(ch);
			}
		}
		return peek();
	}
}


public class EvaluationOfPostFix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		St s=new St();
		System.out.println("Enter a string:");
		String str=scan.next();
		System.out.println("Output of evaluation of postfix expression "+str+" is: "+s.Evaluate(str));
		scan.close();

	}

}
