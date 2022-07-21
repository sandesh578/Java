package assignment4;

import java.util.Scanner;
class Find{
	public int arr[],n;
	public Find(int []arr,int n) {
		this.arr=arr;
		this.n=n;
	}
	public void display(int start,int end) {
		int k=0,x=end-start;
		int find[]=new int[x];
		for(int i=start;i<=end;i++) {
			int flag=0;
			for(int j=0;j<n;j++) {
				if(arr[j]==i) {
					flag=1;
				}
			}
			if(flag==0) {
				find[k]=i;
				k++;
			}
		}
		x=k;
		
		System.out.println("Missing elements in array are:")
;		for(int i=0;i<x;i++) {
			System.out.println(find[i]+" ");
		}
	}
	
}

public class MissingElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int start,end;
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the starting range:");
		start=scan.nextInt();
		System.out.println("Enter the ending range:");
		end=scan.nextInt();
		Find a=new Find(arr,n);
		a.display(start,end);
		scan.close();

	}

}
