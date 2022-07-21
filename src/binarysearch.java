import java.util.Scanner;
public class binarysearch {
	public static void binsearch(int first,int last,int[] num,int search)
	{
		int mid;
		int flag=0;
		for(int i=0;i<(last+1);i++)
		{
			mid=(first+last)/2;
			if(search==num[mid])
			{
				flag=1;
				break;
			}
			else if(search<num[mid])
			{
				binsearch(first,mid-1,num,search);
			}
			else
			{
				binsearch(mid+1,last,num,search);
			}
		}	
		if(flag==1)
		{
			System.out.println("Item is found");
		}
		else
		{
			System.out.println("Item is not found");
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=scanner.nextInt();
		int[] num=new int[n];
		System.out.println("Enter the data to an array:");
		for(int i=0;i<n;i++)
		{
			num[i]=scanner.nextInt();
		}
		int first=0;
		int last=n-1;
		System.out.println("Enter the item to search:");
		int search=scanner.nextInt();
        binsearch(first,last,num,search);
        scanner.close();
	}

}
