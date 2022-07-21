package array;

import java.util.Scanner;

public class FindMissingElementInASortedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int missing=0,sum=0,diff=arr[0]-0;
		
		for(int i=1;i<n;i++) {
			if((arr[i]-arr[i-1])>1) {
				missing=arr[i-1]+1;
			}
		}
		
		for(int i=0;i<n;i++) {
			if((arr[i]-i)!=diff) {
				System.out.println("Missing element in a sorted array is: "+ (i+diff));
				break;
			}
		}
		
		System.out.println("Missing element in a sorted array is: "+missing);
		
		//natural numbers
//		for(int i=0;i<n-1;i++) {
//			sum=sum+arr[i];
//		}
//		System.out.println("Missing element in a sorted array is: "+(((n*(n+1))/2)-sum));
		scan.close();

	}

}
