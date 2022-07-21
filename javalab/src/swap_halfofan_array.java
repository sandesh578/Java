import java.util.Scanner;
public class swap_halfofan_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int temp=0;
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=arr.length-1;
		for(int i=0;i<(arr.length)/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[k-i];
			arr[k-i]=temp;
		}
		/*for(int i=0,j=arr.length-1;j>=i;i++,j--)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}*/
		System.out.println("Sorted array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
