package comparator;

import java.util.Arrays;
import java.util.Comparator;
class MyCom implements Comparator<Integer>{
	public int compare(Integer i1,Integer i2)
	{
		if(i1>i2)
		{
			return -1;
		}
		else if(i1<i2)
		{
			return 1;
		}
		return 0;
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,1,3,5,7};
		int b[]= {2,4,6,8,3,5,7};
        
		//int x[]=Arrays.copyOf(a,4);
		//Arrays.fill(x,10);
		Arrays.sort(a);
		for(var n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(a,4));//for binary search array must be sorted
		//System.out.println(Arrays.compare(a,b));//compare elements and elements
		//System.out.println(a.equals(b));
		
		Integer m[]= {2,4,6,8,3,5,7};
		Arrays.sort(m,new MyCom());
		for(var n:m)
		{
			System.out.print(n+" ");
		}
	}

}
