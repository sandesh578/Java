package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MergeTwoSortedArray {
	
	public static void mergeTwoArrayInUsingList(int []arr,int arr1[]) {
		List<Integer> s=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		for(int i=0;i<arr1.length;i++) {
			s.add(arr1[i]);
		}
		Collections.sort(s);
		
		System.out.println("\nElements in array:");
		Iterator<Integer> it= s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void mergeTwoArrayIntoThird(int []arr,int arr1[]) {
		int p=0,i=0,j=0,n1=arr.length,n2=arr1.length;
		int arr2[]=new int[n1+n2];
		
		while(i<n1&&j<n2) {
			if(arr[i]<arr1[j]) {
				arr2[p++]=arr[i++];
			}else {
				arr2[p++]=arr1[j++];
			}
		}
		
		while(i<n1) {
			arr2[p++]=arr[i++];
		}
		
		while(j<n2) {
			arr2[p++]=arr1[j++];
		}
	
	  System.out.println("\nElements in array:");
	  for( i=0;i<arr2.length;i++) {
		  System.out.print(arr2[i]+" ");
	  }
		
	}
	
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void mergeTwoArrayWithoutExtraSpace(int arr[],int arr1[]) {
		int i,j;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>arr1[0]) {
				swap(arr[i],arr1[0]);
				j=0;
				while(j+1<arr1.length&&arr1[j]>arr1[j+1]) {
					swap(arr1[j],arr1[j+1]);
					j++;s
				}
			}
		}
	 System.out.println("\nElements in array:");
	  for( i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+" ");
	  }
	  System.out.println("\nElements in array 1:");
	  for( i=0;i<arr1.length;i++) {
		  System.out.print(arr1[i]+" ");
	  }
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the size of array 1:");
		n1=scan.nextInt();
		System.out.println("Enter the size of array 2:");
		n2=scan.nextInt();
		int arr[]=new int[n1];
		int arr1[]=new int[n1];
		System.out.println("Enter "+n1+" elements to an array 1:");
		for(int i=0;i<n1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter "+n2+" elements to an array 2:");
		for(int j=0;j<n2;j++) {
			arr1[j]=scan.nextInt();
		}
		mergeTwoArrayInUsingList(arr,arr1);
		mergeTwoArrayIntoThird(arr,arr1);
		mergeTwoArrayWithoutExtraSpace(arr,arr1);
		scan.close();

	}

}
