package array;

import java.util.Scanner;

public class KadanesAlgorithm {
	
	public static int LongestSumContinguousSubArray(int []arr) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum<arr[i]) {
				sum=arr[i];
			}
			if(max<sum) {
				max=sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1;
		System.out.println("Enter the size of one array:");
		n1=scan.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter "+n1+" elements to an array");
		for(int i=0;i<n1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Maximum sum of contiguous sub array is:"+LongestSumContinguousSubArray(arr1));
		scan.close();

	}

}
