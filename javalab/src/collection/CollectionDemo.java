package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
       
		Collection<Integer> c2=new ArrayList<>();
		c2.add(6);
		c2.add(7);
		c2.add(8);
		c2.add(9);
        c2.add(10);
     
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
