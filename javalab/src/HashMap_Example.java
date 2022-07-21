import java.util.HashMap;
//HashMap cannot contain duplicate keys
public class HashMap_Example {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		//key,values pair
		h.put(1,"Red");
		h.put(2,"Blue");
		h.put(3,"Green");
		h.put(4,"Yellow");
		h.put(5,"Grey");
        System.out.println(h);
        System.out.println(h.get(5));
        System.out.println(h.get(2));
        h.remove(3,"Green");
        System.out.println(h);
        System.out.println(h.get(3));//the value is already deleted
	}

}
