package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		LinkedList<Integer> ll=new LinkedList<>(List.of(22,45,78));
		al.add(5);
		al.add(7);
		al.add(1);
		al.add(3);
		al.add(13);
		al.remove(1);
		System.out.println("Is Empty: "+al.isEmpty());
		System.out.println("Size: "+al.size());
		System.out.println(al.subList(1,4));
		System.out.println(al);
		
		for(var x:ll) {
			System.out.print(x+" ");
		}
		
		ll.removeFirst();
		ll.removeLast();
		
		ll.addFirst(19);//adds element at first 
		ll.addLast(77);//adds element at last
		
		ll.push(5);//inserts at first
		
		ll.pop();//removes first
		
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
		System.out.println("\n"+ll);
		
	}
	

}
