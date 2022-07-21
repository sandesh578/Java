import java.util.Scanner;
public class sortenterednumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=scanner.nextInt();
		int[] num=new int[n];
		System.out.println("Enter the number to array:");
        for(int i=0;i<n;i++)
        {
        	num[i]=scanner.nextInt();	
        }
        int min=0;
        for(int i=0;i<n;i++)
        {
        	if(min>num[i])
        	{
        		min=num[i];
        	}
        }
        System.out.println("Data in the sorted order are:");
        for(int i=0;i<n;i++)
        {
        	System.out.println(num[i]);	
        }
		scanner.close();

	}

}
