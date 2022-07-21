package collectionFramework;

import java.util.ArrayDeque;
import java.util.Iterator;

//ArrayDeque takes constant time
class Stack{
	ArrayDeque<Integer> s;
	public Stack() {
		s=new ArrayDeque<>();
	}
	
	public void push(int val) {
		s.addLast(val);
		s.offerLast(val);
	}
	
	public void pop() {
		s.pollLast();
		s.removeLast();
	}
	
	public int peek() {
		int val;
		val=s.peek();
		val=s.getLast();
		return val;
	}
	
	public Boolean isEmpty() {
		return s.isEmpty();
	}
	
	public void display() {
		System.out.println("Elements in stack are:");
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
}

public class StackUsingArrayDeque {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(5);
		s.push(1);
		s.push(7);
		s.push(9);
		s.push(2);
		s.push(6);
        
		s.display();
		
		s.pop();
		
		s.pop();
		
		s.display();
		
		System.out.println(s.peek());
		
		System.out.println(s.isEmpty());

	}

}
