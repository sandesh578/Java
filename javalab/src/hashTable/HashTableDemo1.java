package hashTable;

import java.util.Hashtable;

//it is  generic
//it treats key and value as objects
public class HashTableDemo1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"A");
        ht.put(3,"C");
        ht.put(4,"D");
        
       // String s=(String)ht.get(3);//typecast is required because in hashtable key value is stored in form of object
        
        ht.compute(2,(k,v)->v+"Z");//concatenation
        
        ht.computeIfAbsent(5,(k)->k+"Z");
        
        System.out.println(ht);
       
	}
}
