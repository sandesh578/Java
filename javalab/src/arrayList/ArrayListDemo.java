package arrayList;
//list can have duplicates values
//ordered collection
//index is present
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(1);
		//l1.remove(2);//removes element at index 2
		l1.add(1,10);
		System.out.println(l1);
		System.out.println(l1.subList(2,4));
		System.out.println(l1.indexOf(1));//iterates from first
		System.out.println(l1.lastIndexOf(1));
       
		ArrayList<Integer> l2=new ArrayList<>(List.of(6,7,8,9,10));
//		l2.add(6);
//		l2.add(7);
//		l2.add(8);
//		l2.add(9);
//      l2.add(10);
        System.out.println(l2.get(2));
        l2.set(3,22);
        System.out.println(l2);
        
        l1.addAll(3,l2);
        System.out.println(l1);
     
		//l1.addAll(l2);
		//l1.remove(6);//removes element
		//l1.removeAll(l2);
		//l1.addAll(l2);
		//l1.retainAll(l2);//deletes element of c1 and keep/retain elements of c2
		//l1.clear();
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		System.out.println(l1.contains(5));
		System.out.println(l1.containsAll(l2));
		System.out.println(l1.equals(l2));
		l1.toArray();
		System.out.println(l1);
		
//		for(int i=0;i<l1.size();i++)
//		{
//			System.out.print(l1.get(i)+" ");
//		}
		
		/*
		for(var i:l1)//var can also be used
		{
			System.out.print(i+" ");
		}
		System.out.println();
		l1.forEach((x)->{
			System.out.print(x+" ");
		});
		
		//iterator allows unidirectional access
		Iterator<Integer> it=l1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
		//list iterator also contains previousIndex(),hasPrevious(),previous()
		//list iterator allows bidirectional access
		ListIterator<Integer> li=l1.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		
		
		l2.forEach((n)->System.out::println);
		
		*/
		for(ListIterator<Integer> li=l1.listIterator();li.hasNext();)
		{
			System.out.print(li.next()+" ");
		}
	}

}
