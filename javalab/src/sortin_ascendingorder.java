import java.util.Scanner;
class sortin_ascendingorder {

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
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
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
