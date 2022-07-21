package quickSort;

import java.util.Scanner;
public class QuickSortImplementation {
	 public static void QuickSort(int arr[],int low,int high)
	 {
		  int k;
		  if(low<high)
		  {
			  k=partition(arr,low,high);
			  QuickSort(arr,low,k);
			  QuickSort(arr,k+1,high);
		  }
	 }
	 public static int partition(int arr[],int low,int high)
	 {
		  int pivot=arr[low];
		  int i=low,j=high;
		  while(i<j)
		  {
			  do
			  {
				  i++;
			  }while(arr[i]<=pivot);
			  
			  do
			  {
				  j--;
			  }while(arr[j]>pivot);
			  
			  if(i<j)
			  {
				swap(arr[i],arr[j]);
			  }
		  }
		  swap(arr[i],arr[j]);
		  return j;
	 }
	 public static void swap(int x,int y)
	 {
		 int temp=x;
		 x=y;
		 y=temp;
	 }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		int []arr=new int[n];
		int low,high;
		
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		low=0;
		high=n-1;
		QuickSort(arr,low,high);
		
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		scan.close();

	}

}