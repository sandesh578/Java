import java.util.Scanner;
public class interchange_neighbour {

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
		for(int i=0;i<arr.length;i+=2)
		{
			if(i+1>=arr.length)
			{
				break;
			}
			else
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println("Sorted array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
