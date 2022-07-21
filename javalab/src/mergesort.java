import java.util.Scanner;
public class mergesort {
	public static void merge(int arr[],int low,int mid,int high)
	{
		int j=0;
		int n=high-low+1;
		while(low<=mid&&mid<=high)
		{
			if(arr[low]<arr[mid])
			{
				arr[i]=arr[]
			}
		}
	}
	public static void Mergesort(int arr[],int low,int high)
	{
		if(low==high)
		{
			return;
		}
		else
		{
			int mid=(low+high)/2;
			Mergesort(arr,low,mid);
			Mergesort(arr,mid+1,high);
			Mergesort(arr,low,mid);
			merge(arr,low,mid,high);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of items:");
		int n =sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Mergesort(arr,0,n-1);
		sc.close();

	}

}
