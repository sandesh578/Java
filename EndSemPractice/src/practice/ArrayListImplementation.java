package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class ArrayListImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		
		System.out.println("Enter the size of arrayList:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" elements to list:");
		for(int i=0;i<n;i++)
		{
			list.add(scan.nextInt());
		}
		
		System.out.println("Elements in the arrayList are:\n"+list);
		
		System.out.println("Enter the elements to remove:");
		int rem=scan.nextInt();
		
		list.remove(rem);
		
		System.out.println("Elements in the arrayList after removal of "+rem+" are:\n"+list);
		
		System.out.println("Contains or not: "+list.contains(scan.nextInt()));
		
		Collection<Integer> c=new ArrayList<>();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		System.out.println(list.retainAll(c));
        scan.close();
	}

}
