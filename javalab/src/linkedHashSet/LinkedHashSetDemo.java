package linkedHashSet;

import java.util.LinkedHashSet;

//maintains order of insertion of element
//value is only stored
//it is not sorted like hash set
//used hashing technique internally
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> ls=new LinkedHashSet<>(10);
		ls.add("Sandesh");
		ls.add("Parajuli");
		ls.add("Sangam");
		ls.add("Giri");
		ls.add("Sandesh");//not inserted as it is repeated
		
		ls.forEach(n->System.out.println(n));

	}

}
