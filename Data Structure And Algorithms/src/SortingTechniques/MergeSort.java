package SortingTechniques;

import java.util.Scanner;

public class MergeSort {
	
	public static void Merge(int arr[],int low,int high,int mid) {
		int arr3[]=new int[arr.length];
		int i=low,j=mid+1,k=low;
		while(i<=mid&&j<=high) {
			if(arr[i]<arr[j]) {
				arr3[k++]=arr[i++];
			}else {
				arr3[k++]=arr[j++];
			}
		}
		
		for(;i<=mid;i++) {
			arr3[k++]=arr[i];
		}
		
		for(;j<=high;j++) {
			arr3[k++]=arr[j];
		}
		
		for(int x=low;x<=high;x++) {
			arr[x]=arr3[x];
		}
	}
	
	public static void MergeSort(int arr[],int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			MergeSort(arr,low,mid);
			MergeSort(arr,mid+1,high);
			Merge(arr,low,high,mid);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in array :");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		MergeSort(arr,0,n-1);
		System.out.println("Elements in an merged array are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();

	}

}
