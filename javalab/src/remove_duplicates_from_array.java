import java.util.Scanner;
public class remove_duplicates_from_array {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of data:");
		int n=scanner.nextInt();
		int[] num=new int[n];
		System.out.println("Enter a data to number array:");
		for(int i=0;i<n;i++)
		{
			num[i]=scanner.nextInt();
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			for(int k=i+1;k<n;i++)
			{
				if(num[i]!=num[k])
				{
					temp[j++]=num[i];
				}	
			}
		}
		temp[j++]=num[n-1];
		for(int i=0;i<j;i++)
		{
			num[i]=temp[i];
		}
		System.out.println("After removal of duplicates from an  array:");
		for(int i=0;i<j;i++)
		{
			System.out.println(num[i]);
		}
		scanner.close();

	}

}
