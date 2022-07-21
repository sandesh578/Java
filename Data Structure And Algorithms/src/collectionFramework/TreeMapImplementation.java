package collectionFramework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapImplementation {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>(Map.of(2,"Rahul"));
        tm.put(1,"Sandesh");
        tm.put(4,"Nischit");
        tm.put(5,"Rakesh");
        tm.put(3,"Sangam");
        
        System.out.println(tm.ceilingKey(5));
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastKey());
        System.out.println(tm.values());
        System.out.println(tm.get(3));
        System.out.println(tm.floorEntry(2).getValue());
        System.out.println(tm);
        
        Entry<Integer,String> e=tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
	}

}
