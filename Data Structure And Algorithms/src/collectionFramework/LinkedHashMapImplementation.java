package collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImplementation {

	public static void main(String[] args) {
		//it is not sorted
		//it will maintain the order based upon access
		//most recently accessed will have last order
		LinkedHashMap<Integer,String> tm=new LinkedHashMap<>(5,0.75f,true) {
			//it won't allow to insert more elements than limit
			//if element is inserted greater than size it will delete first element in order
			@Override
			protected boolean removeEldestEntry(Map.Entry e) {
				return size()>5;
			}
		};
        tm.put(1,"Sandesh");
        tm.put(4,"Nischit");
        tm.put(5,"Rakesh");
        tm.put(3,"Sangam");
        tm.put(2,"Rahul");
        tm.put(9,"Ram");
        
        System.out.println(tm);
        
        System.out.println(tm.get(5));

        tm.forEach((k,v)->{
        	System.out.println(k+" "+v);
        });
	}

}
