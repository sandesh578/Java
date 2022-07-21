package SortingTechniques;

import java.util.Scanner;

public class SelectionSortImplementation {
	
	public static void SelectionSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int min=i;
		    for(int j=i+1;j<n;j++) {
		    	if(arr[j]<arr[min]) {
		    		min=j;
		    	}
		    }
		    int temp=arr[min];
		    arr[min]=arr[i];
		    arr[i]=temp;
		}
		
		System.out.println("Elements in an sorted array are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
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
		SelectionSort(arr);
		scan.close();

	}

}
