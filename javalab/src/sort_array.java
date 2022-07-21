import java.util.Arrays;
import java.util.Scanner;
public class sort_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(+arr[i]);
		}
		sc.close();

	}

}
