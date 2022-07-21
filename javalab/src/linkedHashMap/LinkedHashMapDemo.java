package linkedHashMap;

import java.util.LinkedHashMap;
//50% of space most be consumed and 50% most be left empty for better performance
//it uses key value pair
//it maintains order in which keys are inserted
//it has link to previous and next node
//a%n==5 it will be placed at position  5 if that is already filled it will be inserted to 6 and same
//if empty space is found the value is not there
//if size is limited it will delete the key i the position if that is already filled
//least acessed key are shown at last 
//most accesses key are shown at first
//it takes constant time-o(1)
//get,put,remove
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lm=new LinkedHashMap<>(5,0.75f,true);//(size,loadfactor,recent/order of access)
				/*remove the eldest entry
				 * {
			       protected boolean removeEldestEntry(Map.Entry e)//least recently used is removed
			       {
			    	   return size()>5;
			       }
				};*/
        lm.put(1,"A");
        lm.put(2,"B");
        lm.put(3,"C");
        lm.put(4,"D");
        lm.put(5,"E");
        String s=lm.get(5);
        lm.put(6,"F");
        
        System.out.println(lm.get(2));//string
        lm.forEach((k,v)->System.out.println(k+" "+v));
	}

}
