import java.util.Scanner;
public class check_duplicate_input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		boolean isDuplicate=false;
		System.out.println("Enter "+n+" numbers to an array:");
		arr[0]=sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			arr[i]=sc.nextInt();
			for(int j=0;j<i;j++)
			{
				if(arr[j]==arr[i])
				{
					isDuplicate=true;
				}
			}
			if(isDuplicate)
			{
				System.out.println(arr[i]+" is already entered, Enter a next unique number");
				i--;
				isDuplicate=false;
			}
		}
		System.out.println("Data in array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
