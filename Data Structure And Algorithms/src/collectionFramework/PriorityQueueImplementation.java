package collectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueImplementation {

	public static void main(String[] args) {
		//Priority Queue having priority of lower element
		//MinHeap
		PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(5);
        p.add(9);
        p.add(1);
        p.add(4);
        p.add(3);
        p.add(23);
        p.offer(17);
        
        System.out.println(p.peek());
        System.out.println(p.poll());
        
        System.out.println();
        p.forEach((x)->{
        	System.out.print(x+" ");
        });
        System.out.println();
	}

}
