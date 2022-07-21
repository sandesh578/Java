import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of data you want to enter:");
			int n=scanner.nextInt();
			int[] num;
			int flag=0;
			num=new int[n];
			System.out.println("Enter the data to an array:");
			for(int i=0;i<n;i++)
			{
				num[i]=scanner.nextInt();
			}
			System.out.println("Enter the item to search:");
			int search=scanner.nextInt();
			for(int i=0;i<n;i++)
			{
				if(search==num[i])
				{
					flag=1;
				}	
			}
			if(flag==1)
			{
				System.out.println("Searched item is found at position ");
			}
			else
			{
				System.out.println("Searched item is not found");
			}
			scanner.close();

	}

}
