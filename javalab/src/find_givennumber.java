import java.util.Scanner;
public class find_givennumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int search,flag=0;
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the data to search:");
		search=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println(search+" is found");
		}
		else
		{
			System.out.println(search+" is not found");
		}
		sc.close();

	}

}
