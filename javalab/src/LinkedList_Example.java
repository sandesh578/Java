import java.util.LinkedList;
//linked list is used when we want to make large number of insertion and deletion
public class LinkedList_Example {

	public static void main(String[] args) {
		LinkedList<String> o=new LinkedList<String>();
		o.add("Sandesh");
		o.add("Sangam");
		o.add("Nischit");
	    o.add("Pratik");
		o.add("Krishna");
        System.out.println(o);
        o.remove("Pratik");
        System.out.println(o);
	}

}
