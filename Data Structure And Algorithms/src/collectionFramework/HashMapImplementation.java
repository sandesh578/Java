package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

	public static void main(String[] args) {
		HashMap<Integer,String> tm=new HashMap<>(Map.of(2,"Rahul"));
        tm.put(1,"Sandesh");
        tm.put(4,"Nischit");
        tm.put(5,"Rakesh");
        tm.put(3,"Sangam");
        
        System.out.println(tm);
	}

}
