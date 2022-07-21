package lab10;
import java.util.Scanner;

class Stack{
	int n;
	int top=-1;
	int[] stack;
	public Stack(int size) {
		this.n=size;
		stack=new int[n];
	}
	public void push(int data) 
	{
		if(top==n-1)
		{
			System.out.println("Stack is full");
		}
		top=top+1;
		stack[top]=data;
	}
	public int pop() 
	{
		int item;
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		item=stack[top];
		top=top-1;
		return item;	
	}
	public int peek(){
	   if(top==-1)
	   {
		   System.out.println("Stack is empty");
		   return 0;
	   }
	   else
	   {
		   return stack[top];
	   }
	}
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		System.out.println("Elements in the stack are:");
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}
}
public class StackImplementation {

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of stack:");
		int n=scan.nextInt();
		Stack s=new Stack(n);
		while(true)
		{
		System.out.println("Enter the option:");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		System.out.println("4.Peek");
		System.out.println("5.isEmpty");
		System.out.println("6.Exit");	
		int op=scan.nextInt();
		switch(op)
		{
		  case 1:
			  System.out.println("Enter data to push:");
			  int data=scan.nextInt();
			  s.push(data);
			  break;
		  case 2:
			    System.out.println("Popped data is:"+s.pop());
			    break;
		  case 3:
				s.display();
				break;
		  case 4:
				System.out.println("Top data of stack is:"+s.peek());
				break;
		  case 5:
				System.out.println("Stack is Empty or Not:"+s.isEmpty());
				break;
		  case 6:
				System.exit(0);
		  default:
				System.out.println("Invalid Input");
		}
	}
	}

}
