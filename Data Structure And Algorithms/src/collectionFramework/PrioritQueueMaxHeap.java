package collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer n1,Integer n2) {
		if(n1>n2) {
			return -1;
		}
		if(n1<n2) {
			return 1;
		}
		return 0;
	}
}

public class PrioritQueueMaxHeap {

	public static void main(String[] args) {
		//Priority Queue having higher priority of large element
		//MaxHeap
		PriorityQueue<Integer> p=new PriorityQueue<>(new MyComparator());
        p.add(5);
        p.add(9);
        p.add(1);
        p.add(4);
        p.add(3);
        p.add(23);
        p.offer(17);
        
        System.out.println(p);
        
        System.out.println(p.peek());
        System.out.println(p.poll());
        
        System.out.println();
        p.forEach((x)->{
        	System.out.print(x+" ");
        });
        System.out.println();
	}

}
