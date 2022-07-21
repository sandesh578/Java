import java.util.Scanner;
public class reverse_array_recursion {
	public static void reverseArray(int arr[],int low,int high){
		if(low<high)
		{
			int temp=arr[low];
			arr[high]=arr[high];
			arr[high]=temp;
			reverseArray(arr,low+1,high-1);
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
        reverseArray(arr,0,n-1);
        System.out.println("Elements in an array are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
