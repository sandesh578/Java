package treeSet;

import java.util.List;
import java.util.TreeSet;

//only unique elements are allowed
//logn
//elements are sorted

public class TreeSetDemo {

	public static void main(String[] args) {
		//can use reference of SortedSet,Collection
		TreeSet<Integer> hs=new TreeSet<>(List.of(88,23,12,65,90));
        hs.add(45);
        hs.add(5);
        System.out.println(hs.ceiling(56));
        System.out.println(hs.floor(36));
        hs.forEach((n)->System.out.print(n+" "));
	}

}
