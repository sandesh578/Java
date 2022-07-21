package treeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
//constant time can be gauranteed using red map or avl tree
//map are used to store key value pair
//maintains in sorted order
//uses red map tree
//logn time for execution
public class TreeMapImplementation {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
		
		System.out.println(tm);
		tm.put(4,"E");
		tm.put(5,"F");
		
		System.out.println(tm);
		System.out.println(tm.ceilingEntry(5).getValue());
		
		Entry<Integer,String> e=tm.firstEntry();
		System.out.println(e.getValue());
		System.out.println(tm.lastEntry());
		System.out.println(tm.get(3));
		System.out.println(tm.get(3));
	}

}
