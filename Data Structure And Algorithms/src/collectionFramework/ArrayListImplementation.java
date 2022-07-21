package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListImplementation {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>(20);//size assigned to arraylist
		al.add(5);
		al.add(7);
		al.add(1);
		al.add(3);
		al.add(13);
		al.add(2,10);
		al.remove(1);//removes element at index 1
		System.out.println("Is Empty: "+al.isEmpty());
		System.out.println("Size: "+al.size());
		System.out.println(al.subList(1,4));//gives the sublist from index 1 to 3
		System.out.println(al);
		
		ArrayList<Integer> al1=new ArrayList<>(20);
		al1.add(16);
		al1.add(2);
		al1.add(6);
		al1.add(8);
		al1.add(3);
		System.out.println(al1.get(2));
		System.out.println(al1);
		
		al1.set(3,12);
		System.out.println(al1.contains(6));
		System.out.println(al1.indexOf(2));
		
		System.out.println(al1);
		//al.addAll(al1); //adds elements of al1 at last
		al.addAll(2,al1);//adds elements of al1 to al at index 2
		
		System.out.println(al.equals(al1));
		System.out.println(al.lastIndexOf(3));
		
		System.out.println(al);
		
		//for each loop
		for(var x:al) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		//iterator
		//Iterator<Integer> it=al.iterator();
		Iterator<Integer> it=al.listIterator();//bidirectional access
		while(it.hasNext()) {
			Integer x=it.next();
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		//forEach - lambda Expression
		al.forEach((x)->{
			System.out.print(x+" ");
		});
		
		System.out.println();
		al.forEach(System.out::println);
		
		System.out.println();
		al.forEach((x)->show(x));
		
		System.out.println();
		
		ArrayList<Integer> al2=new ArrayList<>(List.of(3,5,6,7,9));
		System.out.println(al2);
	}
	
	static void show(int n) {
		if(n>5) {
			System.out.print(n+" ");
		}
	}

}
