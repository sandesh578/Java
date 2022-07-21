package hashTable;

import java.util.Enumeration;
import java.util.Hashtable;
//old class not used today
//it is not generic
//it treats key and value as objects
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
        ht.put(1,"A");
        ht.put(2,"A");
        ht.put(3,"C");
        ht.put(4,"D");
        
        String s=(String)ht.get(3);//typecast is required because in hashtable key value is stored in form of object
        
        Enumeration e=ht.elements();
        while(e.hasMoreElements())
        {
        	System.out.println(e.nextElement());
        }
        
        //System.out.println(ht);
       
	}

}
