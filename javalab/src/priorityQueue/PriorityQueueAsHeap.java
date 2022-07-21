package priorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

//time taken -logn
//PriorityQueue uses heap data structure
class MyCom implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		if(o1<o2)
		{
			return 1;
		}
		if(o1>o2)
		{
			return -1;
		}
		return 0;
	}
}

public class PriorityQueueAsHeap {

	public static void main(String[] args){
		PriorityQueue<Integer> p=new PriorityQueue<>(new MyCom());
        p.add(5);
        p.add(12);
        p.add(18);
        p.add(19);
        p.offer(3);
        p.offer(60);
        
        System.out.println(p.element());//gives head element
        System.out.println(p.peek());
        System.out.println(p.poll());
        
        for(Iterator<Integer> it=p.iterator();it.hasNext();)
        {
        	System.out.println(it.next()+" ");
        }
	}

}
