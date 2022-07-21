package SortingTechniques;

import java.util.Scanner;

public class IterativeMergeSort {
	
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
	
	public static void MergeSort(int arr[]) {
		int p,i,mid,h,l;
		for(p=2;p<=arr.length;p*=2) {
			for(i=0;i+p-1<arr.length;i=i+p) {
				l=i;
				h=i+p-1;
				mid=(l+h)/2;
				Merge(arr,l,h,mid);
			}
		}
		if(p/2<arr.length) {
			Merge(arr,0,arr.length-1,p/2);
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
		MergeSort(arr);
		System.out.println("Elements in an merged array are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();

	}

}
