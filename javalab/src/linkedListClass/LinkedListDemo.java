package linkedListClass;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> c1=new LinkedList<>();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		c1.addFirst(0);
		c1.addLast(100);
		c1.forEach(n->System.out.print(n +" "));
		
		System.out.println();
       
		LinkedList<Integer> c2=new LinkedList<>();
		c2.add(6);
		c2.add(7);
		c2.add(8);
		c2.add(9);
        c2.add(10);
        //c2.removeFirst();
        //c2.removeLast();
        c2.poll();//remove first
        System.out.println(c2.peek());
        c2.forEach(n->System.out.print(n +" "));
        System.out.println();
		
		
     
		c1.addAll(c2);
		//c1.remove(6);
		//c1.removeAll(c2);
		//c1.addAll(c2);
		//c1.retainAll(c2);//deletes element of c1 and keep/retain elements of c2
		//c1.clear();
		System.out.println(c1.isEmpty());
		System.out.println(c1.size());
		System.out.println(c1.contains(5));
		System.out.println(c1.containsAll(c2));
		System.out.println(c1.equals(c2));
		c1.toArray();
		System.out.println(c1);
	}

}
