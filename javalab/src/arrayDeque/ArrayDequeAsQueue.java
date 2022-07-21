package arrayDeque;
//Queue-FIFO(First In First Last)
import java.util.ArrayDeque;

public class ArrayDequeAsQueue {

	public static void main(String[] args) {
		ArrayDeque<Integer> st=new ArrayDeque<>();
		st.offerLast(1);
		st.offerLast(2);
		st.offerLast(3);
		st.offerLast(4);
		
		st.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		System.out.println(st.pollFirst());
		System.out.println(st.pollFirst());
		System.out.println(st.pop());
		
	}

}
