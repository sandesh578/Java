package collectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableImplementaion {

	public static void main(String[] args) {
		//this is a legacy class
		//Hashtable tm=new Hashtable(); //old version
		Hashtable<Integer,String> tm=new Hashtable<>();
		
        tm.put(1,"Sandesh");
        tm.put(4,"Nischit");
        tm.put(5,"Rakesh");
        tm.put(3,"Sangam");
        
        String st=(String)tm.get(3);
        System.out.println(st);
        
        Enumeration e=tm.keys();//tm.elements();
        while(e.hasMoreElements()) {
        	System.out.print(e.nextElement()+" ");
        }
        
        //changes the existing value of key
        tm.compute(4,(k,v)->v+"iwa");
        //inserts new key with computed value
        tm.computeIfAbsent(2,(k)->k+"hi");
        
        System.out.println();
        System.out.println(tm);
	}

}
