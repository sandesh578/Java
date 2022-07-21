package collectionFramework;

import java.util.HashSet;

public class HashSetImplementation {

	public static void main(String[] args) {
		//Duplicates are not allowed
		HashSet<Integer> hs=new HashSet<>();
		hs.add(5);
		hs.add(89);
		hs.add(15);
		hs.add(7);
		hs.add(5);
		hs.add(10);
		hs.add(22);
		
		System.out.println(hs);
		System.out.println(hs.contains(15));
		
		System.out.println();
		hs.forEach((x)->{
			System.out.print(x+" ");
		});
		

	}

}
