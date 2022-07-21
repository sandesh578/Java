package collectionFramework;

import java.util.TreeSet;

public class TreeSetImplementation {

	public static void main(String[] args) {
		//Duplicates are not allowed
		//Elements are in sorted order
		TreeSet<Integer> hs=new TreeSet<>();
		hs.add(5);
		hs.add(89);
		hs.add(15);
		hs.add(7);
		hs.add(5);
		hs.add(10);
		hs.add(22);
		
		System.out.println(hs.last());
		System.out.println(hs.first());
		
		System.out.println(hs.ceiling(10));
		System.out.println(hs.ceiling(11));
		
		System.out.println(hs);
		System.out.println(hs.contains(15));
		
		System.out.println();
		hs.forEach((x)->{
			System.out.print(x+" ");
		});
		

	}

}
