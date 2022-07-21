package SortingTechniques;

import java.util.Scanner;

public class CountSortImplementation {
	public static int findMax(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void CountSort(int arr[]) {
		int count[]=new int[findMax(arr)+1];
		for(int i=0;i<count.length;i++) {
			count[i]=0;
		}
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		int i=0,j=0;
		while(i<(findMax(arr)+1)) {
			if(count[i]==0) {
				i++;
			}else {
				arr[j++]=i;
				count[i]--;
			}
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
		CountSort(arr);
		System.out.println("Elements in an merged array are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();

	}

}
