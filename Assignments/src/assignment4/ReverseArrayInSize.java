package assignment4;

import java.util.Scanner;

public class ReverseArrayInSize {

	public static void reverse(int []arr,int start,int end) {
		for(int i=start,j=end;i!=j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println("Elements in an array after reversal are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int k;
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the size to reverse:");
		k=scan.nextInt();
		System.out.println("Elements in an array after reversal are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<n;i+=k) {
			reverse(arr,i,i+3);
		}
        scan.close();
	}

}
