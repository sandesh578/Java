package hashSet;

import java.util.HashSet;

//it has constant time of execution
//best loading factor is 25%-empty spaces
public class HashSetDemo {

	public static void main(String[] args) {
		//by default initial capicity is 16
		HashSet<Integer> hs=new HashSet<>(20,0.75f);//first is capacity and next is loading factor
        hs.add(1);
        hs.add(22);
        hs.add(3);
        hs.add(45);
        hs.add(5);
        
        hs.forEach((n)->System.out.print(n+" "));
	}

}
