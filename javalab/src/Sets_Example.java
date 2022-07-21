import java.util.HashSet;
//Set cannot contain duplicate elements
public class Sets_Example {

	public static void main(String[] args) {
	 HashSet<Integer> set=new HashSet<Integer>();
	 set.add(5);
	 set.add(4);
	 set.add(3);
	 set.add(2);
	 set.add(1);
	 set.add(0);
	 System.out.println("Size of set:"+set.size());
     System.out.println(set);
     set.remove(4);
     System.out.println(set);
	}

}
