package SortingTechniques;

import java.util.Scanner;

public class MergingTwoSortedArrays {
	
	public static int[] Merge(int arr[],int arr1[]) {
		int arr3[]=new int[arr.length+arr1.length];
		int i=0,j=0,k=0;
		while(i<arr.length&&j<arr1.length) {
			if(arr[i]<arr1[j]) {
				arr3[k++]=arr[i++];
			}else {
				arr3[k++]=arr1[j++];
			}
		}
		
		for(;i<arr.length;i++) {
			arr3[k++]=arr[i];
		}
		
		for(;j<arr1.length;j++) {
			arr3[k++]=arr1[j];
		}
		return arr3;
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in array1 :");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to an array1:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the number of elements in array2 :");
		int n1=scan.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter "+n1+" elements to an array2:");
		for(int i=0;i<n1;i++) {
			arr1[i]=scan.nextInt();
		}
		int arr2[]=Merge(arr,arr1);
		System.out.println("Elements in an merged array are:");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		scan.close();

	}

}
