package SortingTechniques;

import java.util.Scanner;

public class InsertionSortImplementation {
	
	public static void InsertionSort(int arr[]) {
		int n=arr.length,j;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			j=i-1;
		    while(j>=0&&arr[j]>key) {
		    	arr[j+1]=arr[j];
		    	j--;
		    }
		    arr[j+1]=key;
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
		InsertionSort(arr);
		scan.close();

	}

}
