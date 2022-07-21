package SortingTechniques;

import java.util.Scanner;

public class QuickSortImplementation {
	
	public static int Partition(int arr[],int low,int high) {
		int pivot=arr[low];
		int i=low;
		int j=high;
		do {
			do {
				i++;
			}while(arr[i]<=pivot);
			do {
				j--;
			}while(arr[j]>pivot);
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}while(i<j);
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
	    return j;
	}
	
	public static void QuickSort(int arr[],int low,int high) {
		if(low<high) {
			int j=Partition(arr,low,high);
			QuickSort(arr,low,j);
			QuickSort(arr,j+1,high);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		QuickSort(arr,0,n-1);
		System.out.println("Elements in an sorted array are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();

	}

}
