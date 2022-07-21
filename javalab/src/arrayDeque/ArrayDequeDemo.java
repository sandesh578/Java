package arrayDeque;
//ArrayDeque performs operation in constant time
import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> c1=new ArrayDeque<>();
		c1.push(1);
		c1.push(2);
		c1.push(3);
		c1.push(4);
		c1.push(5);
		//c1.removeFirst();
		//c1.removeLast();
		System.out.println(c1.pop());
		c1.offerLast(45);//add elements at last
		c1.pollLast();//removes last
		c1.pollFirst();//removes first
		System.out.println(c1.getFirst());
		System.out.println(c1.peekFirst());//returns first
		System.out.println(c1.getLast());
		System.out.println(c1.peekLast());//returns last element
       
		ArrayDeque<Integer> c2=new ArrayDeque<>();
		c2.offerFirst(11);
		c2.offerFirst(12);
		c2.offerFirst(13);
		c2.offerFirst(14);
		c2.offerFirst(15);
        c2.offerFirst(16);//inserts at first but if not possible return null
        c2.addFirst(17);//inserts at first but if not possible throws exception
        c2.forEach(n->System.out.print(n+" "));
        System.out.println();
     
		c1.addAll(c2);
		//c1.remove(6);
		//c1.removeAll(c2);
		//c1.addAll(c2);
		//c1.retainAll(c2);//deletes element of c1 and keep/retain elements of c2
		//c1.clear();
		System.out.println(c1.isEmpty());
		System.out.println(c1.size());
		System.out.println(c1.contains(5));
		System.out.println(c1.containsAll(c2));
		System.out.println(c1.equals(c2));
		c1.toArray();
		System.out.println(c1);
	}

}
