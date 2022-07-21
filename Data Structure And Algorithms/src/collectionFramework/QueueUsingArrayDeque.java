package collectionFramework;

import java.util.ArrayDeque;
import java.util.Iterator;

//ArrayDeque takes constant time for insertion and deletion
class Queue{
	ArrayDeque<Integer> s;
	public Queue() {
		s=new ArrayDeque<>();
	}
	
	public void Enqueue(int val) {
		s.addLast(val);
		s.offerLast(val);
	}
	
	public void Dequeue() {
		s.pollFirst();
		s.removeFirst();
	}
	
	public int peek() {
		int val;
		val=s.peekFirst();
		val=s.getFirst();
		return val;
	}
	
	public Boolean isEmpty() {
		return s.isEmpty();
	}
	
	public void display() {
		System.out.println("Elements in queue are:");
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
}

public class QueueUsingArrayDeque {

	public static void main(String[] args) {
		Queue s=new Queue();
		s.Enqueue(5);
		s.Enqueue(1);
		s.Enqueue(7);
		s.Enqueue(9);
		s.Enqueue(2);
		s.Enqueue(6);
        
		s.display();
		
		s.Dequeue();
		
		s.Dequeue();
		
		s.display();
		
		System.out.println(s.peek());
		
		System.out.println(s.isEmpty());

	}

}
