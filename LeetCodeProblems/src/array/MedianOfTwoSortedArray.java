package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianOfTwoSortedArray {
	public static void MedianOfTwoArray(int arr1[],int arr2[]) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			list.add(arr1[i]);
		}
		for(int i=0;i<arr1.length;i++) {
			list.add(arr2[i]);
		}
		Collections.sort(list);
		
		int length=list.size();
		if(length%2!=0) {
			System.out.println("Median of sorted array is: "+list.get((int)Math.floor(length/2)));
		}else {
			System.out.println("Median of sorted array is: "+(list.get(length/2)+list.get((length/2)+1))/2);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the size of one array:");
		n1=scan.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter "+n1+" elements to an array");
		for(int i=0;i<n1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter the size of another array:");
		n2=scan.nextInt();
		int arr2[]=new int[n2];
		System.out.println("Enter "+n2+" elements to an array");
		for(int i=0;i<n2;i++) {
			arr2[i]=scan.nextInt();
		}
		MedianOfTwoArray(arr1,arr2);
		scan.close();

	}

}
