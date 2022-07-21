import java.util.Scanner;
public class frequencyofgiven_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int search,count=0;
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the data to check occurance:");
		search=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				count=count+1;
			}
		}
		System.out.println(search+" is repeated "+count+" times.");
		sc.close();
	}

}
