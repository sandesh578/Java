import java.util.Scanner;
public class evenorodd {

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
        for(int i=0;i<n;i++)
        {
        	if(num[i]%2==0)
        	{
        		System.out.println("Even");
        	}
        	else
        	{
        		System.out.println("Odd");
        	}
        }
		scanner.close();

	}

}
