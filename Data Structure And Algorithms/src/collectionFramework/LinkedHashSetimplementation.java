package collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetimplementation {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(6);
		lhs.add(9);
		lhs.add(2);
		lhs.add(7);
		lhs.add(6);
		
		//maintains order of insertion
		System.out.println(lhs);
		
		System.out.println(lhs.contains(5));
		
		Iterator<Integer> it=lhs.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
