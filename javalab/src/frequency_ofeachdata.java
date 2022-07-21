import java.util.Arrays;
import java.util.Scanner;
public class frequency_ofeachdata {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count;
		boolean visited[]=new boolean[n];
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.fill(visited,false);
		for(int i=0;i<n;i++)
		{
			if(visited[i]==true)
			{
				continue;
			}
            count=1;
		    for(int j=i+1;j<n;j++)
		    {
			   if(arr[i]==arr[j])
			   {
				visited[j]=true;
				count++;
			   }
		    }
			System.out.println(+arr[i]+" is repeated "+count+" times");
		}
		sc.close();

	}

}
